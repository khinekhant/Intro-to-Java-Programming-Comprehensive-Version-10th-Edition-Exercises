import java.util.Scanner;

public class Exercise5_46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
        System.out.print("Enter string: ");
        String s = input.nextLine();
        for(int i=s.length()-1;i>=0;i--){
        	System.out.print(s.charAt(i));
        }
	}

}
