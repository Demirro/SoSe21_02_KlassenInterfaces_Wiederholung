package de.uk.java.human;

import de.uk.java.ITossable;

public abstract class Human {

	/*
	 * Instanzvariablen Eigenschaften die jeder Mensch hat
	 */
	private int age;
	private int height;
	private String name;

	/**
	 * Constructor für die Klasse Human. Diese Eigenschaft müssen immer da sein,
	 * wenn ein Mensch instanziiert wird
	 * 
	 * @param name
	 * @param age
	 * @param height
	 * @param alive
	 */
	public Human(String name, int age, int height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	/**
	 * Toss an Object that implements the Interface ITossable
	 * Prints a message in the console
	 * @param tossable
	 */
	public void toss(ITossable tossable) {
		System.out.println(tossable.getTossed());
	}

	@Override
	public String toString() {
		return ("This Human is called " + getName() + " and is " + getAge() + " years old.");
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Human) {
			Human humanObj = (Human) obj;
			if (humanObj.getName().equals(this.getName()) && humanObj.getAge() == this.getAge()) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	/*
	 * Getter and Setter
	 */

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
