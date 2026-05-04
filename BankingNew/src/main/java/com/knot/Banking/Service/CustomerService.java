package com.knot.Banking.Service;

import java.util.List;

import com.knot.Banking.Bo.CustomerBo;
import com.knot.Banking.Dto.CustomerDto;

public interface CustomerService {

	List<CustomerBo> getAllCustomers();

	void saveCustomer(CustomerDto customer);

	CustomerBo findById(String id);

}
