package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {

    String taskName;
    String color;
    String whatToPaint;
    boolean isExecuted= false;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void executeTask(){
        System.out.println("You are executing painting task: " + taskName);
        isExecuted=true;
    }

    @Override
    public boolean isTaskExecuted(){
        return isExecuted;
    }


}
