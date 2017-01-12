package exercise7_24;

import java.util.Arrays;

public class Exercise7_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] suit={"Club","Diamond","Heart","Spade"};
		String[] rank={"Ace","2","3","4", "5", "6", "7", "8", "9",
			      "10", "Jack", "Queen", "King"};
		int[] fourCards=new int[4];
		final int cards=52;
		
		    int count=0;
		    int index;
		    int numOfPicks=0;
		    while(count<4){
		    numOfPicks++;
			index=(int)(Math.random()*cards);
			if(fourCards[index/13]==0){
				fourCards[index/13]=index;
				count++;	
		}
			
	}
		    System.out.println(Arrays.toString(fourCards));
		    for(int i=0;i<fourCards.length;i++){
		    	String s=suit[fourCards[i]/13];
				String r=rank[fourCards[i]%13];
				System.out.println(r+" of "+s);
		    }
		    System.out.println(numOfPicks);
		   
		    
		/*final int NUMBER_OF_CARDS = 52;
		  String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
		      "10", "Jack", "Queen", "King"};
		    // found indicates whether a suit has been picked
		    boolean[] found = new boolean[4];
		    int[] dCars=new int[4];

		    // Count the number of picks
		    int numberOfPicks = 0;
		    
		    // Count occurrence in each suit
		    int count = 0;
		    while (count < 4) {
		      numberOfPicks++;
		      int index = (int)(Math.random() * NUMBER_OF_CARDS);
		      if (!found[index / 13]) {
		        found[index / 13] = true;
		        dCars[index/13]=index;
		        count++;
		        
		        String suit = suits[index / 13];
		        String rank = ranks[index % 13];
		        System.out.println(rank + " of " + suit);
		      }
		    }
		    System.out.println(Arrays.toString(dCars));
		    System.out.println("Number of picks: " + numberOfPicks);
		    */
		    
  }

}
