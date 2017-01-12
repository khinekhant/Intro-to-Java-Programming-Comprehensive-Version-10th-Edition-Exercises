package exercise6_12;

public class Exercise6_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
printChars('1','z',10);
	}

	private static void printChars(char c, char d, int numPerLine) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=c;i<=d;i++){
			//char ch=(char)(c+Math.random()*(d-c+1));
			count++;
			System.out.print(count%numPerLine!=0? (char)i+" ":(char)i+"\n");
		}
	}

}
