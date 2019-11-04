package com.cts.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.location.models.Table1;
import com.cts.location.repos.Table1Repo;
import com.cts.location.repos.Table2Repo;

@RestController
public class ValidateTablesController {
	
	@Autowired
	Table1Repo tableOneRepo;
	@Autowired
	Table2Repo tableTwoRepo;
	
	@PostMapping(value = "validateTables")
	public List<Table1> ValidateData () {
		
		List<Table1> tableOneData = tableOneRepo.getTableOneData();
		System.out.println(tableOneData);
		
		return tableOneData;
		
	}

}
