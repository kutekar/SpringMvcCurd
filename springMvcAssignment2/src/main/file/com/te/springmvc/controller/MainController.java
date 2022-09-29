package com.te.springmvc.controller;

import java.security.PublicKey;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.te.springmvc.employee.employee;
import com.te.springmvc.repository.repositary;

@Controller
public class MainController {
	@GetMapping("login")
	public String logic() {
		return "login";
	}

	@GetMapping("create")
	public String create() {
		return "form";
	}

	@PostMapping("add")
	public String add(employee emp, repositary respo) {
		respo.saveUser(emp);
		return "success";
	}

	@GetMapping("retrive")
	public String retrive() {
		return "get";
	}

	@PostMapping("searchprocess")
	public String search(@RequestParam("name") String name, repositary respo, Model model) {
		employee retrive = respo.retrive(name);
		model.addAttribute(retrive);
		return "cong";
	}
	
	
	@GetMapping("delete")
	public String delete() {
		return "deleteprocess";
	}
	
	@PostMapping("deletemethod")
	public String deletemethod(@RequestParam("name") String name,repositary respo) {
		System.out.println("delete one");
		respo.delete(name);
		System.out.println("delete two");
		
		return "success";
	}
	@GetMapping("update")
	public String update() {
		return "update";
	}
	
	@PostMapping("updateprocess")
	public String updateprocess(@RequestParam("name") String name,@RequestParam("updatename") String update ,repositary respo){
		respo.update(name , update);
		return "success";
		
		
	}
	


}
