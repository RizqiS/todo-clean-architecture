import repository.TodoRepo;
import repository.TodoRepoImp;
import services.TodoService;
import services.TodoServiceImp;
import view.TodoApp;

public class Main {
    public static void main(String[] args) {
        TodoRepo todoRepo = new TodoRepoImp();
        TodoService todoService = new TodoServiceImp(todoRepo);
        TodoApp app = new TodoApp(todoService);

        app.showTodo();
    }
}