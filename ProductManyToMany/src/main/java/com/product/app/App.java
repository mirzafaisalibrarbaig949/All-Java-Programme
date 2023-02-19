package com.product.app;

import java.util.ArrayList;
import java.util.List;

import com.product.dao.AssociationRepository;
import com.product.entity.Product;
import com.product.entity.Suppiler;


public class App{
	public static void main(String[] args) {
		
		Suppiler suppiler=new Suppiler();
		suppiler.setName("Amul");
		suppiler.setCity("Bhubaneswar");
		
		Suppiler suppiler1=new Suppiler();
		suppiler1.setName("Omfed");
		suppiler1.setCity("Bhadarakh");
		
		Suppiler suppiler2=new Suppiler();
		suppiler2.setName("Pragati");
		suppiler2.setCity("Jajpur");
		
		List<Suppiler> suppilers=new ArrayList<Suppiler>();
		suppilers.add(suppiler1);
		suppilers.add(suppiler);
		suppilers.add(suppiler2);
		
		
		Product product=new Product();
		product.setName("Milk");
		product.setType("Diary");
		product.setSuppllier(suppilers);
		
		Product product1=new Product();
		product1.setName("Curd");
		product1.setType("Diary");
		product1.setSuppllier(suppilers);
		
		Product product2=new Product();
		product2.setName("Butter");
		product2.setType("Diary");
		product2.setSuppllier(suppilers);
		
		List<Product>products=new ArrayList<Product>();
		products.add(product);
		products.add(product1);
		products.add(product2);
		
		suppiler1.setProducts(products);
		
		
		AssociationRepository associationRepository=new  AssociationRepository();
		associationRepository.savePersonDetails(suppilers);
		
		
		
	}
}
