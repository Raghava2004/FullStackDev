package com.knot.Banking.Dao;

import java.util.List;

import com.knot.Banking.Bo.CustomerBo;
import com.knot.Banking.Model.CustomerModel;

public interface CustomerDao {

	public abstract List<CustomerModel> getAllCustomers();

	public abstract void save(CustomerModel model);

	public abstract CustomerBo findByID(String id);



}
