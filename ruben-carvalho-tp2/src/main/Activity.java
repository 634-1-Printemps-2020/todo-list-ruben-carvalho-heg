package main;

import java.util.*;

public class Activity {
    private Map<Personne, List<Task>> mapTasks;
    private List<Task> tasks;
    private Personne personne;

    public Activity(Personne personne) {
        this.mapTasks = new HashMap<>();
        this.tasks = new ArrayList<>();
        this.personne = personne;
    }

    public void add(Task task) {
        this.tasks.add(task);
        this.mapTasks.put(personne, this.tasks);
    }

    public Task getTaskToChange(Personne personne, Task task) {
        int index = this.mapTasks.get(personne).indexOf(task);
        return this.mapTasks.get(personne).get(index);
    }

    public Map<Personne, List<Task>> getAllTasksFromActivity() {
        return mapTasks;
    }
}
