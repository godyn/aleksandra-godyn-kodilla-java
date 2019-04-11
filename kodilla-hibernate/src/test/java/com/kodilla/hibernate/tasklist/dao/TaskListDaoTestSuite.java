package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private String listName="ABC";
    private String description = "XYZ";

    @Test
    public void testFindByListName(){
        //GIVEN
        TaskList taskList = new TaskList(listName, description);
        taskListDao.save(taskList);
        String name = taskList.getListName();
        //WHEN
        List<TaskList> readTaskListName = taskListDao.findByListName(name);
        //THEN
        Assert.assertEquals(1, readTaskListName.size());
        //CLEAN-UP
        int id = readTaskListName.get(0).getId();
        taskListDao.deleteById(id);
    }
}
