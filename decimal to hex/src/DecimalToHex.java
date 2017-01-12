import java.util.Scanner;

public class DecimalToHex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the decimal value");
		int dec=input.nextInt();
		
		if(dec>0 && dec<10){
			System.out.println("Hexadecimal value for "+dec+" is "+dec );
		}else if(dec>=10 && dec<=15){
			System.out.println("Hexadecimal value for "+dec+" is "+(char)(dec-10+'A'));
		}
	}

}
