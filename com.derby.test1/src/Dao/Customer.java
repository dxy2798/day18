package Dao;

import java.sql.Date;

public class Customer {
	private int id;
	private String name;
	private String email;
	private Date bith;
	
	
	public Customer() {
		
	}
	public Customer(int id, String name, String email, Date bith) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.bith = bith;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBith() {
		return bith;
	}
	public void setBith(Date bith) {
		this.bith = bith;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", bith=" + bith + "]";
	}

}
