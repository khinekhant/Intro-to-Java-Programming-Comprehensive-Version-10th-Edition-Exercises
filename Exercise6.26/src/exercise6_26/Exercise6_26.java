package exercise6_26;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Exercise6_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=2;count<100;i++){
			if(checkPrime(i)&& checkPali(i)){
				count++;
				System.out.print(count%10 != 0 ? i+" ":i+"\n");
				
			}
          
		}
	}
	
	private static boolean checkPrime(int num){
		int totalnum=0;

			for(int divisor=2;divisor<=num/2;divisor++){
				if(num%divisor==0) return false;
			}
			return true;

	}
	private static boolean checkPali(int num) {
	
			String a=Integer.toString(num);
			for(int j=0,k=a.length()-1;j<a.length()/2;j++,k--){
				char ch1=a.charAt(j);
				char ch2=a.charAt(k);
				if(ch1!=ch2) 
					return false;
			}
			
			return true;
		}
		

}
