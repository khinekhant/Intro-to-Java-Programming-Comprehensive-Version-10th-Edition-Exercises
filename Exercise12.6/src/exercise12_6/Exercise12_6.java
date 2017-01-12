package exercise12_6;

public class Exercise12_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	System.out.println(convertToDeci("AB8C"));
		System.out.println(biToDeci("1001"));

	}
	
	public static int convertToDeci(String hexa){
		int deciValue=0;
		for(int i=0;i<hexa.length();i++){
			//System.out.println(hexa.charAt(i));
		int deci=convetCharToDeci(hexa.charAt(i));
		
		deciValue=deciValue*16+deci;
		}
		return deciValue;
	}
	
	public static int convetCharToDeci(char ch) {
		
		if(ch>='A' && ch<='F'){
			return 10+ch-'A';
		}else if(ch<='9' ) {
			return ch-'0';
		}else {
			throw new NumberFormatException("Invalid char");
		}
	}
	
	public static int biToDeci(String bina) throws BinaryException {
		int decivalue=0;
		for(int i=0;i<bina.length();i++){
			int deci=convertToDeci(bina.charAt(i),i);
			decivalue=decivalue+deci;
		}
		return decivalue;
		
	}

	private static int convertToDeci(char charAt,int i) throws BinaryException {
		// TODO Auto-generated method stub
		String deciString=String.valueOf(charAt);
		Integer deci=Integer.parseInt(deciString);
		
		if(deci == 0 || deci == 1){
			return (int)(Math.pow(2, i))*deci;
			
		}else{
			throw new BinaryException("Invalid binary character");
			
		}
		
	}

}


class BinaryException extends Exception{
	public BinaryException(){
		super("Invalid binary string");
	}
	public BinaryException(String errorMsg){
		super(errorMsg);
	}
	
}
