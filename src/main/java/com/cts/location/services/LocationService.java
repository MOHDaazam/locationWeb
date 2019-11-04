package com.cts.location.services;

import java.util.List;

import com.cts.location.models.Location;

public interface LocationService {
	
	Location saveLocation(Location location);
	
	Location updateLocation(Location location);
	
	Location getLocationById(int id);
	
	void deleteLocation(Location location);
	
	List<Location> getAllLocations();

}
