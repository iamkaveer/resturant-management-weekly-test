package com.resturant.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.resturant.management.model.Resturant;
import com.resturant.management.repository.ResturantRepository;

@Service
public class ResturantService {
	@Autowired
	private ResturantRepository rest;
	
	//add new rest
	
	public Resturant addNew(Resturant newRest) {
		return rest.save(newRest);
	}
	
	
	public Resturant getByID(int id) {
		return rest.findById(id).get();
	}
	
	
	public List<Resturant> findAll(){
		return rest.findAll();
	}
	
	
	public void deleteRestById(int id) {
		rest.deleteById(id);
	}
	
	public void updateRestById(Resturant newRest, int id) {
		Resturant rests = rest.findById(id).get();
		rests.setRest_id(newRest.getRest_id());
		rests.setRestaurants_name(newRest.getRestaurants_name());
		rests.setRestaurants_address(newRest.getRestaurants_address());
		rests.setNumber(newRest.getNumber());
		rests.setSpeciality(newRest.getSpeciality());
		rests.setTotalStaffs(newRest.getTotalStaffs());
		
		rest.save(rests);
	}

}
