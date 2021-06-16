package com.sriman.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sriman.model.Profile;


@Controller
public class ProfileController {

	@GetMapping("/")
	 public String homePage() {
		 return "homepage";
	 }
	// http://localhost:8090/MyProfile/profile
	@GetMapping("/profile")
	public String profileeHandler(Model model) {
		 Profile profile=new Profile();
		 profile.setName("Sriman");
		 profile.setQualification("M.Tech");
		 profile.setCompany("UST GLOBAL");
		 profile.setDesignation("Java Developer");
		 profile.setAddress("HiTech City, Hyderabad");
		 profile.setCreatedDate("03-05-2021");
		 
		 model.addAttribute("profile",profile);
		 
		 return "profile";
	}
	 
	@GetMapping("/academic")
	public String academic(Model model) {
		
		Profile profile=new Profile();
		profile.setName("M.Tech");
		profile.setCompany("NIT, Bhopal");
		profile.setAddress("8.4");
		 
		 model.addAttribute("aca",profile);
		 
		 return "academic";
		}
	
	@GetMapping("/teaching")
	public String teachingExp(Model model) {
		
		Profile profile=new Profile();
		profile.setName("Vignan University, Guntur");
		profile.setCompany("Asst.Profesor");
		profile.setAddress("E.C.E");
		
		 
		 model.addAttribute("te",profile);
		 
		 return "teaching";
}
	
	@GetMapping("/IT")
	public String iTExp(Model model) {
		
		Profile profile=new Profile();
		profile.setName("SpringBoot Application Developer");
		profile.setCompany("2 years plus");
		
		 
		 model.addAttribute("it",profile);
		 
		 return "IT";
}	
	@GetMapping("/others")
	public String otherExp(Model model) {
		
		Profile profile=new Profile();
		profile.setName("Gardening, Cooking");
		profile.setCompany("Electrical Wiring, Hardware Repair like TV, CellPhone");
		
		 
		 model.addAttribute("others",profile);
		 
		 return "others";
}
	
	
	
	
}