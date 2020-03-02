package main;

import java.util.*;

public class Task {
    private String description;
    private Date date;
    private Stats stats;
    private String solved;


    public Task(String description, Date date, Stats stats) {
        this.description = description;
        this.date = date;
        this.stats = stats;
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
        return "Task{" + description +
                ", " + date +
                ", " + stats +
                ", " + solved +
                '}';
    }
}
