package com.pj;

import org.springframework.stereotype.Service;

@Service
public class DataService {
	
	private DataRepository repo;
	
	public DataService(DataRepository repo) {
		this.repo = repo;
	}

	
	public Employee save(Employee emp) {
		System.out.println(repo.getClass().getName());
		return repo.save(emp);
	}
}
