package com.product.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.product.entity.Product;
import com.product.entity.Suppiler;



public class PersonSingleton {
	

	
		
	private static SessionFactory sessionFactory = null;
		
		public static SessionFactory getSessionFactoryObject() {
			if(sessionFactory == null) {
				Properties properties = PropertiesUtil.getConnectionProperties();
				Configuration cfg = new Configuration();
				cfg.setProperties(properties);
				cfg.addAnnotatedClass(Product.class);
				cfg.addAnnotatedClass(Suppiler.class);
				sessionFactory = cfg.buildSessionFactory();
			}
			return sessionFactory;
		}
	}


