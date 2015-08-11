import co.id.dao.resources.SpringUtil;
import co.id.service.EmployeeService;
import org.springframework.context.ApplicationContext;

/**
 * @author tombisnis@yahoo.com
 */
public class Main {
    public static void main (String[]args){
        System.out.println("Konfigurasi Spring 4 Hibernate 4 Maven");  
        
        ApplicationContext applicationContext = SpringUtil.getApplicationContext();
	EmployeeService employeeService = (EmployeeService) applicationContext.getBean("employeeService");
        
        System.out.println("List : "+employeeService.getAllEmployees());
        System.out.println("Hello Git");
    }
}