package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(TasksQueue tasksQueue){
        System.out.println(name + ", you have next task to be checked from " + tasksQueue.getOwnerName() + ". Total tasks in the queue: " + tasksQueue.getTasksToBeChecked().size());
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
