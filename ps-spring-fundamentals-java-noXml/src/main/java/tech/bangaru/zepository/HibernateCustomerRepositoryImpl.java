package tech.bangaru.zepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import tech.bangaru.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Value(value = "${dbUsername}")
	private String dbUsername;
	
	@Override
	public List<Customer> findAll() {
		System.out.println("Java config of property source dbUsername->"+dbUsername);
		List<Customer> customerList = new ArrayList<>();
		Customer cust = new Customer();
		cust.setFirstname("Raja");
		cust.setLastname("Bangaru");
		customerList.add(cust);
		return customerList;
	}
}
