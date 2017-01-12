import java.util.Scanner;

public class Exercise5_45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        double total=0.0;
        double total1=0.0;
       
        for(int i=0;i<10;i++){
        	double number=input.nextDouble();
        	total+=number;
        	total1+=i*i;
        }
        
        double mean=total/10;
        double todeviation=(total1-total*total/10.0)/9.0;
        double deviation=Math.sqrt(todeviation);
        System.out.println(deviation);
        System.out.println(mean);
        
        
	}

}
