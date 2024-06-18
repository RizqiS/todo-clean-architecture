package model;

public class TodoModel {
    private String todo;
    public TodoModel(){}
    public TodoModel(String todo) {
        this.todo = todo;
    }
    public String getTodo() {
        return todo;
    }
    public void setTodo(String todo) {
        this.todo = todo;
    }
}
