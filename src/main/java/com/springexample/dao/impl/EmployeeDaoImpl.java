package com.springexample.dao.impl;

import com.springexample.dao.EmployeeDao;
import com.springexample.models.Employee;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

/**
 * Created by derric on 5/5/15.
 */
public class EmployeeDaoImpl implements EmployeeDao {
    @Autowired
    SessionFactory sessionFactory;
    
    @Transactional
    @Override
    public int insertRow(Employee employee) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(employee);
        tx.commit();
        Serializable id = session.getIdentifier(employee);
        session.close();
        return (Integer) id;
    }

    @Override
    public Employee getEmployeeById(int id) {
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(Employee.class);
        criteria.add(Restrictions.eq("id", id));
        Employee employee = (Employee) criteria.uniqueResult();
        session.close();
        return employee;
    }

    @Override
    public List<Employee> getList() {
        Session session = sessionFactory.openSession();
        @SuppressWarnings("unchecked")
        List<Employee> employeeList = session.createQuery("from Employee").list();
        session.close();
        return employeeList;
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
