package com.kodilla.patterns2.adapter.company;

import com.kodilla.patterns2.adapter.company.oldhrsystem.Workers;
import org.junit.Assert;
import org.junit.Test;

public class SalaryAdapterTestSuite {
    @Test
    public void testTotalSalary(){
        //GIVEN
        Workers workers = new Workers();
        SalaryAdapter salaryAdapter = new SalaryAdapter();
        //WHEN
        double totalSalary = salaryAdapter.totalSalary(workers.getWorkers(), workers.getSalaries());
        //THEN
        System.out.println(totalSalary);
        Assert.assertEquals(30600.00, totalSalary, 0);

    }
}
