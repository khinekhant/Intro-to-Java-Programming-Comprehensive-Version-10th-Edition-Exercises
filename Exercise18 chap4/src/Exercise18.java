import java.util.Scanner;

public class Exercise18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
	        System.out.println("Enter SSN:(format:DDD-DD-DDDD)");
	        String s = input.nextLine();
	        boolean b=s.length()==11;
			if(b && isValid(s)){
	        	System.out.println(s+" is a valid SSN");
	        }else{
	        	System.out.println(s+" is not a valid SSN");
	       
	        }
	}
	public static boolean isValid(String s){
	 
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			/*if(i==3 || i==6){
				if(!isDash(s.charAt(i))) return false;
			}
			if( i!=3 && i!=6 && !Character.isDigit(ch)) return false;*/
			if((i==3 && ch!='-') || (i==6 && ch!='-') ||( i!=3 && i!=6 && !Character.isDigit(ch))) return false; 
		}
		return true;
		
	}
	
	/*public static boolean isDash(char c){
		return (c=='-');
	}*/
}
	        
	


