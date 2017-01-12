package exercise5_14;

public class Exercise5_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);

	/*	System.out.print(
			      "Enter the first number: ");
			    int n1 = input.nextInt();

			    // Enter n2
			    System.out.print(
			      "Enter the second number: ");
			    int n2 = input.nextInt();
			   

int d=(n1<n2) ? n1:n2;
for(;d<=n1 && d<=n2;d--){
	if(n1%d==0 && n2%d==0)
	break;
}

System.out.println("GCD is "+d);
*/

/*
 * //Exercise5.15
int count=1;

for(int i='!';i<='~';i++){
	System.out.print(count++ % 10 !=0 ? (char)i+" ":(char)i+"\n");
}*/	  

//Exercise5.16
System.out.print(
	      "Enter the number: ");
	    int num = input.nextInt();
	    String output="";
	    for(int factor=2;factor<=num;factor++){
	    	if(num % factor==0) 
	    		output=Integer.toString(num);
	    		num/=factor;
	    		System.out.println(factor+" for "+output);
	    }

	}
	
}
