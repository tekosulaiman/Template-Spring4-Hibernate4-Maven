package co.id.dao.impl;

import co.id.dao.EmployeeDAO;
import co.id.model.Employee;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author tombisnis@yahoo.com
 */
@Repository("employeeDAO")
public class EmployeeDAOImpl implements EmployeeDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Employee employee) {
        sessionFactory.getCurrentSession().save(employee);
    }

    @Override
    public void update(Employee employee) {
        sessionFactory.getCurrentSession().update(employee);
    }

    @Override
    public void delete(Employee employee) {
        sessionFactory.getCurrentSession().delete(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
       return sessionFactory.getCurrentSession().createCriteria(Employee.class).list();
    }
}