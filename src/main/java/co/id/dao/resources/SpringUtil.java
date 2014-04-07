package co.id.dao.resources;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author tombisnis@yahoo.com
 */
public class SpringUtil {
    
    private static ApplicationContext applicationContext;
    
    static {
        try {
            // Create the SessionFactory from standard (applicationContext.xml) 
            // config file.
            
            applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }
}