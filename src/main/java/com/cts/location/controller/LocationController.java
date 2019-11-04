package com.cts.location.controller;

import java.util.List;


import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.location.models.Location;
import com.cts.location.repos.LocationRepository;
import com.cts.location.services.LocationService;
import com.cts.location.util.EmailUtil;


@Controller
public class LocationController {

	@Autowired
	LocationService service;
	
	@Autowired
	LocationRepository repository;
	
	@Autowired
	EmailUtil email;
	
	
	
	@Autowired
	ServletContext sc;


	
	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createLocation";
	}

	@RequestMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
		Location locationSaved = service.saveLocation(location);
		String msg = "Location Saved :" + locationSaved.getId();
		modelMap.addAttribute("msg", msg);
		email.sendEmail("azamkhanaonla@gmail.com", "Location saved", "Location is saved thankyou !");
		return "createLocation";
	}

	@RequestMapping("/displayLocations")
	public String displayLocations(ModelMap modelMap) {
		java.util.List<Location> alllocations = service.getAllLocations();
		modelMap.addAttribute("allLocations", alllocations);
		return "displayLocations";
	}

	@RequestMapping("/deleteLocation")
	public String deleteLocation(@RequestParam("id") int id, ModelMap modelMap) {
		Location location = new Location();
		// Deleting item from the table...
		location.setId(id);
		service.deleteLocation(location);
		// To get updated table on the page after deletion
		java.util.List<Location> allLocations = service.getAllLocations();
		modelMap.addAttribute("allLocations", allLocations);
		// Returning Page ...
		return "displayLocations";
	}

	@RequestMapping("/editLocation")
	public String updateLocation(@RequestParam("id") int id, ModelMap modelMap) {
		// Searching for the particular ID in database..
		Location location = service.getLocationById(id);
	
		// After getting data send back to UI..
		modelMap.addAttribute("location", location);
		// Redirect to the page ->
		return "editLocation";
	}



}
