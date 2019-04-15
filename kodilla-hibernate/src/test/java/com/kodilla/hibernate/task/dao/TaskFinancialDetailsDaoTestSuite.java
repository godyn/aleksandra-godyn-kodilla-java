package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.TaskFinancialDetails;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskFinancialDetailsDaoTestSuite {

    @Autowired
    private TaskFinancialDetailsDao taskFinancialDetailsDao;

    @Test
    public void testFindByPaid(){
        //GIVEN
        TaskFinancialDetails taskFinancialDetails= new TaskFinancialDetails(new BigDecimal(120), true);
        taskFinancialDetailsDao.save(taskFinancialDetails);
        //WHEN
        List<TaskFinancialDetails> resultList= taskFinancialDetailsDao.findByPaid(true);
        //THEN
        Assert.assertEquals(1, resultList.size());
        //CLEAN-UP
        int id= resultList.get(0).getId();
        taskFinancialDetailsDao.deleteById(id);
    }
}
