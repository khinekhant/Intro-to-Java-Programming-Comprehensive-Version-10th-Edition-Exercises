package exercise11_4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ARRAYlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Enter numbers(input end when enter 0)");
Integer nums;
ArrayList<Integer> numList=new ArrayList<>();
do{
	nums=input.nextInt();
	 numList.add(nums);
}while(nums!=0);

System.out.println(intMax(numList));
shuffle(numList);
System.out.println(numList);
	}
	
	
	public static Integer intMax(ArrayList<Integer> arrayList){
		
		
		if(arrayList==null || arrayList.size()==0) return null;
		
			Integer max=arrayList.get(0);
			for(int i=1;i<arrayList.size();i++){
				if(arrayList.get(i)>max) {
					max=arrayList.get(i);
					}
				}
			return max;
		
	}
	
	
	//Exercise 11.7
	public static void shuffle(ArrayList<Integer> arrayList){
		//Random random=new Random();
		for(int i=0;i<arrayList.size();i++){
		int r=(int) Math.random()*arrayList.size();
		Integer temp= arrayList.get(r);
		arrayList.set(r, arrayList.get(i));
		arrayList.set(i,temp );
		
	}
	}

}
