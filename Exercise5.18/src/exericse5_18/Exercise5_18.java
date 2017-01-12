package exericse5_18;

public class Exercise5_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pattern A
for(int row=1;row<=6;row++){
	for(int col=1;col<=row;col++){
		System.out.printf("%3d",col);
	}
	System.out.println();
}

System.out.println("--------Pattern B--------");

for(int row=6;row>=1;row--){
	for(int col=1;col<=row;col++){
		System.out.printf("%3d",col);
	}
	System.out.println();
}

System.out.println("--------Pattern C--------");

for(int row=1;row<=6;row++){
	for(int col=6;col>=row;col--){
		System.out.printf("%3s"," ");
	}
	for(int num=row;num>=1;num--){
		System.out.printf("%3d",num);
	}
	System.out.println();
}

System.out.println("--------Pattern D--------");
for(int row=1;row<=6;row++){
	for(int col=1;col<=row;col++){
		System.out.printf("%3s"," ");
	
		}
	for(int num=1;num<=7-row;num++){
		System.out.printf("%3d",num);
	}
	System.out.println();
	}
	

}

}


