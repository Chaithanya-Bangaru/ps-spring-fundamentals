package tech.bangaru.service;

import java.util.List;

import tech.bangaru.model.Customer;
import tech.bangaru.zepository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {


	CustomerServiceImpl(){
	}
	//Factory pattern
	CustomerRepository customerRepository; 
	
	//Spring Constructor injection
	CustomerServiceImpl(CustomerRepository customerRepository){
		this.customerRepository  = customerRepository;
	}
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	//Setter Injection
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

}
