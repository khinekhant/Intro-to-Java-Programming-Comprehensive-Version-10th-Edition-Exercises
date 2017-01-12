package exercise6_13;

public class Exercise6_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("i"+"\t\t"+"m(i)");
		sumSeries(20);
	}

	private static void sumSeries( int num2) {
		// TODO Auto-generated method stub
		
		double sum=0.0;
		
		for(double i=1;i<=num2;i++ ){
			
			sum+=i/(i+1);
			System.out.println(i+"\t\t"+sum);
		}
	}

}
