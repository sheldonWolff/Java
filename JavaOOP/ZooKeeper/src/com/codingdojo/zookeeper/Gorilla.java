package com.codingdojo.zookeeper;
public class Gorilla extends Mammal {
	public int throwSomething() {
		System.out.println("The gorilla has thrown something!");
		setEnergyLevel(getEnergyLevel() - 5);
		return displayEnergy();
	}
	public int eatBananas() {
		System.out.println("The gorilla went ape for those bananas!");
		setEnergyLevel(getEnergyLevel() + 10);
		return displayEnergy();
	}
	public int climb() {
		System.out.println("The gorilla has climbed a tree!");
		setEnergyLevel(getEnergyLevel() - 10);
		return displayEnergy();
	}
}
