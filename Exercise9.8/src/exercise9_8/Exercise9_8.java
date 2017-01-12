package exercise9_8;

public class Exercise9_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan f1=new Fan();
		Fan f2=new Fan();
		f1.setColor("yellow");
		f1.setSpeed(3);
		f1.setOn(true);
		f1.setRadius(10);
		f2.setColor("blue");
		f2.setRadius(5);
		f2.setOn(false);
		f2.setSpeed(2);
System.out.println(f1.toString());
System.out.println(f2.toString());
	}

}
