package com.springdemo.model;

public class Client {
	private int id;
	private String clientName;
	private String location;
	public Client(int id, String clientName, String location) {
		super();
		this.id = id;
		this.clientName = clientName;
		this.location = location;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", clientName=" + clientName + ", location=" + location + "]";
	}
	
	
}
