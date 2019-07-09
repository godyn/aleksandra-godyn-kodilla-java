package com.kodilla.hibernate.manytomany.dao.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import com.kodilla.hibernate.manytomany.facade.EmployeeCompanyFacade;
import com.kodilla.hibernate.manytomany.facade.SearchingException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuit {

    @Autowired
    public EmployeeCompanyFacade employeeCompanyFacade;
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private CompanyDao companyDao;

    @Test
    public void ShouldFindAtLeastTwoEmployees(){
        Employee employee1 = new Employee("Anna", "Kowalska");
        Employee employee2 = new Employee("Wiola", "Masalska");
        employeeDao.save(employee1);
        employeeDao.save(employee2);
        try{
            employeeCompanyFacade.findEmployee("%alsk%");
        }catch(SearchingException e){
        }
        //CLEAN_UP
        employeeDao.delete(employee1);
        employeeDao.delete(employee2);
    }

    @Test
    public void ShouldFindZeroEmployees(){
        try{
            employeeCompanyFacade.findEmployee("%xxxx%");
        }catch(SearchingException e){
        }
    }

    @Test
    public void ShouldFindAtLeastTwoCompanies(){
        Company company1 = new Company("Eco Baker");
        Company company2 = new Company("Eco Cosmetic");
        companyDao.save(company1);
        companyDao.save(company2);
        try{
            employeeCompanyFacade.findCompany("%Eco%");
        }catch(SearchingException e){
        }
        //CLEAN_UP
        companyDao.delete(company1);
        companyDao.delete(company2);
    }

    @Test
    public void ShouldFindZeroCompanies(){
        try{
            employeeCompanyFacade.findCompany("%xxxx%");
        }catch(SearchingException e){
        }
    }
}
