package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("List1")
    TaskList toDoList;

    @Autowired
    @Qualifier("List2")
    TaskList inProgressList;

    @Autowired
    @Qualifier("List3")
    TaskList doneList;

    @Bean
    public Board getBoard(){ return new Board(toDoList, inProgressList, doneList); }

    @Bean(name = "List1")
    public TaskList getToDoList(){ return new TaskList();}
    @Bean(name = "List2")
    public TaskList getInProgressList(){ return new TaskList();}
    @Bean(name = "List3")
    public TaskList getDoneList(){ return new TaskList();}
}
