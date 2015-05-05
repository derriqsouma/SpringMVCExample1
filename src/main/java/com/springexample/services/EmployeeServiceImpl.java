package com.springexample.services;

import com.springexample.dao.EmployeeDao;
import com.springexample.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by derric on 5/5/15.
 */
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeDao employeeDao;
    
    @Override
    public int insertRow(Employee employee) {
        return employeeDao.insertRow(employee);
    }

    @Override
    public Employee getEmployeeById(int id) {
        return employeeDao.getEmployeeById(id);
    }

    @Override
    public List<Employee> getList() {
        return employeeDao.getList();
    }

    @Override
    public int updateRow(Employee employee) {
        return 0;
    }

    @Override
    public int deleteRow(int id) {
        return 0;
    }
}
