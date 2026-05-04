package com.knot.Banking.Bo;

import com.knot.Banking.Model.CustomerModel;


public class CustomerBo {
	private Integer customerId;
	private String customerName;
	private String customerMail;
	private String customerAddress;
	private String customerDob;
	private String createdAt;
	

	public CustomerBo() {
		super();
	}
	
	public CustomerBo(CustomerModel customer) {
		this.customerId=customer.getCustomerId();
		this.customerName=customer.getCustomerName();
		this.customerMail=customer.getCustomerMail();
		this.customerAddress=customer.getCustomerAddress();
		this.customerDob=customer.getDob().toString();
		this.createdAt = customer.getCreatedAt().toString();
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerMail() {
		return customerMail;
	}
	public void setCustomerMail(String customerMail) {
		this.customerMail = customerMail;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	
//	public AccountBo getAccountBo() {
//		return accountBo;
//	}
//	public void setAccountBo(AccountBo accountBo) {
//		this.accountBo = accountBo;
//	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerDob() {
		return customerDob;
	}

	public void setCustomerDob(String customerDob) {
		this.customerDob = customerDob;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public CustomerBo(Integer customerId, String customerName, String customerMail, String customerAddress,
			String customerDob, String createdAt) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerMail = customerMail;
		this.customerAddress = customerAddress;
		this.customerDob = customerDob;
		this.createdAt = createdAt;
	}

	

}
