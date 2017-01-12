package exercise5_34;

import java.util.Scanner;

public class Exercise5_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


Scanner input = new Scanner(System.in);


int winCount=0;

int user;
int computer;
do{
	
	 computer=(int)(Math.random()*3);
	
	System.out.print("Enter 0 for scissor, 1 for rock, 2 for paper: ");
     user = input.nextInt();
	switch(user){
	case 0:
		if(computer!=1) winCount++;
		else winCount--;
	case 1:
		if(computer!=2) winCount++;
		else winCount--;
		
	case 2:
		if(computer !=0) winCount++;
		else winCount--;
	
	}
}while(winCount<=2 || computer==user ||winCount<=-2);


System.out.println(winCount>2 ? "User win more than 2 times":"Computer win more than 2 times");
	
	
	}
	
private String getString(int num){
	String s="";
	switch(num){
	case 0:
		s="scissor";
	case 1:
		s="rock";
	case 2:
		s="paper";
	}
	return s;
	
}
}
