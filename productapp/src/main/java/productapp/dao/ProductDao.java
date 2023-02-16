package productapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import productapp.model.Product;

@Repository
public class ProductDao {
	@PersistenceContext
	private EntityManager entityManager;
	
	// Inserting
	
	@Transactional
	public void createProduct(Product product) {
		entityManager.persist(product);
	}
	
	// ---------Retrieve a single data ---------//

	public Product getProduct(int pid) {
		return entityManager.find(Product.class, pid);
	}

	// ---------Retrieve multiple data ---------//
	public List<Product> getAllProducts() {
		return entityManager.createQuery("SELECT p FROM Product p", Product.class).getResultList();
	}

	// --------- Delete a single data ---------//
	@Transactional
	public void delete(int pid) {
		Product product = entityManager.find(Product.class, pid);
		entityManager.remove(product);
	}

	// ---------Update data ---------//
	@Transactional
	public void update(Product product) {
		entityManager.merge(product);
	}
}
