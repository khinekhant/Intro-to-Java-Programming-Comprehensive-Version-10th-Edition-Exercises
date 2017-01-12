package exercise9_7;

import java.util.Date;

public class Exercise9_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account=new Account(1122,20000);
		account.setAnnualInterestRate(4.5);
		account.withDraw(2500);
		account.deposit(3000);
		account.setmDateCreated(new Date());
		System.out.println(account.getBalance());
		System.out.println(account.getMonthlyInterest());
		System.out.println(account.getmDateCreated());
	}

}

class Account{
	 // private String mName;
	    private int mId;
	    private double mBalance;
	    private double mAnnualInterestRate; // AnnualInterestRate is percentage.
	    private Date mDateCreated;
	    
	    public Account() {
			// TODO Auto-generated constructor stub
	    	//mDateCreated=new Date();
		}
	    
	    public Account(int id,double balance){
	    	//this();
	    	mId=id;
	    	mBalance=balance;
	    }
	    public int getId() {
	        return mId;
	    }

	    public void setId(int id) {
	        mId = id;
	    }

	    public double getBalance() {
	        return mBalance;
	    }

	    public void setBalance(double balance) {
	        mBalance = balance;
	    }

	    public double getAnnualInterestRate() {
	        return mAnnualInterestRate;
	    }

	    public void setAnnualInterestRate(double annualInterestRate) {
	        mAnnualInterestRate = annualInterestRate;
	    }

		public void setmDateCreated(Date mDateCreated) {
			this.mDateCreated = mDateCreated;
		}
		public Date getmDateCreated() {
			return mDateCreated;
		}
	    
	    public double getMonthlyInterestRate() {
			return mAnnualInterestRate/(12*100);
		}
	    
	    public double getMonthlyInterest() {
			return mBalance*getMonthlyInterestRate();
		}
	    
	    public double withDraw(double amount){
	    	return mBalance-=amount;
	    }
	    
	    public double deposit(double amount) {
			
	    	return mBalance+=amount;
		}
}
