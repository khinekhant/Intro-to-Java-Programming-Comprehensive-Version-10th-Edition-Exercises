package exercise11_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise11_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter five strings ");
		Mystack mystack=new Mystack();
		
		//String[] five=new String[5];
		for(int i=0;i<5;i++){
			//five[i]=input.next();
			mystack.push(input.next());
			
		}
		
		//if(input.hasNext()){
			
		//}
		//System.out.println(Arrays.toString(five));
		while(!mystack.isEmpty()){
			System.out.print(mystack.pop()+" ");
		}
		
		
		

	}
	

}

class Mystack extends ArrayList<String>{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public boolean isEmpty() {
		return super.isEmpty();
	}
	
	public int getSize() {
		return super.size();
		
	}
	
	public String peek(){
		return super.get(getSize()-1);
	}
	
	public String pop(){
		String string=peek();
		super.remove(getSize()-1);
		return string;
	}
	
	public void push(String s) {
		super.add(s);
		
	}
	
	public String toString() {
		return super.toString();
	}
}
