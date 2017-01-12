
public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	double tuition=10000;
		final double INTEREST_RATE=0.05;
		double FourYearsTotal;
		
		for(int i=0;i<10;i++){
			tuition*=(1+INTEREST_RATE);
		}
		
		System.out.printf("Tuition in ten years %5.2f",tuition);
		System.out.println();
		
		FourYearsTotal=tuition;
		
		for(int year=0;year<4;year++){
			FourYearsTotal+=(1.05*FourYearsTotal);
		}
		System.out.printf("Total of 4 years after 10 years %5.2f",FourYearsTotal);
		
		*/
		
		int i = 0;
		while (i <= 4) {
		method1(i);
		i++;
		}
		System.out.println("i is " + i);
		}
		public static void method1(int i) {
		do {
		if (i % 3 != 0)
		System.out.print(i + " ");
		i--;
		}
		while (i >= 1);
		System.out.println();
	}

}
