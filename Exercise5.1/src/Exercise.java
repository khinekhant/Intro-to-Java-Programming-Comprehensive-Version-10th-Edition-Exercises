import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0;
		int average;
		int positive=0;
		int negative=0;
		int toalNums;
		
		  System.out.print("Enter an integer, the input ends if it is 0: ");
	        Scanner input = new Scanner(System.in);
	        int nums=-1;
	        
	       while(true && nums!=0){
	        	nums=input.nextInt();
	        	if(nums>0) positive++;
	        	else if (nums<0){negative++;}
	        	total+=nums;
	        }
	       toalNums=positive+negative;
	       average=total/toalNums;
	       
	        
	        System.out.println(positive);
	        System.out.println(negative);
	        System.out.println(total);
	        System.out.println(average);
	    
	}

}
