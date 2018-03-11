package com.niit.Ecommerce_backend.Impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Ecommerce_backend.DAO.CategoryDAO;
import com.niit.Ecommerce_backend.Model.CategoryModel;

@Repository 

public class CategoryDAOImpl implements CategoryDAO
{
	 @Autowired
		private SessionFactory sessionFactory;
		
	/*public CategoryDAOImpl(SessionFactory sessionFactory)
	{
		// TODO Auto-generated constructor stub
		this.sessionFactory = sessionFactory;
	}*/
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	public void addCategory(CategoryModel category1)
	{
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.save(category1);
		s.getTransaction().commit();
		s.close();
		
	}

	public CategoryModel getId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(CategoryModel category) {
		// TODO Auto-generated method stub
		
	}

	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}

	public List<CategoryModel> getAll() 
	{
		
		//@SuppressWarnings("unchecked")
		
			Session s=sessionFactory.openSession();
			s.beginTransaction();
			Query query =s.createQuery("from CategoryModel");        
			List<CategoryModel> list=query.list();
			System.out.println(list);
			s.getTransaction().commit();
			return list;
		
	}

	
	
		
	public CategoryModel findById(int id) 
	{
		
		CategoryModel c=(CategoryModel)sessionFactory.openSession().get(CategoryModel.class, id);
		return c;
	}
}
