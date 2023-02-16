package com.author.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.author.entity.Author;
import com.author.entity.Book;

public class AuthorSingleton {
	private static SessionFactory sessionFactory = null;
		
		public static SessionFactory getSessionFactoryObject() {
			if(sessionFactory == null) {
				Properties properties = PropertiesUtil.getConnectionProperties();
				Configuration cfg = new Configuration();
				cfg.setProperties(properties);
				cfg.addAnnotatedClass(Author.class);
				cfg.addAnnotatedClass(Book.class);
				sessionFactory = cfg.buildSessionFactory();
			}
			return sessionFactory;
		}

	}


