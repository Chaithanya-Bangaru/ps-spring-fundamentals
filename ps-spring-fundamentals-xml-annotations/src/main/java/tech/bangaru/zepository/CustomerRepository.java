package tech.bangaru.zepository;

import java.util.List;

import tech.bangaru.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}