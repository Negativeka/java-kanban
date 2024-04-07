package manager;

import model.Epic;
import model.SubTask;
import model.Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TaskManager {

    private HashMap<Integer, Task> tasks;
    private HashMap<Integer, Epic> epics;
    private HashMap<Integer, SubTask> subTasks;
    private int seq = 0;

    public TaskManager() {
        this.epics = epics;
        this.subTasks = subTasks;
        this.tasks = tasks;
    }

    public Task create(Task task) {
        task.setId(generateId());
        tasks.put(task.getId(), task);
        return task;
    }

    private int generateId() {
        return ++seq;
    }

    public Task get(int id) {
        return tasks.get(id);
    }

    public void update(Task task) {
        tasks.put(task.getId(), task);
    }

    public void updateEpic(Epic epic) {
        Epic saved = epics.get(epic.getId());
        if (saved == null) {
            return;
        }
        saved.setName(epic.getName());
        saved.setDescription(epic.getDescription());
    }

    public void updateSubTask(SubTask subTask) {
        Epic epic = subTask.getEpic();
        Epic savedEpic = epics.get(epic.getId());
        if (savedEpic == null) {
            return;
        }
    }

    public List<Task> getAll() {
        return new ArrayList<>(tasks.values());

    }

    public void delete(int id) {
        tasks.remove(id);

    }

    public void deleteSubTask(int id) {
        SubTask removeSubTask = subTasks.remove(id);
        Epic epic = removeSubTask.getEpic();
        Epic epicSaved = epics.get(epic.getId());
        epicSaved.getSubTasks().remove(removeSubTask);
        calculateStatus(epicSaved);

    }

    private void calculateStatus(Epic epic) {

    }
}
