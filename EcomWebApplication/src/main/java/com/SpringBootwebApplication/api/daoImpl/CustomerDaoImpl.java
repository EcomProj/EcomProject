package com.SpringBootwebApplication.api.daoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.SpringBootwebApplication.api.dao.CustomerDao;
import com.SpringBootwebApplication.api.model.Customer;

@Repository
@Transactional
public class CustomerDaoImpl implements CustomerDao {
	
	@Autowired
	private SessionFactory factory;

	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> getcustomer() {
		Session ses=getSession();
		 Query qry=null;
		try{
			  qry= ses.createQuery("from Customer");
			
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		/*finally{
			ses.close();
		}*/
		 
		    return qry.list();
	}
	
	
	public Session getSession() {
		Session session = factory.getCurrentSession();
		if (session == null) {
			return factory.openSession();
		} else {
			return session;
		}

	}

}
