import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrencyExchange {
	public static void main(String[] args) {
		
		double output=0.0;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter 0 for US dollar to China & 1 for China to US dollar");
	int exchange=input.nextInt();
	
	System.out.println("Enter exchange rate");
	double rate=input.nextDouble();
	
	System.out.println("Enter amount");
	double amount=input.nextDouble();
	
	if(exchange==0){
		output=amount*rate;
	}else if(exchange==1){
		output=amount/rate;
	}
	DecimalFormat format=new DecimalFormat("0.00");
	System.out.println(format.format(output));
	}
}
