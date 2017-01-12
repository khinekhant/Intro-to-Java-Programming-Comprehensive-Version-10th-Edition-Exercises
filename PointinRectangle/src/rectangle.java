import java.util.Scanner;import javax.security.auth.x500.X500Principal;

public class rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("Enter x & y coordinates" );
		double x=input.nextDouble();
		double y=input.nextDouble();

		
		
		double xdistance=Math.sqrt(Math.pow(x,2));
		double ydistance=Math.sqrt(Math.pow(y,2));
		
		if(xdistance<=10/2 && ydistance<=5.0/2){
			System.out.println("In the circle");
		}else{
			System.out.println("Not in the circle");
		}
		
	}

}
