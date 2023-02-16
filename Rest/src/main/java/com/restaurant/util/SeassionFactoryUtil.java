package com.restaurant.util;


import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jspiders.restaurant.entity.RestaurantInfo;

public class SeassionFactoryUtil {

	    private static SessionFactory sessionFactory=null;


	    private SeassionFactoryUtil() {
	    }
	
	    public static SessionFactory getSessionFactory() {
	        if (sessionFactory == null) {
	        	Properties properties = PropertiesUtil.getConnectionProperties();
				

				Configuration configuration = new Configuration();
				configuration.setProperties(properties);
				configuration.addAnnotatedClass(RestaurantInfo.class);
				sessionFactory = configuration.buildSessionFactory();
	        }
	        return sessionFactory;
	    }
	    
	}
