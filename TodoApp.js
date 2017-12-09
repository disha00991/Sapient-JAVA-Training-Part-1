// Model
class Todo {
    constructor(id, title) {
        this.id = id
        this.title = title;
        this.completed = false
    }
}

//service
const ALL = "all";
const ACTIVE = "active";
const COMPLETED = "completed";

class TodoService {
    constructor() {
        this.todos = [];
    }
    
    addTodo(title) {
        let maxId = this.todos.reduce((id, todo) => id > todo.id ? id : todo.id, 0)
        let newTodo = new Todo(maxId + 1, title);
        this.todos = [...this.todos, newTodo];
    }

    completeTodo(id) {
        this.todos = this.todos.map(todo => todo.id === id ? Object.assign(todo, { completed: true }) : todo);
    }

    deleteTodo(id) {
        this.todos = this.todos.filter(todo => todo.id !== id)
    }

    editTodo(id, title) {
        this.todos = this.todos.map(todo => todo.id === id ? Object.assign(todo, { title }) : todo);
    }

    clearCompleted() {
        this.todos = this.todos.filter(todo => !todo.completed)
    }

    completeAll() {
        let isAllCompleted = this.todos.every(todo => todo.completed);
        this.todos = this.todos.map(todo => {
            todo.completed = !isAllCompleted
            return todo;
        });
    }

    viewAll(filter = 'all') {
        if (filter === ALL) {
            this.todos.forEach(function(todo){
                console.log(todo);
            });
        }

        if (filter === ACTIVE) {
            this.todos.forEach(function(todo){
                if(!todo.completed){
                    console.log(todo);
                }                    
            });
        }

        if (filter === COMPLETED) {
            this.todos.forEach(function(todo){
                if(todo.completed){
                    console.log(todo);
                }             
            });
        }
    }
}
//----------------------------------------------------------
