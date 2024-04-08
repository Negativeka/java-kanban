import model.Epic;
import model.Status;
import model.SubTask;
import model.Task;
import manager.TaskManager;

public class Main {
    public static void main(String[] args) {


        TaskManager taskManager = new TaskManager();
        taskManager.create(new Task(1,"Новая задача", Status.NEW, "Тест"));
        taskManager.create(new Task(2,"Задача в процессе", Status.IN_PROGRESS, "Тестирую"));
        taskManager.create(new Task(3,"Задача окончена", Status.DONE, "Даже что-то получилось"));
        taskManager.getAllTasks();
        taskManager.update(new Task(1,"Изменение задачи", Status.DONE, "Вроде получилось"));
        taskManager.getAllTasks();

        taskManager.createEpic(new Epic(4, "Получение по идентефикатору", Status.NEW, "Начало"));
        taskManager.updateEpic(new Epic(5, "Получение по идентефикатору", Status.DONE, "Конец"));
        taskManager.getEpic(4);
        taskManager.getEpic(5);



        taskManager.createSubTask(new SubTask(6, "Удаление по идентификатору ", Status.NEW, "Вжух"));
        taskManager.getAllSubTasks();
        taskManager.deleteSubTask(6);
        taskManager.getAllSubTasks();

       taskManager.clearTask();
       taskManager.clearSubTask();
       taskManager.clearEpic();
    }
}