package com.codingdojo.zookeeper;
public class Mammal {
	private int energyLevel = 100;
	public int displayEnergy() {
		System.out.println("Energy level = " + getEnergyLevel());
		return getEnergyLevel();
	}
	public int getEnergyLevel() {
		return energyLevel;
	}
	public void setEnergyLevel(int amount) {
		this.energyLevel = amount;
	}
}
