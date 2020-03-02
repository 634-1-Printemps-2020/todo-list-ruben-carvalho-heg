package test;

import main.*;
import org.junit.Assert;
import org.junit.Test;
import java.util.Date;

public class ActivityTest {

    @Test
    public void getTaskToChange() {
        Personne personne = new Personne("Carvalho", "Ruben");
        Activity activity = new Activity(personne);
        Task task = new Task("Task1", new Date(), Stats.open);
        activity.add(task);
        Assert.assertNotNull(activity.getTaskToChange(personne, task));
    }

    @Test
    public void getAllTasksFromActivity() {
        Activity activity = new Activity(new Personne("Carvalho", "Ruben"));
        Assert.assertNotNull(activity.getAllTasksFromActivity());
    }
}