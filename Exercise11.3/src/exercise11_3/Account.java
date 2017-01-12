package exercise11_3;

import java.util.Date;

public class Account {
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
	    
	    @Override
	    public String toString() {
	    	// TODO Auto-generated method stub
	    	return "Account id "+mId+" balance is "+mBalance;
	    }
}
