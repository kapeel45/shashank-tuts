package com.hp.cleansheet.expense;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpenseController {

	@GetMapping("/")
	public String hello(){
		return "hello";
	}

	@GetMapping("/{id}")
	public String printId(@PathVariable String id){
		
		if(id != null){
			System.out.println("Id: "+id);
			return id;
		}else{
			System.out.println("Id not found");
			return "id not found";
		}
		
	}
	
	@PostMapping("/add")
	public @ResponseBody RequestDto printPost(@RequestBody RequestDto reqDto){
	
		if(reqDto != null){
			System.out.println("Email: "+reqDto.getEmail());
			System.out.println("username: "+reqDto.getUsername());
		}
		
		return reqDto;
	}
	
}
