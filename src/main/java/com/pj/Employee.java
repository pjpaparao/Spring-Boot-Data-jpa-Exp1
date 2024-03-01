package com.pj;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="emp_new")
public class Employee {

	@Id
private Integer id;
private String name;
private Double sal;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getSal() {
	return sal;
}
public void setSal(Double sal) {
	this.sal = sal;
}
}

