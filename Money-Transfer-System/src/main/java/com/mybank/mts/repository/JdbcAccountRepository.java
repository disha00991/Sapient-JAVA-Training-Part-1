package com.mybank.mts.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mybank.mts.db.MySqlConnection;
import com.mybank.mts.model.Customer;

public class JdbcAccountRepository implements AccountRepository {

	@Override
	public void save(Customer customer) {
		Connection con = null;
		try {
			con = MySqlConnection.getMySqlconnection();
			String sql = "insert into mybank_transact.customer values(?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, customer.getAcNo());
			ps.setString(2, customer.getName());
			ps.setInt(3, customer.getBalance());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

	@Override
	public Customer find(String acNo) {
		Connection con = null;
		Customer cust = null;
		try {
			String sql = "select * from mybank_transact.customer where acNo=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, acNo);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				cust = new Customer(rs.getString(1), rs.getString(2), rs.getInt(3));
			}
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return cust;
	}

	@Override
	public void update(Customer customer) {
		Connection con = null;
		try {
			con = MySqlConnection.getMySqlconnection();
			String sql = "update mybank_transact.customer set balance=? where acNo=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, customer.getBalance());
			ps.setString(2, customer.getAcNo());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public List<Customer> findAll() {
		List<Customer> allCustomers = new ArrayList<Customer>();
		Connection con = null;
		Customer cust = null;
		try {
			con = MySqlConnection.getMySqlconnection();
			String sql = "select * from mybank_transact";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				cust = new Customer(rs.getString(1), rs.getString(2), rs.getInt(3));
				allCustomers.add(cust);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return allCustomers;
	}

}
