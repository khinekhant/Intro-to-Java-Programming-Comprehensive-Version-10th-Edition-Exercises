package exercise8_10;

public class Exercise8_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] multi=new int[4][4];
for(int row=0;row<multi.length;row++){
	for(int col=0;col<multi[row].length;col++){
		multi[row][col]=(int)(Math.random()*2);
		//System.out.println(multi[row][col]);
		System.out.print((col+1)%4==0 ? multi[row][col]+"\n":multi[row][col]+" ");
	}
	
}
//System.out.println();
int lrow=largetRow(multi);
System.out.println(lrow);

System.out.println(largetCol(multi));

	}

	private static int largetCol(int[][] m) {
		// TODO Auto-generated method stub
		int lcol=0;
		int numofone=0;
		//int row=0;
		for(int col=0;col<m[0].length;col++){
			int count=0;
			for(int row=0;row<m.length;row++){
				if(m[row][col]==1){
					count++;
				}
				
			}
			if(numofone<count){
				numofone=count;
				lcol=col;
			}
			
		}
		return lcol;
	
	}

	private static int largetRow(int[][] arr) {
		// TODO Auto-generated method stub
		int lrow=0;
		int numofone=0;
		for(int row=0;row<arr.length;row++){
			int count=0;
			for(int col=0;col<arr[row].length;col++){
				if(arr[row][col]==1){
					count++;
				}
				
			}
			if(numofone<count){
				numofone=count;
				lrow=row;
			}
			
		}
		return lrow;
	}
	

}
