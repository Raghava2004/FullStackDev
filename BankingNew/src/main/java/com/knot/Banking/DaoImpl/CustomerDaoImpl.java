package com.knot.Banking.DaoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.knot.Banking.Bo.CustomerBo;
import com.knot.Banking.Dao.CustomerDao;
import com.knot.Banking.Model.CustomerModel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
public class CustomerDaoImpl implements CustomerDao {
    @Autowired
    EntityManager entityManager;

    @SuppressWarnings("unchecked")
	@Override
    public List<CustomerModel> getAllCustomers() {
        try {
			StringBuilder sb= new StringBuilder();
			sb.append("select customer_id,customer_name,customer_mail,address,dob,created_at from customer");
			Query qry= entityManager.createNativeQuery(sb.toString(), CustomerModel.class);
			List<CustomerModel> customerModels= qry.getResultList();
			return customerModels;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
    }

	@Override
	@Transactional
	public void save(CustomerModel model) {
		try {
			entityManager.merge(model);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public CustomerBo findByID(String id) {
        try {
			StringBuilder sb= new StringBuilder();
			sb.append("select customer_id,customer_name,customer_mail,address,dob,created_at from customer")
			.append(" where customer_id=:id");
			Query qry= entityManager.createNativeQuery(sb.toString(), CustomerModel.class);
			qry.setParameter("id", id);
			CustomerModel customerModels= (CustomerModel) qry.getSingleResult();
			return new CustomerBo(customerModels);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
    }
}