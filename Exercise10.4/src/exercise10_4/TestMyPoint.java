package exercise10_4;

public class TestMyPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyPoint p1=new MyPoint();
MyPoint p2=new MyPoint(10,30.5);
System.out.println(p1.distance(p2));
System.out.println(MyPoint.distance(p1,p2));
	}

}
