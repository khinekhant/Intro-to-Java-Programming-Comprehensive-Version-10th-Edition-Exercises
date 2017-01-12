package exericse6_15;

import java.util.PrimitiveIterator.OfDouble;

import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;

public class Exercise6_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double taxable=50000;
		System.out.printf("%-22s%10s%40s%19s%18s","Taxable Income","Single","Married Joint or Qualifying Windower","Married Seperate","Head of a House");
		System.out.println();
		while(taxable<=60000){
			System.out.printf("%7.0f",taxable);
		for(int i=1;i<=4;i++){
			long tax=Math.round(computeTax(i,taxable));
			System.out.printf("%25d", tax);
		}
		System.out.println();
		taxable+=50;
		}
	}

	private static double computeTax(int status, double taxable) {
		// TODO Auto-generated method stub
		double tax=0.0;
		
		if(status==1) tax=8350*0.10+(33950-8350)*0.15+(taxable-33950)*0.25;  
			
		else if(status==2) tax= 1670.0 + (taxable - 16700.0) * 0.15;
			
		else if(status==3) tax=835.0 + (33950 - 8350.0) * 0.15+(taxable-33950)*0.25;
		
		else if (status==4) tax=1195.0 + (45500 - 11950.0) * 0.15+(taxable-45500)*0.25;
			
		
		return tax;
			
		}
	}


