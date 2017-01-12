package exercise6_27;

public class Exercise6_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int count=0;


for(int i=13;count<100;i++){
	boolean a=isPrime(i);
	boolean b=isReversePrime(i);
	
	if(a && b){
		count++;
		System.out.print(count%10 != 0 ? i+" ":i+"\n" );
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
	
	private static boolean isReversePrime(int num) {
		// TODO Auto-generated method stub
		int revNum=0;
		int temp=num;
		int re;

		
		while(num>0){
		re=num%10;
		revNum=revNum*10+re;
		num=num/10;
		}
		//System.out.println(revNum);
		
		if(revNum!=temp && isPrime(revNum)){
			return true;
		}
		
		return false;
	}


}
