package exercise6_28;

public class Exercise6_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("P"+"     "+"2^p-1");
System.out.println("__________________");

for(int i=2;i<=31;i++){
	boolean a=isPrime(i);
	boolean b=isMercenesePrime(i);
	
	if(a && b){
		System.out.println(i+"     "+(int)(Math.pow(2, i)-1));
	}
}

	}
	
	
	private static boolean isPrime(int num) {
		// TODO Auto-generated method stub
		for(int divisor=2;divisor<=num/2;divisor++){
			if(num%divisor==0) return false;
		}
		return true;
	}
	
	private static boolean isMercenesePrime(int num) {
		int mPrime=(int)(Math.pow(2, num)-1);
		if(isPrime(mPrime)) return true;
		
		return false;
		
	}
	
}
