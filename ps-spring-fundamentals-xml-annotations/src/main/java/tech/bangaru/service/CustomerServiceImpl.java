package tech.bangaru.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.bangaru.model.Customer;
import tech.bangaru.zepository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	//Default constructor
	CustomerServiceImpl(){
	}
	//Factory pattern
	//@Autowired
	CustomerRepository customerRepository; 
	
	//Spring Constructor injection
	@Autowired
	CustomerServiceImpl(CustomerRepository customerRepository){
		System.out.println("Using constructor injection....");
		this.customerRepository  = customerRepository;
	}
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	//Setter Injection
	//@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("Using setter injection....");
		this.customerRepository = customerRepository;
	}

}
