package com.knot.Banking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.knot.Banking.Bo.CustomerBo;
import com.knot.Banking.Dto.CustomerDto;
import com.knot.Banking.Service.CustomerService;


@RestController
@RequestMapping("/customer")

@CrossOrigin(
    origins = "http://localhost:2004",
    allowedHeaders = "*",
    methods = {RequestMethod.GET, RequestMethod.POST}
)

public class CustomerController {
    
    @Autowired
    CustomerService customerService;

    // Your original method modified to check for Authorization header
    @GetMapping("/")
    public  List<CustomerBo> getAllCustomers() {
    	 return customerService.getAllCustomers();
    }
    
    @PostMapping("/")
    public void saveCustomer(@RequestBody CustomerDto customer) {
    	customerService.saveCustomer(customer);
    }
    
    @GetMapping("/find")
    public CustomerBo findById(@RequestParam String Id) {
    	return customerService.findById(Id);
    }
    
    
}