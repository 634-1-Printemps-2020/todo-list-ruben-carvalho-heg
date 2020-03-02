package main;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Personne personne = new Personne("Carvalho", "Ruben");

        Activity activity = new Activity(personne);

        Task task1 = new Task("Tache1", new Date(), Stats.open);
        Task task2 = new Task("Tache2", new Date(), Stats.open);

        activity.add(task1);
        activity.add(task2);

        System.out.println(activity.getAllTasksFromActivity());
    }
}
