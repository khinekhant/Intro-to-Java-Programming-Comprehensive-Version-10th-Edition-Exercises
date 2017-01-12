package exercise10_4;

public class MyPoint {
	private double x;
	private double y;
	
	public MyPoint() {
		// TODO Auto-generated constructor stub
		x=0;
		y=0;
	}
	
	public MyPoint(double x,double y){
		this.x=x;
		this.y=y;
		
	}
	
	public double distance(MyPoint point) {
		return distance(this,point);
	}

	public static double distance(MyPoint po1, MyPoint po2) {
		// TODO Auto-generated method stub
		return Math.sqrt(Math.pow(po2.x-po1.x,2)+Math.pow(po2.y-po1.y,2));
	}

}
