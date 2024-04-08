package manager;

import model.Epic;
import model.SubTask;
import model.Task;

import java.util.HashMap;


public class TaskManager {

    HashMap<Integer, Task> tasks = new HashMap<>();
    HashMap<Integer, Epic> epics = new HashMap<>();
    HashMap<Integer, SubTask> subTasks = new HashMap<>();

    int seq = 0;

    public int getSeq() {
        return ++seq;
    }

    public void create(Task task) {
        tasks.put(getSeq(), task);
    }

    public void createEpic(Epic epic) {
        epics.put(getSeq(), epic);
    }

    public void createSubTask(SubTask subTask) {
        subTasks.put(getSeq(), subTask);
    }

    public void clearTask() {
        tasks.clear();
    }

    public void clearEpic() {
        epics.clear();
    }

    public void clearSubTask() {
        subTasks.clear();
    }

    public void getAllTasks() {
        System.out.println(tasks);
    }

    public void getAllEpic() {
        System.out.println(epics);
    }

    public void getAllSubTasks() {
        System.out.println(subTasks);
    }

    public void update(Task task) {
        tasks.put(task.getId(), task);
    }

    public void updateEpic(Epic epic) {
        epics.put(getSeq(), epic);
        epic.updateStatus();
    }

    public void updateSubTask(SubTask subTask) {
        subTasks.put(getSeq(), subTask);

    }


    public void delete(int id) {
        tasks.remove(id);

    }

    public void deleteEpic(int id) {
    epics.remove(id);
    }

    public void deleteSubTask(int id) {
        subTasks.remove(id);

    }

    public void getTask(int id) {
        System.out.println(tasks.get(id));
    }

    public void getEpic(int id) {
        System.out.println(epics.get(id));
    }

    public void getSubTask(int id) {
        System.out.println(epics.get(id));
    }
}
