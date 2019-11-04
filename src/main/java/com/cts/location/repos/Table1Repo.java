package com.cts.location.repos;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.cts.location.models.Table1;

public interface Table1Repo extends JpaRepository<Table1, Integer> {

	@Query(nativeQuery = true, value = "SELECT * FROM table1")
	public List<Table1> getTableOneData();

}
