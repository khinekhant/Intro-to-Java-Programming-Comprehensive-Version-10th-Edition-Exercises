package exercise10_5;

import java.util.List;
import java.util.ArrayList;

public class PrimeFactor {

	private int num;
	public PrimeFactor(int num) {
		// TODO Auto-generated constructor stub
		this.num=num;
	}
	
	public List<Integer> getPrimeFactor(){
		ArrayList<Integer> factor=new ArrayList<>();
		//StringBuilder sBuilder=new StringBuilder();
		for(int div=2;div<=num;div++){
			while(num%div==0){
				  num/=div;
				  factor.add(div);
				
			}
		}
		//if(num>1) factor.add(num);
			
		return factor;
		
	}

}
