package com.onetomany.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.onetomany.entity.ApplicationDetails;
import com.onetomany.entity.MobileDetails;



public class MobileSingletone {
private static SessionFactory sessionFactory = null;
	
	public static SessionFactory getSessionFactoryObject() {
		if(sessionFactory == null) {
			Properties properties = PropertiesUtil.getConnectionProperties();
			Configuration cfg = new Configuration();
			cfg.setProperties(properties);
			cfg.addAnnotatedClass(MobileDetails.class);
			cfg.addAnnotatedClass(ApplicationDetails.class);
			sessionFactory = cfg.buildSessionFactory();
		}
		return sessionFactory;
	}

}
