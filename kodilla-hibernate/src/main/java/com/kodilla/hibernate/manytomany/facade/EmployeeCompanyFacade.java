package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeCompanyFacade{

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private CompanyDao companyDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeCompanyFacade.class);

    public void findEmployee(String excerpt) throws SearchingException{
        List<Employee> employeesFound = new ArrayList<>();
        try{
            employeesFound.addAll(employeeDao.findEmployeeContains(excerpt));
        }catch(Exception e){
            LOGGER.error(SearchingException.ERR);
            throw new SearchingException(SearchingException.ERR);
        }
        if(employeesFound.size()==0){
            LOGGER.info("There are no employees whose lastname contains: " + excerpt);
        }
        else{
            LOGGER.info("Searching completed successfully. Below you can find results.");
            for(Employee employee: employeesFound){
                System.out.println("ID: " + employee.getId()+ ", FIRSTNAME: " + employee.getFirstname() + ", LASTNAME: " + employee.getLastname());
            }
        }
    }

    public void findCompany(String excerpt) throws SearchingException{
        List<Company> companiesFound;
        try{
            companiesFound = companyDao.findCompanyContains(excerpt);
        }catch(Exception e){
            LOGGER.error(SearchingException.ERR);
            throw new SearchingException(SearchingException.ERR);
        }
        if(companiesFound.size()==0){
            LOGGER.info("There are no companies which name contains: " + excerpt);
        }
        else{
            LOGGER.info("Searching completed successfully. Below you can find results.");
            for(Company company: companiesFound){
                System.out.println("ID: " + company.getId() + ", NAME: "+company.getName());
            }
        }
    }
}
