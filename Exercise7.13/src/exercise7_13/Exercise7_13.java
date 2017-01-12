package exercise7_13;

public class Exercise7_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(getRandom(2,3,4,5,6,7,8,34,54,33,23,12));
	}
	
	private static int getRandom(int... numbers) {
		boolean isInArray=false;
		int num=(int)(1+Math.random()*55);
		
		for(int i=0;i<numbers.length;i++){
			if(numbers[i]==num){ 
				isInArray=true;
				break;
			}
	
		}
		
		if(!isInArray){
		return num;
		}
		return 0;
		
	}

}
