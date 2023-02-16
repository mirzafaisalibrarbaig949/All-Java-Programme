package productapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import productapp.dao.ProductDao;
import productapp.model.Product;

@Controller
public class MainController {
	@Autowired
	private ProductDao productDao;
	@RequestMapping("/")
	public String home(Model model) {
		List<Product> allProducts = productDao.getAllProducts();
		model.addAttribute("product", allProducts);
		return "index";
	}
	@RequestMapping("/add-product")
	public String addproduct(Model model) {
		model.addAttribute("title" ,"Add Product");
		return "addProduct_form";
		
	}
	@RequestMapping(value="/handle-product",method=RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product,HttpServletRequest request) {
		System.out.println(product);
		this.productDao.createProduct(product);
		
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		System.out.println(product);
		
		return redirectView;
	}

}
