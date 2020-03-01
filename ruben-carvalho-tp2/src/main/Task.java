package main;

import java.util.*;

public class Task {
    private Creator creator;
    private String description;
    private Date date;
    private Stats stats;
    private String solved;
    private Map<Creator, List<Task>> tasks;

    public Task(Creator creator, String description, Date date, Stats stats) {
        this.tasks = new HashMap<>();
        this.creator = creator;
        this.description = description;
        this.date = date;
        this.stats = stats;
        this.solved = "open";
        this.tasks.put(creator, new ArrayList<>());
        this.add(creator);
    }

    private void add(Creator creator) {
        tasks.get(creator).add(this);
    }

    public Map<Creator, List<Task>> getTasks() {
        return tasks;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
        isDone(stats);
    }

    private void isDone(Stats stats) {
        if(stats.name().equals("closed")) {
            this.solved = "done";
        } else if (stats.name().equals("canceled")) {
            this.solved = "ignored";
        }
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Task{" + creator +
                ", " + description +
                ", " + date +
                ", " + stats +
                ", " + solved +
                '}';
    }
}
