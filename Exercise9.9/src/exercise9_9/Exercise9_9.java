package exercise9_9;

public class Exercise9_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularPolygon.setN(4);
RegularPolygon rg1=new RegularPolygon();
RegularPolygon rg2=new RegularPolygon(6, 4);
RegularPolygon rg3=new RegularPolygon(10, 4, 5.6, 7.8);

System.out.println(rg1.getN()+" "+rg2.getN()+" "+rg3.getN());
System.out.println(rg1.getPerimeter()+" and "+rg1.getArea());
System.out.println(rg2.getPerimeter()+" and "+rg2.getArea());
System.out.println(rg3.getPerimeter()+" and "+rg3.getArea());
	
	}

}
