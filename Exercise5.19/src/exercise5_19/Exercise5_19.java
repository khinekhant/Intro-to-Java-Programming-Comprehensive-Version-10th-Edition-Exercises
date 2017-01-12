package exercise5_19;

public class Exercise5_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		int number=0;
for(int row=0;row<=7;row++){
	for(int col=8;col>=row;col--){
		System.out.printf("%4s", " ");
	}
	for(int num=0;num<=row;num++){
		number=(int)Math.pow(2, num);
	System.out.printf("%4d",number);
	
	}
	for(int num=row-1; num>=0;num--){
	//	if(num==1) System.out.println(num);
		number=(int)Math.pow(2, num);
		System.out.printf("%4d",number);
	}
	System.out.println();
}
	}

}
