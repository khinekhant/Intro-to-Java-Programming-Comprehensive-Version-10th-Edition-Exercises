package exericse3_32;

public class Exercise3_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1=(int)(Math.random()*10);

int num2;
do{
	num2=(int)(Math.random()*10);
	System.out.println(num1);
	System.out.println(num2);
	if(num1!=num2) 
		break;
	
}while(num1==num2);


	}

}
