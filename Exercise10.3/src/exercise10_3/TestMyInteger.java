package exercise10_3;

public class TestMyInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyInteger myInteger=new MyInteger(7);
System.out.println(myInteger.isEven()+","+myInteger.isOdd()+","+myInteger.isPrime());
System.out.println(MyInteger.isEven(3));
System.out.println(MyInteger.isOdd(4));
System.out.println(MyInteger.isPrime(3));
System.out.println(MyInteger.isEven(new MyInteger(5)));
System.out.println(MyInteger.isPrime(new MyInteger(106)));
//System.out.println(MyInteger.getVal());
System.out.println(myInteger.isEqual(myInteger));

System.out.println(MyInteger.parseInt(new char[]{'2','4','6'}));
	}

	

	

	

}
