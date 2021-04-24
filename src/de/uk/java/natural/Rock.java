package de.uk.java.natural;

import de.uk.java.ITossable;

public class Rock implements ITossable {

	private String color;
	private int size;
	
	public Rock (String color, int size) {
		setColor(color);
		setSize(size);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String getTossed() {
		return "Der Stein fliegt, kommt auf. Es passiert nichts besonderes.";
	}
	
}
