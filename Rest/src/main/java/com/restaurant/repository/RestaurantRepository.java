package com.restaurant.repository;

import com.jspider.dto.ResturantDto;
import com.jspiders.restaurant.entity.RestaurantInfo;

import com.restaurant.util.PropertiesUtil;
import com.restaurant.util.SeassionFactoryUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class RestaurantRepository {
	public void saveRestaurantDetails(RestaurantInfo restaurantInfo) {
		try {
			SessionFactory sessionFactory = SeassionFactoryUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(restaurantInfo);
			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateRestaurantDetails(ResturantDto resturantDto) {
		RestaurantInfo restaurantInfo = getRestaurantDetails(resturantDto.getId());
		if (restaurantInfo != null) {
			restaurantInfo.setAddress(resturantDto.getAddress());
			restaurantInfo.setRating(resturantDto.getRating());
			SessionFactory sessionFactory = SeassionFactoryUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.update(restaurantInfo);
			transaction.commit();
		}

	}

	public List<RestaurantInfo> getAllRestaurantDetails() {
		List<RestaurantInfo> restaurantList = new ArrayList<RestaurantInfo>();
		try {
			SessionFactory sessionFactory = SeassionFactoryUtil.getSessionFactory();

			Session session = sessionFactory.openSession();
//			Transaction transaction = session.beginTransaction();
			Query query = session.createQuery("FROM RestaurantInfo");
			
			restaurantList = query.list();
//			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return restaurantList;
	}

	public RestaurantInfo getRestaurantDetails(int id) {
		RestaurantInfo restaurant = null;
		try {
			SessionFactory sessionFactory = SeassionFactoryUtil.getSessionFactory();
			Session session = sessionFactory.openSession();

//		    Transaction transaction = session.beginTransaction();
			return session.get(RestaurantInfo.class, id);
		
//		    transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void deleteRestaurantDetails(int id2) {
		try {
			RestaurantInfo restaurantDetails = getRestaurantDetails(id2);
			SessionFactory sessionFactory = SeassionFactoryUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.delete(restaurantDetails);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
