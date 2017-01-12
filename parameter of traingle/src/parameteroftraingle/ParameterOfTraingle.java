package parameteroftraingle;

import java.util.Scanner;

public class ParameterOfTraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Enter the edges of the traignle");

double t1=input.nextDouble();
double t2=input.nextDouble();
double t3=input.nextDouble();

boolean b=((t1+t2>t3) && (t2+t3>t1) && (t1+t3>t2));

if(b){
	System.out.println(t1+t2+t3);
}else{
	System.out.println("Input invalid");
}
	}

}
