package main;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Creator creator = new Creator("Carvalho", "Ruben");

        Task task1 = new Task(creator, "Tache1", new Date(), Stats.open);

        System.out.println(task1.getTasks());
    }
}
