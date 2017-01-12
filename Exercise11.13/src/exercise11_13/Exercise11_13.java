package exercise11_13;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten integers ");
		int count=0;
		while(input.hasNext()&& count<10){
		list.add(input.nextInt());
		count++;
		}
		
		System.out.println(list.toString());
		removeDuplicate(list);
		System.out.println(list.toString());

	}
	
	public static void removeDuplicate(ArrayList<Integer> arrayList){
		for(int i=0;i<arrayList.size();i++){
			for(int j=i+1;j<arrayList.size();j++){
				if(arrayList.get(i)==arrayList.get(j)){
					arrayList.remove(j);
				}
			}
		}
	}

}


