package de.uk.java.natural;

public abstract class Fruit {
	
	private String color;
	private String taste;
	
	public Fruit (String color, String taste) {
		setColor(color);
		setTaste(taste);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}
	
	
}
