package com.cave.spring;

public class Person {
	private int id;
	private String name;
	private int taxId;
	private Address address;
	
	public Person(){
		
	}
	
	public Person(int id, String name) {
		//System.out.println("Person constructor! " );
		this.id = id;
		this.name = name;
	}

	public void speak() {
		System.out.println("Hello I am a person");
	}

	public void setTaxId(int taxId) {
		//System.out.println("Person setTaxId! " );
		this.taxId = taxId;
	}

	public Address getAddress(){
		return this.address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}

	public void onCreate() {
		System.out.println("Person created: " + this );
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + ", address=" + address + "]";
	}

}
