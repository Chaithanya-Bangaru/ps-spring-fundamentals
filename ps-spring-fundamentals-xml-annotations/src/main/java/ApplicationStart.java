import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tech.bangaru.service.CustomerService;

public class ApplicationStart {

	public static void main(String[] args) {
		//CustomerService cs = new CustomerServiceImpl();
		@SuppressWarnings("resource")
		ApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");
		CustomerService cs =  appContext.getBean("customerService",CustomerService.class);
		System.out.println(cs.findAll().get(0).getFirstname());
	}

}
