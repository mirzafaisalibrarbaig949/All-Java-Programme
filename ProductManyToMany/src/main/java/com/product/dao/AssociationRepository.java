package com.product.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



import com.product.entity.Product;
import com.product.entity.Suppiler;
import com.product.util.PersonSingleton;

public class AssociationRepository {

		public void savePersonDetails(Product products) {
			try {
				SessionFactory factory = PersonSingleton.getSessionFactoryObject();
				Session session = factory.openSession();
				Transaction transaction = session.beginTransaction();
				session.save(products);
//				session.save(suppilers);
//				session.save(adharDetails);
				transaction.commit();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public void savePersonDetails(Suppiler suppiler) {
			try {
				SessionFactory factory = PersonSingleton.getSessionFactoryObject();
				Session session = factory.openSession();
				Transaction transaction = session.beginTransaction();
				session.save(suppiler);
//				session.save(suppilers);
//				session.save(adharDetails);
				transaction.commit();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}
