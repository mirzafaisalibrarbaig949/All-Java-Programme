package com.author.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.author.entity.Author;
import com.author.util.AuthorSingleton;


public class AssociationRepository {
	public void savePersonDetails(Author author) {
		try {
			SessionFactory factory = AuthorSingleton.getSessionFactoryObject();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(author);
//			session.save(adharDetails);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
