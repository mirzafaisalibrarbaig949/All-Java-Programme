package com.onetomany.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.onetomany.entity.MobileDetails;
import com.onetomany.util.MobileSingletone;

public class AssociationRepository {
	public void savePersonDetails(MobileDetails mobileDetails) {
		try {
			SessionFactory factory = MobileSingletone.getSessionFactoryObject();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(mobileDetails);
//			session.save(adharDetails);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
