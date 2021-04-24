package de.uk.java.natural;

import de.uk.java.ITossable;

public class Apple extends Fruit implements ITossable {
	
	private String type;
	
	public Apple (String color, String taste, String type) {
		super(color, taste);
		setType(type);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String getTossed() {
		return "Der Apfel fliegt und zermatscht beim Aufprall.";
	}
	
}
