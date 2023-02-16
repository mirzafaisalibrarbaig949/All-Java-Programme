package com.onetomany.app;

import java.util.ArrayList;
import java.util.List;

import com.onetomany.entity.ApplicationDetails;
import com.onetomany.entity.MobileDetails;
import com.onetomany.repository.AssociationRepository;

public class App {

	public static void main(String[] args) {

		List<ApplicationDetails> applicationDetails = new ArrayList<ApplicationDetails>();

		ApplicationDetails application1 = new ApplicationDetails();
		application1.setName("Udemy");
		application1.setType("education");
		application1.setVersion("4.0");

		ApplicationDetails application2 = new ApplicationDetails();
		application2.setName("Bla Bla");
		application2.setType("Travel Share");
		application2.setVersion("3.0");

		ApplicationDetails application3 = new ApplicationDetails();
		application3.setName("Zomato");
		application3.setType("Food Delivery");
		application3.setVersion("4.3");
		
		ApplicationDetails application4 = new ApplicationDetails();
		application3.setName("Swiggy");
		application3.setType("Food/glocesory Delivery");
		application3.setVersion("4.0");

		applicationDetails.add(application1);
		applicationDetails.add(application2);
		applicationDetails.add(application3);
		applicationDetails.add(application4);

		MobileDetails mobileDetails = new MobileDetails();

		mobileDetails.setBrand("Xiomi");
		mobileDetails.setColor("Black");
		mobileDetails.setPrice(33000D);
		mobileDetails.setRamsize("12GB");
		mobileDetails.setLiappApplicationDetails(applicationDetails);
		
		AssociationRepository associationRepository = new AssociationRepository();
		associationRepository.savePersonDetails(mobileDetails);

	}

}
