package com.knot.Banking.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knot.Banking.Bo.CustomerBo;
import com.knot.Banking.Dao.CustomerDao;
import com.knot.Banking.Dto.CustomerDto;
import com.knot.Banking.Model.CustomerModel;
import com.knot.Banking.Service.CustomerService;


@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	CustomerDao customerDao;



	@Override
	public List<CustomerBo> getAllCustomers() {
	    List<CustomerModel> allCustomers = customerDao.getAllCustomers();
	    List<CustomerBo> customerBoList = new ArrayList<>();

	    if (allCustomers != null) {
	        for (CustomerModel customerModel : allCustomers) {
	        	
	        	CustomerBo bo = new CustomerBo(customerModel);
	            customerBoList.add(bo);
	        }
	    }

	    return customerBoList;
	}

	@Override
	public void saveCustomer(CustomerDto customer) {
		CustomerModel model = new CustomerModel(customer);
		customerDao.save(model);
	}

	@Override
	public CustomerBo findById(String id) {
		return customerDao.findByID(id);
	}
}
