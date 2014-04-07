package co.id.service.impl;

import co.id.dao.EmployeeDAO;
import co.id.model.Employee;
import co.id.service.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author tombisnis@yahoo.com
 */
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    public void save(Employee employee){
        employeeDAO.save(employee);
    }

    @Override
    public void update(Employee employee) {
        employeeDAO.update(employee);
    }

    @Override
    public void delete(Employee employee){
       employeeDAO.delete(employee);
    }

    @Override
    @Transactional
    public List<Employee> getAllEmployees(){
        return employeeDAO.getAllEmployees();
    }
}