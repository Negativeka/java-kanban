import model.Status;
import model.Task;
import manager.TaskManager;

public class Main {
    public static void main(String[] args) {


        TaskManager taskManager = new TaskManager();
        Task task = taskManager.create(new Task("Новая задача", Status.NEW, "Описание"));
        System.out.println("Создать задачу: " + task);

        Task taskFromManager = taskManager.get(task.getId());
        System.out.println("Показать задачу: " + taskFromManager);

        taskFromManager.setName("Новое имя");
        taskManager.update(taskFromManager);
        System.out.println("Обновить задачу: " + taskFromManager);

        Task taskUpdated = new Task(taskFromManager.getId(), "Обновить задачу", Status.IN_PROGRESS, taskFromManager.getDescription());
        taskManager.update(taskUpdated);
        System.out.println("Обновление задачи: " + taskFromManager);

        taskManager.delete(taskUpdated.getId());
        System.out.println("Удаление: " + task);

    }
}