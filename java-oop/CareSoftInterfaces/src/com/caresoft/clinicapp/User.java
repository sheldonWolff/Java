package com.caresoft.clinicapp;

public class User {
	
	protected Integer id;
    protected int pin;
	public User() {
		
	}
    public User(Integer identification) {
		this.id = identification;
	}
	public Integer getID() {
//		System.out.println(id);
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setPin(int pinNumber) {
		this.pin = pinNumber;
	}
	public int getPin() {
		return pin;
	}
}
