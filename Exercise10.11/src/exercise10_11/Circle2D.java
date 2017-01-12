package exercise10_11;

public class Circle2D {
	private double x;
	private double y;
	private double radius;
	
	

	public Circle2D() {
		// TODO Auto-generated constructor stub
		x=0;
		y=0;
		radius=1;
	}
	
	public Circle2D(double x, double y, double radius){
		this.x=x;
		this.y=y;
		this.radius=radius;
		
	}
	
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getRadius() {
		return radius;
	}
	
	public double getArea(){
		return Math.PI*Math.pow(radius, 2);
	}
	
	public double getPerimeter(){
		return 2*Math.PI*radius;
	}
	
	public boolean contains(double x2,double y2){
		
		if(distance(x2,y2)<=10){
			return true;
		}
		return false;
	}
	
	public boolean contains(Circle2D circle){
		double distance=distance(circle.getX(), circle.getY());
		if(distance+circle.getRadius()<radius) return true;
		
		return false;
		
	}
	public boolean overlap(Circle2D circle){
		double distance=distance(circle.getX(), circle.getY());
		if(distance<=circle.getRadius()+radius) return true;
		return false;
	}
	
	public double distance(double x2,double y2){
		double distance=Math.sqrt(Math.pow(x2-x, 2)+Math.pow(y2-y, 2));
		return distance;
	}

}
