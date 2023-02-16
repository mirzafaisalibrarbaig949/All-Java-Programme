package com.author.util;

import java.util.Properties;

public class PropertiesUtil {

	public static Properties getConnectionProperties(){
		Properties properties = new Properties(); //used to set value in (key value) pair.
		properties.setProperty("connection.driver_class", "com.mysql.cj.jdbc.Driver"); //
		properties.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/rolex");
		properties.setProperty("hibernate.connection.username", "root");
		properties.setProperty("hibernate.connection.password", "tiger");
//		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect"); //used when we get dialect error.
		properties.setProperty("hibernate.show_sql", "true");
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		return properties;
	}
}
