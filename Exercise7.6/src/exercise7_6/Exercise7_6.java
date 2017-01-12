package exercise7_6;

public class Exercise7_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUMOFPRIMES=50;
		int count=0;
		
		int[] primeNum=new int[NUMOFPRIMES];
		
		for(int i=2;count<NUMOFPRIMES;i++){
			boolean isPrime=true;
			for(int j=2;j<=Math.sqrt(i);j++){
				if(i%j==0)
					isPrime=false; break;
				
			}
		
		if (isPrime) {
			primeNum[count]=i;
			count++;
		}
		
		}
		
		for(int i=0;i<primeNum.length;i++)
			System.out.print(primeNum[i]+" ");
	}

}
