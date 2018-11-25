package tech.bangaru.zepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import tech.bangaru.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	/* (non-Javadoc)
	 * @see tech.bangaru.repository.CustomerRepository#findCustomer()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customerList = new ArrayList<>();
		Customer cust = new Customer();
		cust.setFirstname("Raja");
		cust.setLastname("Bangaru");
		customerList.add(cust);
		return customerList;
	}
}
