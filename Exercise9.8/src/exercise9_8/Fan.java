package exercise9_8;

public class Fan {
	final static int SLOW=1;
	final static int MED=2;
	final static int FAST=3;
	private int speed;
	private boolean on;
	private double radius;
	private String color;
	
	public Fan() {
		// TODO Auto-generated constructor stub
		setSpeed(1);
		setOn(false);
		setRadius(5);
		setColor("blue");
		
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString(){
		if(on){
			return "The fan speed is "+speed+","+"color is "+color+" and radius is "+radius;
		}else{
			return "The fan is off"+","+"color is "+color+" and radius is "+radius;
		}
	}
	

}
