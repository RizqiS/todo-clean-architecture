package repository;

import model.TodoModel;

public interface TodoRepo {
    TodoModel[] findAllTodo();
    void addTodo(TodoModel todos);
    boolean deleteTodo(Integer id);
}
