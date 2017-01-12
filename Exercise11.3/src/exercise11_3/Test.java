package exercise11_3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Account account=new Account(1,500);
//account.withDraw(300);
CheckAccount checkAccount=new CheckAccount(1,500);

System.out.println(account.toString());
checkAccount.withDraw(700);
System.out.println(checkAccount.toString());
	}

}
