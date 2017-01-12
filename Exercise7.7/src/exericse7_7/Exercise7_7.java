package exericse7_7;

import java.util.Arrays;

public class Exercise7_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] counts=new int[10];
int num;
for(int i=0;i<100;i++){
	  num = (int)(Math.random()*10);
	  counts[num]++;
}

System.out.print(Arrays.toString(counts));

	}

}
