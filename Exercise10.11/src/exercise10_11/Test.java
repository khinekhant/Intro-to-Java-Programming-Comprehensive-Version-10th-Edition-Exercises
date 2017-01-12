package exercise10_11;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle2D circle2d=new Circle2D(2,2,5.5);
		System.out.println(circle2d.getArea());
		System.out.println(circle2d.getPerimeter());
		System.out.println(circle2d.contains(3, 3));
		System.out.println(circle2d.contains(new Circle2D(4,5,10.5)));
		System.out.println(circle2d.overlap(new Circle2D(3,5,2.3)));
System.out.println((char)(1+'0'));
	}

}
