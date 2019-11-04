package com.cts.location.repos;



import org.springframework.data.jpa.repository.JpaRepository;


import com.cts.location.models.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

	Location findAllById(int id);



}
