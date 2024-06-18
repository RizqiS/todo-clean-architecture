package repository;

import model.TodoModel;

public class TodoRepoImp implements TodoRepo{
    public TodoModel[] todo = new TodoModel[10];
    private boolean isFullSize() {
        /* check is todo full or not if pull resize size else not resize*/
        var fullied = true;
        for(var index = 0; index < todo.length; index++) {
            if(todo[index] == null) {
                fullied = false;
                break;
            }
        }
        return  fullied;
    }
    private void resizeSize() {
        if(isFullSize()) {
            var temp = todo;
            todo = new TodoModel[todo.length * 2];
            for(var index = 0; index < temp.length; index++) {
                todo[index] = temp[index];
            }
        }
    }
    @Override
    public TodoModel[] findAllTodo() {
        return todo;
    }
    @Override
    public void addTodo(TodoModel todos) {
        resizeSize();
        for(var index = 0; index < todo.length; index++) {
            if(todo[index] == null) {
                todo[index] = todos;
                return;
            }
        }
    }
    @Override
    public boolean deleteTodo(Integer id) {
        if((id - 1) >= todo.length) {
            return false;
        }
        if(todo[id - 1] == null) {
            return false;
        }

        for(var index = (id - 1); index < todo.length; index++) {
            if(index == (todo.length - 1)) {
                todo[index] = null;
            }else {
                todo[index] = todo[index + 1];
            }
        }

        return true;
    }
}
