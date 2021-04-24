package de.uk.java.ball;

import de.uk.java.ITossable;

public abstract class Ball implements ITossable {
	
	private String color;
	private int diameter;
	
	public Ball (String color, int diameter) {
		setColor(color);
		setDiameter(diameter);
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getDiameter() {
		return diameter;
	}
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

}
