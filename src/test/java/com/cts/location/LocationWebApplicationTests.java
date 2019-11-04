package com.cts.location;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cts.location.models.Table1;
import com.cts.location.repos.Table1Repo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LocationWebApplicationTests {

	@Autowired
	Table1Repo tableOneRepo;
	
	@Test
	public void contextLoads() {
		
		List<Table1> tableOneData = tableOneRepo.getTableOneData();
		System.out.println("---------------------------------------------->");
		System.out.println(tableOneData);
		
	}

}
