package com.springexample.services;

import com.springexample.models.Employee;

import java.util.List;

/**
 * Created by derric on 5/5/15.
 */
public interface EmployeeService {
    public int insertRow(Employee employee);

    public Employee getEmployeeById(int id);

    public List<Employee> getList();

    public int updateRow(Employee employee);

    public int deleteRow(int id);
}
