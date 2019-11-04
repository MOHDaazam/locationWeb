package com.cts.location.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cts.location.models.Table2;

public interface Table2Repo extends JpaRepository<Table2, Integer> {

	@Query(
			nativeQuery = true, value = 
			"select * from table2  where "
			+ "CustomerId=:customerId and "
			+ "FirstName=:firstName and "
			+ "LastName=:lastName and"
			+ "Address=:address and"
			+ "City=:city"
			)
	public List<Table2> getTableOneData(
			@Param("customerId") String CustomerId, 
			@Param("firstName") String FirstName,
			@Param("lastName") String LastName,
			@Param("address") String Address,
			@Param("city") String City
			);

}
