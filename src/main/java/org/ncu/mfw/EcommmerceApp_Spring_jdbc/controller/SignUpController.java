package org.ncu.mfw.EcommmerceApp_Spring_jdbc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.ncu.mfw.EcommmerceApp_Spring_jdbc.Entity.Product;
import org.ncu.mfw.EcommmerceApp_Spring_jdbc.Entity.User;
import org.ncu.mfw.EcommmerceApp_Spring_jdbc.ServiceLayer.ProductServiceImpl;
import org.ncu.mfw.EcommmerceApp_Spring_jdbc.ServiceLayer.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class SignUpController {
	@Autowired
	UserServiceImpl userimpl;
	@Autowired
	ProductServiceImpl prser;
	
	@ModelAttribute("user")
	public User getuser() {
		return new User();
	}
	@ModelAttribute(value="product")
    public Product getProduct(){
    	return new Product();
    }
	
	
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("LoginPage");
	}
	
	@RequestMapping(value="gotoregistrationpage")
	public String GoToregistration() {
		return "RegistrationPage";
	}
	@RequestMapping(value="gotologinpage")
	public String GoToLoginpage(@ModelAttribute("user")User user) {
		userimpl.Addrecord(user);
		return "LoginPage";
	}
	
	@RequestMapping(value="login")
	public String GoToUserSeller(@RequestParam(name="username")String uname,@RequestParam(name="password")String pass,Model model) {
		User type= userimpl.Getrecord(uname, pass);
		if(type.getUsertype().equals("seller")) {
			List<Product> product=prser.PrintRecords();
			model.addAttribute("product",product);
			return "seller";
		}else if (type.getUsertype().equals("buyer")) {
			List<Product> product=prser.PrintRecords();
			model.addAttribute("product",product);
			return "buyer";
		}else 
		return null;
	}
}
