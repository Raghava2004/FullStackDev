package com.knot.Banking.Dto;

import java.time.LocalDate;

public class CustomerDto {
	private String customerName;
	private String customerMail;
	private String customerAddress;
	private LocalDate dob;
	
	
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
	public void setCustomerAddress(String address) {
		this.customerAddress = address;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public CustomerDto(String customerName, String customerMail, String address, LocalDate dob) {
		super();
		this.customerName = customerName;
		this.customerMail = customerMail;
		this.customerAddress = address;
		this.dob = dob;
	}
	
	public CustomerDto() {
		super();
	}

}
