package services;

import model.TodoModel;
import repository.TodoRepo;

public class TodoServiceImp implements TodoService{

    TodoRepo todoRepo;
    public TodoServiceImp(TodoRepo todoRepo) {
        this.todoRepo = todoRepo;
    }

    @Override
    public void showTodo() {
        System.out.println("SHOW TODOLIST");
        TodoModel[] model = todoRepo.findAllTodo();
        for(int i = 0; i < model.length; i++) {
            TodoModel todo = model[i];
            int no = i + 1;
            if(todo != null) {
                System.out.println(no+ ". " +todo.getTodo());
            }
        }
    }

    @Override
    public void addTodo(String todo) {
        TodoModel todoModel = new TodoModel(todo);
        this.todoRepo.addTodo(todoModel);
    }

    @Override
    public boolean removeTodo(Integer id) {
        boolean isSuccess = todoRepo.deleteTodo(id);
        if(isSuccess) {
            System.out.println("success delete todo "+ id);
        }else {
            System.out.println("failed delete todo " + id);
        }
        return isSuccess;
    }
}
