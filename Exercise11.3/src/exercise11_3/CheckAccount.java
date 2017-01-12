package exercise11_3;

public class CheckAccount extends Account{
private static final int OVERDRAFT_LIMIT=-200;


public CheckAccount(int id ,double balance) {
	// TODO Auto-generated constructor stub
	super(id,balance);
	
}

@Override
public double withDraw(double amount) {
	// TODO Auto-generated method stub
	if(getBalance()-amount>=OVERDRAFT_LIMIT){
		return super.withDraw(amount);
	}
	return super.withDraw(0);
	 
}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The checking account balance is "+getBalance();
	}

}
