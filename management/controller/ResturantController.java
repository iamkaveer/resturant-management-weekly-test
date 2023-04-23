package com.resturant.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.resturant.management.model.Resturant;
import com.resturant.management.service.ResturantService;

@RestController
public class ResturantController {
	@Autowired
	private ResturantService rest;
	
	
	@PostMapping("/add-new")
	public Resturant addNewRest(@RequestBody Resturant newRest) {
		rest.addNew(newRest);
		return newRest;
	}
	
	//get by id
	@GetMapping("/find/{id}")
	public Resturant findRestById(@PathVariable int id) {
		return rest.getByID(id);
	}
	
	//find all
	@GetMapping("/find-all")
	public List<Resturant> findAllRest(){
		return rest.findAll();
	}
	
	//delete 
	@DeleteMapping("/delete/{id}")
	public String deleteRest(@PathVariable int id) {
		rest.deleteRestById(id);
		return "deleted";
		
	}
	//update by id
	@PutMapping("/update/{id}")
	public String updateById(@RequestBody Resturant newRest, @PathVariable int id) {
		rest.updateRestById(newRest, id);
		return "updated";
	}

}
