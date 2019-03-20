package com.kodilla.spring.portfolio;

public class Board {

    public TaskList toDoList;
    public TaskList inProgressList;
    public TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void addTaskToDo(String task){
        toDoList.getTasks().add(task);
    }

    public void addTaskInProgress(String task){
        inProgressList.getTasks().add(task);
    }

    public void addDoneTask(String task){
        doneList.getTasks().add(task);
    }
}
