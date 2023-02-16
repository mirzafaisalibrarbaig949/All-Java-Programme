package com.restaurant.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.jspider.dto.ResturantDto;
import com.jspiders.restaurant.entity.RestaurantInfo;
import com.restaurant.util.SeassionFactoryUtil;

public class ResturantHqlRepository {
	public List<RestaurantInfo> findAll() {
		List<RestaurantInfo> restaurantList = new ArrayList<RestaurantInfo>();
		try {
			SessionFactory sessionFactory = SeassionFactoryUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			Query query = session.createQuery("FROM RestaurantInfo");
			restaurantList = query.getResultList();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return restaurantList;
	}

	public List<RestaurantInfo> findByResturantName(String resturantName) {
		
			SessionFactory sessionFactory = SeassionFactoryUtil.getSessionFactory();
			Session session = sessionFactory.openSession();

			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("from RestaurantInfo ");
			stringBuilder.append("where name=:rn");
			
			Query query=session.createQuery(stringBuilder.toString());
			query.setParameter("rn", resturantName);
			return query.getResultList();
			
		
	}
	public void UpdateById(ResturantDto resturantDto) {
		SessionFactory sessionFactory = SeassionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("update RestaurantInfo set address=:a,pinCode=:p where id=:i");
		Query query=session.createQuery(stringBuilder.toString());
		query.setParameter("a", resturantDto.getAddress());
		query.setParameter("p", resturantDto.getPinCode());
		query.setParameter("i", resturantDto.getId());

		Transaction transaction = session.beginTransaction();
		int executeUpdate = query.executeUpdate();
		transaction.commit();
	

	}
	public void deleteByname(ResturantDto resturantDto) {
		
		SessionFactory sessionFactory = SeassionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder.append("delete from RestaurantInfo where name=:n");
		Query query=session.createQuery(stringBuilder.toString());
		query.setParameter("n", resturantDto.getName());
		Transaction transaction = session.beginTransaction();
		int executeUpdate = query.executeUpdate();
		transaction.commit();
		
		
	}
	
}
