package exercise5_33;

public class Exercise5_33 {
	/*
	 * A positive integer is called a perfect number if it is equal to
	the sum of all of its positive divisors, excluding itself. For example, 6 is the first
	perfect number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2
	+ 1. There are four perfect numbers less than 10,000. Write a program to find all
	these four numbers.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


int d;
		for(int i=6;i<=10000;i++){
			int sum=0;
			for(d=1;d<=i/2;d++){
				if(i%d==0){
				sum+=d;
			
				}
			}
				
			if( i==sum){	
				System.out.println(i);
			}
		
		}
	}

}
