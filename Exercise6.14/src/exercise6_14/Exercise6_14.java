package exercise6_14;

public class Exercise6_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("  i"+"\t"+"m(i)");
		
for(int i=1;i<1000;i+=100){
	
System.out.printf("%3d%10.4f",i,m(i));
System.out.println();
}
	}

	private static double m(int i) {
		// TODO Auto-generated method stub
		double sum=0.0;
		
		for(double k=1;k<=i;k++){
			sum+=Math.pow(-1, k+1)/(2*k-1);
		}
		
		double returnResult=4*sum;
		
		return returnResult;
	}

}
