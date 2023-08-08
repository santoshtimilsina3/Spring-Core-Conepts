package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springcore.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring-bean.xml");
        Employee employee = appContext.getBean(Employee.class);
        System.out.println(employee.getClass().getName());
    }
}
