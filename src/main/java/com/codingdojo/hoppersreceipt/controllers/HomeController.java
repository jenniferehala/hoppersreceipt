package com.codingdojo.hoppersreceipt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	// class definition and imports here...
    @RequestMapping("/")
    public String index(Model model) {
        
        String name = "Grace Lopper";
        String itemName = "Fopper wire";
        double price = 5.26;
        String description = "Setal strips, also an illustration of nanoseconds.";
        String vendor = "Little things Corner Store";
    
    	model.addAttribute("name", name);
    	model.addAttribute("itemName", itemName);
    	model.addAttribute("price", price);
    	model.addAttribute("description", description);
    	model.addAttribute("vendor", vendor);
    
        return "index.jsp";
    }
    //...
    

}
