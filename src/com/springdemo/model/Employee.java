package com.springdemo.model;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private int id;
	private String name;
	private String designation;
	Map<String, Address> address;
	List<Client> client;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String name) {
		this.name=name;	}
	
	@Autowired
	public Employee(int id, String name, String designation,Map<String,Address> address,List<Client> client) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.address=address;
		this.client=client;
	}
	public Employee(Map<String,Address> address) {
		this.address=address;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("id setting setter");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	public Map<String,Address> getAddress() {
		return address;
	}
	public void setAddress(Map<String,Address> address) {
		this.address = address;
	}
	
	
	
	public List<Client> getClient() {
		return client;
	}
	public void setClient(List<Client> client) {
		this.client = client;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", address=" + address
				+ ", client=" + client + "]";
	}
	
	
	
	
	
	
	
	
}
