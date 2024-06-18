package services;


public interface TodoService {
    void showTodo();
    void addTodo(String todo);
    boolean removeTodo(Integer id);
}
