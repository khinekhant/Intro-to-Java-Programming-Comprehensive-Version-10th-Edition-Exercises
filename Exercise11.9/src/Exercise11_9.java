import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.RowFilter;

public class Exercise11_9 {

static ArrayList<Integer> rowIndex=new ArrayList<>();
static ArrayList<Integer> colIndex=new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);

System.out.println("Enter the size of an array ");
int num=input.nextInt();
int[][] array=new int[num][num];

for(int i=0;i<num;i++){
	for(int j=0;j<num;j++){
		int random=(int)(Math.random()*2);
		System.out.print(random);
		array[i][j]=random;
	}
	System.out.println();
}

checkRow(array);
checkCol(array);

System.out.println("The largest row index "+rowIndex);
System.out.println("The largest col index "+colIndex);
	}
	
	public static void checkRow(int[][]arr) {
		int encounterOne=0;
		for(int i=0;i<arr.length;i++){
			int count=0;
			for(int j=0;j<arr[i].length;j++){
				if(arr[i][j]==1) count++;
			}
			
			if(count>encounterOne){
				encounterOne=count;
				rowIndex.clear();
				rowIndex.add(i);
			}else if (count==encounterOne) {
				rowIndex.add(i);
			}
		}
	}
	
	public static void checkCol(int[][] arr){
		int oneOccurance=0;
		for(int j=0;j<arr[1].length;j++){
			int count=0;
			for(int i=0;i<arr.length;i++){
				if(arr[i][j]==1) count++;
			}
			
			if(count>oneOccurance){
				oneOccurance=count;
			    colIndex.clear();
				colIndex.add(j);
				
			}else if (count==oneOccurance) {
				colIndex.add(j);
			}
		}
	}
	
	

}
