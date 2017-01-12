package exercise6_30;

public class Exercise6_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int win=0;
		for(int i=0;i<10000;i++){
int sum=rolDicesum();
switch(sum){
case 2:
case 3:
case 12:
	System.out.println("You got "+sum);
	System.out.println("You lose");
	break;
case 7:
case 11:
	System.out.println("You got "+sum);
	System.out.println("You win");
	win++;
	break;
case 4:
case 5:
case 6:
case 8:
case 9:
case 10:
	int stallValue=sum;
	System.out.println("You got "+stallValue);
	System.out.println("Point is "+stallValue);
	
	int newSum=0;
	
	while(true){
	 newSum=rolDicesum();
	 if(newSum==stallValue){
			System.out.println("You got "+newSum);
			System.out.println("You fucking win");
			win++;
			break;
		}
	    if(newSum==7) {
			System.out.println("You got "+newSum);
			System.out.println("You fucking lose");
			break;
		}
	 
	}

	}
System.out.println(win);
		}
}
	
	private static int rolDicesum() {
		int d1=1+(int)(Math.random()*6);
		//System.out.println(d1);
		int d2=1+(int)(Math.random()*6);
		int sum=0;
		sum=d1+d2;
		
		return sum;
		
	}
		
	
}

