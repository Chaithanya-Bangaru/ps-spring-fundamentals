import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import tech.bangaru.service.CustomerService;

public class ApplicationStart {

	public static void main(String[] args) {
		//CustomerService cs = new CustomerServiceImpl();
		//@SuppressWarnings("resource")
		//ApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		CustomerService cs =  appContext.getBean("customerService",CustomerService.class);
		
		System.out.println(cs);
		
		CustomerService cs2 =  appContext.getBean("customerService",CustomerService.class);
		System.out.println(cs2);
		
		System.out.println(cs.findAll().get(0).getFirstname());
	}

}
