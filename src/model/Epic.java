package model;

import java.util.ArrayList;
import java.util.List;

public class Epic extends Task {

    List<SubTask> SubTasks = new ArrayList<>();

    public Epic(String name, Status status, String description) {
        super(name, status, description);
    }

    public List<SubTask> getSubTasks() {
        return SubTasks;
    }

    public void addTask(SubTask subTask) {

    }

    public void removeTask(SubTask subTask) {

    }

    public void updateStatus() {
        status = Status.NEW;
    }
}
