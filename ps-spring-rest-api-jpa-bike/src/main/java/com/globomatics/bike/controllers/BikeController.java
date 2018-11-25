package com.globomatics.bike.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.globomatics.bike.models.Bike;
import com.globomatics.bike.repositories.BikeRepository;


@RestController
@RequestMapping("/api/v1/bikes")
public class BikeController {
	
	@Autowired
	private BikeRepository bikeRepository;
	
	@GetMapping
	public List<Bike> getBikes(){
		/*List<Bike> bikes = new ArrayList<Bike>();
		return bikes;*/
		//used spring jpa and we dont need above
		return bikeRepository.findAll();
	}
	
	@PostMapping("/addbikes")
	@ResponseStatus(HttpStatus.OK)
	public void createMoreBike(@RequestBody List<Bike> morebikes) {
		bikeRepository.saveAll(morebikes);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void createNewBike(@RequestBody Bike bike) {
		bikeRepository.save(bike);
	}
	
	
	@GetMapping("/{id}")
	public Bike getBikeById(@PathVariable long id) {
		//return new Bike();
		return bikeRepository.getOne(id);
	}
	
	@DeleteMapping("/removebike/{id}")
	public void removeBikeById(@PathVariable long id) {
		 bikeRepository.deleteById(id);
	}
}
