package extractsubstring;

public class extractstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="khine khant soe lwin";
		String fname=name.substring(0,12);
		System.out.println("My first name is "+fname);
		
		char[] ele= new char[11];
		name.getChars(6, 12, ele,0);
		for(int i=0;i<ele.length;i++){
			System.out.println(ele[i]);
			
			
		}
		char[] ele2=name.toCharArray();
		for(int i=0;i<ele2.length;i++){
			System.out.println(ele2[i]);
			
			
		}
		
	}

}
