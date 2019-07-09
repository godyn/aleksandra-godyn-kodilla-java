package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class TasksQueueTestSuit {

    @Test
    public void testTasksQueue(){
        //GIVEN
        TasksQueue annaTaskQueue = new TasksQueue("Anna");
        TasksQueue janTaskQueue = new TasksQueue("Jan");
        Mentor jacekMentor = new Mentor("Jacek");
        Mentor bartekMentor = new Mentor("Bartek");
        annaTaskQueue.addObserver(jacekMentor);
        annaTaskQueue.addObserver(bartekMentor);
        janTaskQueue.addObserver(bartekMentor);
        //WHEN
        annaTaskQueue.addTask("Task 23.1");
        annaTaskQueue.addTask("Task 23.2");
        janTaskQueue.addTask("Task 17.4");
        //THEN
        Assert.assertEquals(3, bartekMentor.getUpdateCount());
        Assert.assertEquals(2, jacekMentor.getUpdateCount());
    }
}
