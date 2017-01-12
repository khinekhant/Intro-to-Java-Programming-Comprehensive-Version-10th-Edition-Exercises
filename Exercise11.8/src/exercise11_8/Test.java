package exercise11_8;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account1=new Account("Gorge",1000,1122);
		account1.setAnnualInterest(1.5);
		account1.deposit(30);
		account1.deposit(40);
		account1.deposit(50);
		
		account1.withDraw(5);
		account1.withDraw(4);
		account1.withDraw(2);
		
		System.out.println(account1.toString());
		

	}

}
