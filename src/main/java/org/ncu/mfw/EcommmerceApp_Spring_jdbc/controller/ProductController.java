package org.ncu.mfw.EcommmerceApp_Spring_jdbc.controller;

import java.util.List;

import org.ncu.mfw.EcommmerceApp_Spring_jdbc.Entity.Product;
import org.ncu.mfw.EcommmerceApp_Spring_jdbc.Entity.User;
import org.ncu.mfw.EcommmerceApp_Spring_jdbc.ServiceLayer.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
    @Autowired
	ProductServiceImpl prser;
    
    @ModelAttribute(value="product")
    public Product getProduct(){
    	return new Product();
    }
    
    @RequestMapping(value="/add")
    public String gotoAddProduct() {
    	return "add";
    }
    @RequestMapping(value="/delete")
    public String gotoDeleteproduct() {
    	return "delete";
    }
    @RequestMapping(value="/seller")
    public String gotoseller(Model model) {
    	List<Product> product= prser.PrintRecords();
    	model.addAttribute("product",product);
    	return "seller";
    }
    @RequestMapping(value="addproduct")
    public String gotoSeller1(@ModelAttribute("product")Product product,Model model) {
    	prser.AddProduct(product);
    	List<Product> productlist=prser.PrintRecords();
    	model.addAttribute("product",productlist);
    	return "seller";
    }
    @RequestMapping(value="deleteproduct")
    public String gotoSeller2(@ModelAttribute("product")Product product,Model model) {
    	prser.DeleteProduct(product);
    	List<Product> productlist=prser.PrintRecords();
    	model.addAttribute("product",productlist);
    	return "seller";
    }
    @RequestMapping(value="buy")
    public String checkout(@ModelAttribute("product") List<Product> buyerlist) {
    	for(Product product:buyerlist) {
    		if(product.isSelected()){
    			
    		}
    	}
    	return "bill";
    }
    @RequestMapping(value="logout")
    public String logout
    	(    @ModelAttribute("user")User user ,
                BindingResult result) {
    	return "LoginPage";
    }
    @RequestMapping(value="/sorta")
    public String dotheSortinga(Model model) {
    	List<Product> productlist = prser.SortRecordsA();
    	model.addAttribute("product",productlist);
    	return "buyer";
    }
    @RequestMapping(value="/sortd")
    public String dotheSortingd(Model model) {
    	List<Product> productlist = prser.SortRecordsD();
    	model.addAttribute("product",productlist);
    	return "buyer";
    }
}
