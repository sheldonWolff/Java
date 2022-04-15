package com.codingdojo.zookeeper;

public class Bat extends Mammal {
	public Bat() {
		setEnergyLevel(300);
	}
	
	public int fly() {
		System.out.println("Bat scampers off");
		setEnergyLevel(getEnergyLevel() - 50);
		return displayEnergy();
	}
	public int eatHumans() {
		System.out.println("HOLY CRAP!");
		setEnergyLevel(getEnergyLevel() + 25);
		return displayEnergy();
	}
	public int attackTown() {
		System.out.println("HEEEEELLLLLLPPP!!!!");
		setEnergyLevel(getEnergyLevel() - 100);
		return displayEnergy();
	}
}
