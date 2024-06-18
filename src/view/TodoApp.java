package view;

import services.TodoService;
import utils.Inputs;

public class TodoApp {

    private TodoService service;
    public TodoApp(TodoService service) {
        this.service = service;
    }
    public void showTodo(){
        System.out.println("TODO LIST");
        while(true) {
            service.showTodo();
            System.out.println("MENU");
            System.out.println("1. add todo");
            System.out.println("2. remove todo");
            System.out.println("3. exit");
            var input = Inputs.input("choose todo");

            switch (input) {
                case "1" -> addTodo();
                case "2" -> removeTodo();
                case "3" -> {
                    return;
                }
                default -> System.out.println("your choose not found");
            }
        }
    }
    private void addTodo(){
        System.out.println("VIEW ADD TODO LIST");
        var inputTodo = Inputs.input("add todo (3. if exit)");

        if(inputTodo.equals("3")) {
            return;
        }
        service.addTodo(inputTodo);
    }
    private void removeTodo(){
        System.out.println("REMOVE TODO LIST");
        var id = Inputs.input("remove todo (3. if exit)");

        if(id.equals("3")) {
            return;
        }

        var success = service.removeTodo(Integer.valueOf(id));
        if(!success) {
            System.out.println("failed remove todolist : "+ Integer.valueOf(id));
        }
    }
}
