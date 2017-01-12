package exercise10_3;

public class MyInteger {

	private int value;
	private static int val;
	public MyInteger(int i) {
		// TODO Auto-generated constructor stub
		value=i;
	}
	public boolean isEven() {
		// TODO Auto-generated method stub
		return isEven(value);
	}
	
	public boolean isOdd() {
		// TODO Auto-generated method stub
		return isOdd(value);
	}
	public boolean isPrime() {
		// TODO Auto-generated method stub
		
		return isPrime(value);
	}
	
	public static boolean isEven(int i) {
		// TODO Auto-generated method stub
		return i%2==0;
	}
	public static boolean isOdd(int i) {
		// TODO Auto-generated method stub
		return i%2!=0;
	}
	public static boolean isPrime(int i) {
		// TODO Auto-generated method stub
		for(int divisor=2;divisor<=i/2;divisor++){
			if(i%divisor==0) return false;
		}
		return true;
	}
	
	public static boolean isEven(MyInteger myI) {
		// TODO Auto-generated method stub
		//val=myI.value;
		return isEven(myI.value);
	}
	
	public static boolean isPrime(MyInteger myI) {
		// TODO Auto-generated method stub
		return isPrime(myI.value);
	}
	
	public int getValue(){
		return value;
	}
	
	public static int getVal(){
		return val;
	}
	public boolean isEqual(MyInteger myInteger) {
		// TODO Auto-generated method stub
		return value==myInteger.getValue();
	}
	
	public static int parseInt(char[] cs) {
		// TODO Auto-generated method stub
		return Integer.parseInt(new String(cs));
	}

}
