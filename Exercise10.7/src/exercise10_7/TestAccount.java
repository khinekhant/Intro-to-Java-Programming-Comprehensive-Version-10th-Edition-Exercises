package exercise10_7;

import java.util.Scanner;

public class TestAccount {
	public static Scanner input=new Scanner(System.in);
	public static int id;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account[] accounts=new Account[10];
for(int i=0;i<10;i++){
	accounts[i]=new Account(i,100);
}

getUserId(accounts);
while(true){

displayMainMenu(accounts,id);
}

	}

	private static void getUserId(Account[] acc) {
		
		do {
			System.out.print("Enter your id: ");
			id=input.nextInt();
		} while (!isValid(id,acc));

	}
	private static void displayMainMenu(Account[] acc,int id) {
		// TODO Auto-generated method stub
		String[] strings={"check Balance","Withdraw","Deposit","exit"};
		System.out.println("Main Menu");
		for(int i=0;i<strings.length;i++){
			System.out.println((i+1)+": "+strings[i]);
		}
		System.out.println("Enter the choice: ");
		int choice=input.nextInt();
		showReply(choice,acc,id);
		
		
	}

	private static void showReply(int choi, Account[] acc,int id) {
		// TODO Auto-generated method stub
		//String reply;
		switch (choi) {
		case 1:
			System.out.println("The balance is "+acc[id].getBalance());
			break;
		case 2:
			System.out.println("Enter amount to withdraw :");
			double withdraw=input.nextDouble();
			acc[id].withDraw(withdraw);
			break;
		case 3:
			System.out.println("Enter amount to deposit :");
			double deposit=input.nextDouble();
			acc[id].deposit(deposit);
			break;
		case 4:
			getUserId(acc);
			break;

		default:
			System.out.println("Choose the corret number");
		}
	}

	private static boolean isValid(int id, Account[] accounts) {
		// TODO Auto-generated method stub
		for(Account acc:accounts){
			if(acc.getId()==id)
				return true;
			}
		return false;
	}
	

}
