package exercise10_23;

public class MyString2 {
	public String string;
	
	public MyString2(String s) {
		// TODO Auto-generated constructor stub
		string=s;
	}
	public String getString() {
		return string;
	}
	public int compare(String s){
		for(int i=0;i<s.length();i++){
			if(string.charAt(i)>s.charAt(i)) return -1;
			else if(string.charAt(i)<s.charAt(i)) return 1;
			//else if(string.charAt(i)==s.charAt(i)) return 0;
		}
		
		return 0;
	}
	
	public String subString(int begin){
		char[] subs=new char[string.length()-begin];
		for(int i=begin;i<string.length();i++){
			subs[i-begin]=string.charAt(i);
		}
		return new String(subs);
	}
	
	public MyString2 toUpperCase(){
		char[] upper=string.toCharArray();
		for(int i=0;i<upper.length;i++){
		     Character.toUpperCase(upper[i]);
		}
		return new MyString2(new String(upper));
	}
	
 
}
