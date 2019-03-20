package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd(){
        //GIVEN
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //WHEN
        board.addTaskToDo("taskNo27");
        board.addTaskInProgress("taskNo21");
        board.addDoneTask("taskNo17");
        //THEN
        System.out.println(board.toDoList.getTasks());
        System.out.println(board.inProgressList.getTasks());
        System.out.println(board.doneList.getTasks());
    }
}
