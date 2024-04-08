package model;

import java.util.ArrayList;
import java.util.List;

public class Epic extends Task {

    List<SubTask> SubTasks = new ArrayList<>();

    public Epic(int id, String name, Status status, String description) {
        super(id, name, status, description);
    }

    public List<SubTask> getSubTasks() {
        return SubTasks;
    }

    public void updateStatus() {
        status = Status.DONE;
    }

}
