import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan({"tech.bangaru"}) // package name in which spring scans for components
@PropertySource( "app.properties")
public class AppConfig {
	
	@Bean // This bean could be optional because, without it, the program ran printing the injected dbUsename
	//, could be optional with latest spring version
	public PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	/*@Bean(name="customerRepository")
	public CustomerRepository getCustomerRepository() {
		CustomerRepository customerRepo = new HibernateCustomerRepositoryImpl();
		return customerRepo;
	}*/
	/*@Bean(name="customerService")
	public CustomerService getCustomerService(){
		
		//Constructor Injection
		//CustomerService service = new CustomerServiceImpl(getCustomerRepository());
		CustomerService service = new CustomerServiceImpl();
		//Setter Injection
		CustomerServiceImpl service = new CustomerServiceImpl();
		service.setCustomerRepository(getCustomerRepository());
		return service;
	}*/

}
