package com.knot.Banking.Model;

import java.time.LocalDate;

import com.knot.Banking.Dto.CustomerDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="customer")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="customer_id")
	private Integer customerId;
	@Column(name="customer_name")
	private String customerName;
	@Column(name="customer_mail")
	private String customerMail;
	@Column(name="address")
	private String customerAddress;
	@Column(name="dob")
	private LocalDate dob;
	@Column(name="created_at")
	private LocalDate createdAt;
	
	public CustomerModel(CustomerDto customerDto) {
		this.customerName=customerDto.getCustomerName();
		this.customerMail=customerDto.getCustomerMail();
		this.customerAddress=customerDto.getCustomerAddress();
//		String dobInput=customerDto.getDob();
		this.dob=customerDto.getDob();
		this.createdAt=LocalDate.now();
	}


}
