package test.services;

import model.TodoModel;
import repository.TodoRepo;
import repository.TodoRepoImp;
import services.TodoService;
import services.TodoServiceImp;

public class TodoTest {
    public static void main(String[] args) {
        removeTodo();
    }
    public static void showTodo() {
        TodoRepoImp todoRepo = new TodoRepoImp();
        TodoService todoService = new TodoServiceImp(todoRepo);

        todoRepo.todo[0] = new TodoModel("belajar java basic");
        todoRepo.todo[1] = new TodoModel("belajar java oop");
        todoService.showTodo();
    }

    public static void addTodo() {
        TodoRepo todoRepo = new TodoRepoImp();
        TodoService service = new TodoServiceImp(todoRepo);

        service.addTodo("Testing 1");
        service.addTodo("Testing 2");
        service.showTodo();
    }

    public static void removeTodo() {
        TodoRepo todoRepo = new TodoRepoImp();
        TodoService service = new TodoServiceImp(todoRepo);

        service.addTodo("Testing 1");
        service.addTodo("Testing 2");
        service.addTodo("Testing 3");
        service.showTodo();

        service.removeTodo(2);
        service.showTodo();
    }
}
