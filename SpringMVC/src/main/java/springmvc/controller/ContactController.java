package springmvc.controller;

import springmvc.model.User;
import springmvc.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {
	@Autowired
	private UserService userService;
	
	
	@ModelAttribute
	public void commondataForModel(Model model) {
		model.addAttribute("Header","This is Registeration Form");
		model.addAttribute("Instruction","This is my Practicing web page for Spring MVC Model Atttributes Common data");
	}
	
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String proceeform(@ModelAttribute User user,Model model) {
		int createUser = this.userService.createUser(user);
		model.addAttribute("msg","User crated Successfully : "+createUser);
		return "success";
	}
	}


/* 
 @RequestMapping(path="/processform",method=RequestMethod.POST)
	public String proceeform(
			@RequestParam("user_name")String user_name,
			@RequestParam("user_password")String user_password,
			@RequestParam("user_email")String user_email,Model model) {
	User user=new User();
	user.setUser_name(user_name);
	user.setUser_password(user_password);
	user.setUser_email(user_email);
	
	
	model.addAttribute("user",user);
	System.out.println(user);
		
		return "success";
		
	
 */

