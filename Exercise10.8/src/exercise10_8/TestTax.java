package exercise10_8;

public class TestTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] bracketsFor2001 = {
			      {27050, 65550, 136750, 297350}, // Single filer
			      {45200, 109250, 166500, 297350}, // married filing jointly
			      {22600, 54625, 83250, 148675}, // married filing separately
			      {36250, 93650, 151650, 297350} // head of household
			    };

			    double[] ratesFor2001 = {0.15, 0.275, 0.305, 0.355, 0.391};
			  
			    Tax tax2001=new Tax(0,bracketsFor2001,ratesFor2001,50000);
			    
			    //tax2001.setFilingStatus(filingStatus);
			    System.out.println("\t\tTax Table 2001\t\t");
			    System.out.println("taxable\t Single\t  Married\t Married\t Head of");
			    System.out.println("Income\t      \t  Joint\t\t Separate\t a House");
			    
			    for(int income=50000;income<=60000;income+=1000){
			    	tax2001.setTaxableIncome(income);
			    	tax2001.setFilingStatus(Tax.SINGLE_FILTER);
			    	int tax0=(int) tax2001.getTax();
			    	tax2001.setFilingStatus(Tax.MARRIED_JOINTLY);
			    	int tax1=(int) tax2001.getTax();
			    	tax2001.setFilingStatus(Tax.MARRIED_SEPARATELY);
			    	int tax2=(int) tax2001.getTax();
			    	tax2001.setFilingStatus(Tax.HEAD_OF_HOUSEHOLD);
			    	int tax3=(int) tax2001.getTax();
			    	System.out.print(income+"\t "+tax0+"\t  "+tax1+"\t\t "+tax2+"\t\t "+tax3);
			    	System.out.println();
			    	
			    	
			    }

			    int[][] bracketsFor2009 = {
			      {6000, 27950, 67700, 141250, 307050}, // Single filer
			      {12000 , 46700, 112850, 171950, 307050}, // married filing jointly
			      {6000, 23350, 56425, 85975, 153525}, // married filing separately
			      {10000, 37450, 96700, 156600, 307050} // head of household
			    };

			    double[] ratesFor2009 = {0.1, 0.15, 0.27, 0.30, 0.35, 0.386};
			    
			    
			    
	}

}
