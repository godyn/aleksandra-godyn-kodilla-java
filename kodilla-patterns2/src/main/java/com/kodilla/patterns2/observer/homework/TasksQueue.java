package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TasksQueue implements Observable{

    private final String ownerName;
    private final List<Observer> listOfObservers;
    private final List<String> tasksToBeChecked;

    public TasksQueue(String ownerName) {
        this.ownerName = ownerName;
        listOfObservers = new ArrayList<>();
        tasksToBeChecked = new ArrayList<>();
    }

    public void addTask(String task){
        getTasksToBeChecked().add(task);
        notifyObservers();
    }
    @Override
    public void notifyObservers(){
        for(Observer observer: listOfObservers){
            observer.update(this);
        }
    }

    @Override
    public void addObserver(Observer observer){
        listOfObservers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer){
        listOfObservers.remove(observer);
    }

    public String getOwnerName() {
        return ownerName;
    }

    public List<Observer> getListOfObservers() {
        return listOfObservers;
    }

    public List<String> getTasksToBeChecked() {
        return tasksToBeChecked;
    }
}
