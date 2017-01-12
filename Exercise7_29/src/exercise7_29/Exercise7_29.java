package exercise7_29;

import java.util.Arrays;

public class Exercise7_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	final int NUM_OF_CARDS=52;
	//int[] cards=pick4Cards(NUM_OF_CARDS);
	sumOf4Cards(NUM_OF_CARDS);
		
	
	
	
	}

	private static void sumOf4Cards(int cards) {
		// TODO Auto-generated method stub
		int sum;
		int[] fourCards;
		do{
			sum=0;
			fourCards=pick4Cards(cards);
			for(int i=0;i<fourCards.length;i++){
				sum+=fourCards[i];
			}
		}while(sum != 24);
		
		//System.out.println(Arrays.toString(fourCards));
		if(sum==24) printPicks(fourCards);
		//return sum;
	}

	
	private static int[] pick4Cards(int cards) {
		// TODO Auto-generated method stub
		int[] four=new int[4];
		for(int i=0;i<four.length;i++){
		int num=(int)(Math.random()*cards);
		four[i]=num%13;
		}
		
		return four;
		
	}
	
	private static void printPicks(int[] fourCards) {
		// TODO Auto-generated method stub
		String[] ranks={"Ace","2","3","4", "5", "6", "7", "8", "9","10", "Jack", "Queen", "King"};
		System.out.println("The number of picks that yields the sum of 24: ");
		for(int i=0;i<fourCards.length;i++){
			int pickCard=fourCards[i];
			String rank=ranks[pickCard-1];
			System.out.print(rank+" ");
			
		}
	}

	
	
}
