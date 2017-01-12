package exercise11_17;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter an integer:");
		
		int num= input.nextInt();
		
		ArrayList<Integer> factors=new ArrayList<>();
		
	
		    int number=num;
			for(int i=2;i<=number;){
				if(number%i==0){
				factors.add(i);
				//count++;
				number/=i;
				}else {
					i++;
				}
			}
		
		
		//System.out.println(factors.toString());
			int n=findN(factors);
			System.out.println(n);
			System.out.println("m*n: "+(num*n));
			

	}
	
	public static int findN(ArrayList<Integer> list){
		
		
		ArrayList<Integer> posiN=new ArrayList<>();
		for(int i=0;i<list.size();i++){
			int count=1;
			for(int j=0;j<list.size();j++){
				if(i!=j && (list.get(i)==list.get(j))) count++;
				
			}
			
			if(count%2!=0) posiN.add(list.get(i));
		}
		removeDuplicate(posiN);
		int n=0;
		if(posiN.size()>1){
		for(int i=0;i<posiN.size()-1;){
			n=posiN.get(i)*posiN.get(i+1);
			return n;
		}
		}else return posiN.get(0);
		
		return 0;
	}
	
	public static ArrayList<Integer> removeDuplicate(ArrayList<Integer> list){
		for(int i=0;i<list.size()-1;i++){
			for(int j=i+1;j<list.size();j++){
				if(list.get(i)==list.get(j)){
					list.remove(j);
				}
		   }
		}
		
		return list;
	}
	
}
