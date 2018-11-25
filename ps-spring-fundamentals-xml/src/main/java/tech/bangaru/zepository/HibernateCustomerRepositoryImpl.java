package tech.bangaru.zepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import tech.bangaru.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	@Value(value = "${dbUsername}")
	private String dbUsername;
	

	@Override
	public List<Customer> findAll() {
		System.out.println("In DAO file,findAll() method  dbUsername->"+dbUsername);
		List<Customer> customerList = new ArrayList<>();
		Customer cust = new Customer();
		cust.setFirstname("Raja");
		cust.setLastname("Bangaru");
		customerList.add(cust);
		return customerList;
	}
}
