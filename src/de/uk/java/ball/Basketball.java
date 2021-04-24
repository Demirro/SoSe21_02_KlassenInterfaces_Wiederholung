package de.uk.java.ball;

public class Basketball extends Ball {

	public Basketball(String color, int diameter) {
		super(color, diameter);
	}

	@Override
	public String getTossed() {
		return "Der Basketball fliegt und springt beim Aufprall wieder hoch";
	}

}
