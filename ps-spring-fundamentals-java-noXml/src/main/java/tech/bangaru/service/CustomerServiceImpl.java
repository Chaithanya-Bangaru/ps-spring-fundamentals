package tech.bangaru.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import tech.bangaru.model.Customer;
import tech.bangaru.zepository.CustomerRepository;

@Service("customerService")
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CustomerServiceImpl implements CustomerService {
	
	public CustomerServiceImpl(){
	}
	//@Autowired
	CustomerRepository customerRepository; 

	//Spring Constructor injection
	public CustomerServiceImpl(CustomerRepository customerRepository){
		System.out.println("Constructor injection");
		this.customerRepository  = customerRepository;
	}
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	//Setter Injection
	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("Setter injection");
		this.customerRepository = customerRepository;
	}

}
