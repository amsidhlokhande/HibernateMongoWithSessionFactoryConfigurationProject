package com.amsidh.mvc.dom;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {

	@Id
	private Integer personId;
	private String personName;
	private String address;
	public Person() {
	}
	public Person(Integer personId, String personName, String address) {
		this.personId = personId;
		this.personName = personName;
		this.address = address;
	}
	public Integer getPersonId() {
		return personId;
	}
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
