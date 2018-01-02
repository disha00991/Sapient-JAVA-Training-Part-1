package com.mybank.mts.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mybank.mts.model.Customer;
import com.mybank.mts.repository.AccountRepository;
import com.mybank.mts.repository.JdbcAccountRepository;
import com.mybank.mts.service.MyBankService;
import com.mybank.mts.service.MyBankServiceImpl;

@WebServlet(urlPatterns = { "/login", "/service", "/withdraw", "/deposit", "/transfer", "/new-banker",
		"/new-banker-login", "/existing-banker", })
public class MTSController extends HttpServlet {
	private AccountRepository repository;
	private MyBankService service;

	@Override
	public void init(ServletConfig config) throws ServletException {
		repository = new JdbcAccountRepository();
		service = new MyBankServiceImpl();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String reqPath = req.getRequestURI();
		String path = reqPath.substring(reqPath.lastIndexOf("/"));
		req.setAttribute("path", path.substring(1));

		if (path.equals("/service")) {
			req.getRequestDispatcher("services.jsp").forward(req, resp);
		}

		if (path.equals("/new-banker-login")) {
			req.getRequestDispatcher("NewCustomer.jsp").forward(req, resp);
		}

		if (path.equals("/login")) {
			req.getRequestDispatcher("home.jsp").forward(req, resp);
		}

		if (path.equals("/withdraw") || path.equals("/deposit") || path.equals("/transfer")) {
			req.getRequestDispatcher("transact.jsp").forward(req, resp);
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String reqPath = req.getRequestURI();
		String path = reqPath.substring(reqPath.lastIndexOf("/"));

		String name = req.getParameter("name");
		String acNo = req.getParameter("acNo");
		req.setAttribute("name", name);
		req.setAttribute("acNo", acNo);

		Customer customer = null;

		if (path.equals("/new-banker")) {
			String balance = req.getParameter("balance");
			customer = new Customer(name, acNo, Integer.parseInt(balance));
			service.createNewAccount(customer);// exception handling left
			resp.sendRedirect("login?msg=Login to enjoy our Netbanking Services!");
		}

		if (path.equals("/existing-banker")) {
			customer = repository.find(acNo);			
			req.getSession().setAttribute("myCustomer", customer);
			resp.sendRedirect("service?msg=Hi!");
		}

		if (path.equals("/withdraw")) {
				int amount = Integer.parseInt(req.getParameter("amount"));
				customer = (Customer) req.getSession().getAttribute("myCustomer");
				service.withdraw(customer, amount);
				resp.sendRedirect("service?msg=Transaction executed successfully!");
		}

		if (path.equals("/deposit")) {
				int amount = Integer.parseInt(req.getParameter("amount"));
				customer = (Customer) req.getSession().getAttribute("myCustomer");
				service.deposit(customer, amount);
				resp.sendRedirect("service?msg=Transaction executed successfully!");
		}

		if (path.equals("/transfer")) {
				int amount = Integer.parseInt(req.getParameter("amount"));
				customer = (Customer) req.getSession().getAttribute("myCustomer");
				String receiverAcNo = req.getParameter("racNo");
				Customer receiver = repository.find(receiverAcNo);
				service.transfer(customer, receiver, amount);
				String msg = " Money transfered to " + receiver.getName();
				resp.sendRedirect("service?msg=Transaction executed successfully!&extraMsg="+msg);
		}

	}
}
