package exercise10_8;

public class Tax {

public static final int SINGLE_FILTER=0;
public final static int MARRIED_JOINTLY = 1;
public final static int MARRIED_SEPARATELY = 2;
public final static int HEAD_OF_HOUSEHOLD = 3;

public int filingStatus;

public int[][] taxBrackets;
public double[] rates;
public double taxableIncome;



public Tax() {
	// TODO Auto-generated constructor stub
}

public Tax(int fS,int[][] taxB,double[] r,double taxI){
	filingStatus=fS ;
	taxBrackets=taxB;
	rates=r;
	taxableIncome=taxI;
}

public int getFilingStatus() {
	return filingStatus;
}


public void setFilingStatus(int filingStatus) {
	this.filingStatus = filingStatus;
}


public int[][] getTaxBrackets() {
	return taxBrackets;
}


public void setTaxBrackets(int[][] taxBrackets) {
	this.taxBrackets = taxBrackets;
}


public double[] getRates() {
	return rates;
}


public void setRates(double[] rates) {
	this.rates = rates;
}


public double getTaxableIncome() {
	return taxableIncome;
}


public void setTaxableIncome(double taxableIncome) {
	this.taxableIncome = taxableIncome;
}

public double getTax(){
	double tax=0;
	//double taxable=taxableIncome;
		if(taxableIncome<=taxBrackets[filingStatus][0]){
			tax=taxableIncome*rates[0];
			return tax;
		}else{
			tax=taxBrackets[filingStatus][0]*rates[0];
		}
			
			for(int i=1;i<taxBrackets[filingStatus].length;i++){
				if(taxableIncome>taxBrackets[filingStatus][i]){
					tax+=(taxBrackets[filingStatus][i]-taxBrackets[filingStatus][i-1])*rates[i];
				}else{
				tax+=(taxableIncome-taxBrackets[filingStatus][i-1])*rates[i];
				break;
			}
	

}
			return tax;
}	

}
