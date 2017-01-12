package exercise7_35;

import java.util.Scanner;

public class Exercise7_35 {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String[] word={"bicycle","fuck","apple","football"};
		int count=0;
		
		String randomWord=word[(int)(Math.random()*word.length)];
		
		System.out.print("Enter a letter in word");
		for(int i=0;i<randomWord.length();i++){
			System.out.print("*");
		}
		while(count<randomWord.length()){
		char ch=input.nextLine().charAt(0);
		System.out.print("Enter a letter in word");
		for(int i=0;i<randomWord.length();i++){
			if(randomWord.charAt(i)==ch) {
				
				System.out.print(randomWord.charAt(i));
				count++;
			}
			else System.out.print("*");
		}
		
		
		}
		System.out.println("The word is "+randomWord);
	}*/
	static String[] words = { "programming", "words", "test", "game" };
    static boolean isCorrect;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String playStats = "y";
        while (playStats.equals("y")) {
        	int missCount = 0;
        	showHangMan(missCount);
 
            String word = getWord();
            String hiddenWord = getHiddenWord(word);
            
            while (!word.equals(hiddenWord) && missCount<=6) {

                System.out.print("(Guess) Enter a letter in word " + hiddenWord + " > ");
                char ch = input.next().charAt(0);

                if (!isAlreadyInWord(hiddenWord, ch)) {

                    hiddenWord = getGuess(word, hiddenWord, ch);

                    if (!isCorrect) {
                        System.out.println(ch + " is not in the word.");
                        missCount++;
                        showHangMan(missCount);
                    }

                } else {
                    System.out.println(ch + " is already in word.");
                }
                
                if(missCount==6)
                	break;

            }
            System.out.println("You lost, the man is already hanged. Go and guess in hereafter.");
            System.out.println("The word is "+ word+".You missed "+ missCount +  "times");
            System.out.println("Do you want to guess another word? Enter y or n >");
            playStats = input.next();
        }

    }

    public static String getWord() {
        return words[(int) (Math.random() * words.length)];
    }

    public static String getHiddenWord(String word) {

        String hidden = "";
        for (int i = 0; i < word.length(); i++) {
            hidden += "*";
        }
        return hidden;
    }

    static public String getGuess(String word, String hiddenWord, char ch) {

        isCorrect = false;
        StringBuilder s = new StringBuilder(hiddenWord);
        for (int i = 0; i < word.length(); i++) {

            if (ch == word.charAt(i) && s.charAt(i) == '*') {
                isCorrect = true;
                s = s.deleteCharAt(i);
                s = s.insert(i, ch);
            }
        }
        return s.toString();
    }

    public static boolean isAlreadyInWord(String hiddenWord, char ch) {

        for (int i = 0; i < hiddenWord.length(); i++) {

            if (ch == hiddenWord.charAt(i)) {
                return true;
            }
        }
        return false;
    }
    public static void showHangMan(int mc)
    {
        //System.out.print('\u000C');
        switch (mc) {
		case 0:
			man_0();
			break;
		case 1:
			man_1();
			break;
		case 2:
			man_2();
			break;
		case 3:
			man_3();
			break;
		case 4:
			man_4();
			break;
		case 5:
			completedMan();
			break;
		default:
			break;
		}
           
           
        // you need to add more if statements here!
        
        System.out.println("\n");
    }
    public static void completedMan()
    {
       System.out.println("_____");
       System.out.println("|   |");
       System.out.println("|   o");
       System.out.println("|  /|\\"); //why the double \\, because the \ has special meaning
       System.out.println("|  / \\"); //and so using 2 tell Java to just print the 2nd
    }
    
    public static void man_0()
    {
       System.out.println("_____");
       System.out.println("|   |");
       System.out.println("|   ");
       System.out.println("|   "); //why the double \\, because the \ has special meaning
       System.out.println("|   "); //and so using 2 tell Java to just print the 2nd
    }
    
    public static void man_1()
    {
       System.out.println("_____");
       System.out.println("|   |");
       System.out.println("|   o");
       System.out.println("|    "); //why the double \\, because the \ has special meaning
       System.out.println("|    "); //and so using 2 tell Java to just print the 2nd
    }
    
    public static void man_2()
    {
       System.out.println("_____");
       System.out.println("|   |");
       System.out.println("|   o");
       System.out.println("|   | "); //why the double \\, because the \ has special meaning
       System.out.println("|    "); //and so using 2 tell Java to just print the 2nd
    }
    
    public static void man_3()
    {
       System.out.println("_____");
       System.out.println("|   |");
       System.out.println("|   o");
       System.out.println("|  /| "); //why the double \\, because the \ has special meaning
       System.out.println("|    "); //and so using 2 tell Java to just print the 2nd
    }
    
    public static void man_4()
    {
       System.out.println("_____");
       System.out.println("|   |");
       System.out.println("|   o");
       System.out.println("|  /|\\ "); //why the double \\, because the \ has special meaning
       System.out.println("|    "); //and so using 2 tell Java to just print the 2nd
    }
    
    public static void man_5()
    {
       System.out.println("_____");
       System.out.println("|   |");
       System.out.println("|   o");
       System.out.println("|  /|\\ "); //why the double \\, because the \ has special meaning
       System.out.println("|    \\"); //and so using 2 tell Java to just print the 2nd
    }

}
