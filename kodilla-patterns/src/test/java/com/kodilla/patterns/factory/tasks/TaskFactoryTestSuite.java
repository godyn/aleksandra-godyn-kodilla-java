package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testTaskFactoryShopping(){
        //GIVEN
        TaskFactory taskFactory = new TaskFactory();
        //WHEN
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING);
        shoppingTask.executeTask();
        //THEN
        Assert.assertEquals(true, shoppingTask.isTaskExecuted());
    }

    @Test
    public void testTaskFactoryPainting(){
        //GIVEN
        TaskFactory taskFactory = new TaskFactory();
        //WHEN
        Task shoppingTask = taskFactory.makeTask(TaskFactory.PAINTING);
        shoppingTask.executeTask();
        //THEN
        Assert.assertEquals(true, shoppingTask.isTaskExecuted());
    }

    @Test
    public void testTaskFactoryDriving(){
        //GIVEN
        TaskFactory taskFactory = new TaskFactory();
        //WHEN
        Task shoppingTask = taskFactory.makeTask(TaskFactory.DRIVING);
        shoppingTask.executeTask();
        //THEN
        Assert.assertEquals(true, shoppingTask.isTaskExecuted());
    }
}
