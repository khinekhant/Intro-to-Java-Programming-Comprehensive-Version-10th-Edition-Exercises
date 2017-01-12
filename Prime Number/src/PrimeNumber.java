
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int count=0;	
	
	final int NUMBER_PER_LINE=10;
	int i;
	int divisor;
	for(i=2;count<50;i++){
		boolean isPrime=true;
		for(divisor=2;divisor<=i/2;divisor++){
		if(i%divisor==0){
			isPrime=false;
			break;
		}
	}
		
		if(isPrime){
			count++;
			if(count%NUMBER_PER_LINE==0) System.out.println(i);
		    else System.out.print(i+"  ");
		}
		
	 }
	
		
	}
}


