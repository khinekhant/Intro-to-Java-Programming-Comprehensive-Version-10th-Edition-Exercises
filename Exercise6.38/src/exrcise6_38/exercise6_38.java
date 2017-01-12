package exrcise6_38;

public class exercise6_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*final int PER_LINE=10;
int count1=0;
for(int i=0;i<100;i++){
	
	count1++;
	System.out.print(count1%PER_LINE!=0 ? generateRandomUpperCase()+" ": generateRandomUpperCase()+"\n");
	
	
}
int count=0;
for(int i=0;i<100;i++){
	
	count++;
	System.out.print(count%PER_LINE!=0 ? generateRandomDigit()+" ": generateRandomDigit()+"\n");
	
	
}


	}
	
	private static char generateRandomChar(char ch1,char ch2){
		return (char)(ch1+Math.random()*(ch2-ch1+1));
	}
	
	private static char generateRandomUpperCase() {
		return generateRandomChar('A', 'Z');
	}
	
	private static char generateRandomDigit() {
		return generateRandomChar('0', '9');*/
		
			int[] list = {1, 2, 3, 4, 5};
			reverse(list);
			for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
			}
			
	
     public static void reverse(int[] list) {
	int[] newList = new int[list.length];
	for (int i = 0; i < list.length; i++)
	newList[i] = list[list.length - 1 - i];
	list=newList;
	}
	

}
