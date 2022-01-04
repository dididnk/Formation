//import {Todo} from './todo';
export class App {
    constructor() {
        this.heading = 'Exercice 2 : TODO';
        this.todos = [];
        this.todoDescription = '';
        this.alert = '';
    }

    addTodo() {
        if (this.todoDescription) {
            this.todos.push({
                description: this.todoDescription,
                done: false
            });
            this.alert = "ajout réussi";
            this.todoDescription = '';
        }
    }

    removeTodo(todo) {
        let index = this.todos.indexOf(todo);
        if (index !== -1) {
        this.todos.splice(index, 1);
        }
    }
}