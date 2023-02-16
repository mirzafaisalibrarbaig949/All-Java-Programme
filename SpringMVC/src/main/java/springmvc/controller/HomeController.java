package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home(Model model) {
		
		
		System.out.println("This is home page");
		model.addAttribute("name","Mirza Faisal ");
		model.addAttribute("name1","Mirza Faisal Ibrar Baig ");
		List<String> friends=new ArrayList<>();
		friends.add("Satya");
		friends.add("Soubhagya");
		friends.add("Mukesh");
		model.addAttribute("f",friends);
		
		return "index";
	}
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about pages");
		return "about";
	}
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is about help");
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("name","Mirza Faisla Ibara Baig");
		modelAndView.setViewName("help");
		
		return modelAndView;
	}
	

	

}
