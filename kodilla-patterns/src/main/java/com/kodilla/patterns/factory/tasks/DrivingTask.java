package com.kodilla.patterns.factory.tasks;


public class DrivingTask implements Task {

    String taskName;
    String where;
    String using;
    boolean isExecuted= false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void executeTask(){
        System.out.println("You are executing driving task: " + taskName);
        isExecuted=true;
    }

    @Override
    public boolean isTaskExecuted(){
        return isExecuted;
    }
}
