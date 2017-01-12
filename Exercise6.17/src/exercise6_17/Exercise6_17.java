package exercise6_17;

public class Exercise6_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
printMatrix(3);
	}

	private static void printMatrix(int n) {
		// TODO Auto-generated method stub
		for(int row=1;row<=n;row++){
			for(int i=1;i<=n;i++){
				System.out.print(Math.round(Math.random())+" ");
			}
			System.out.println();
		}
	}

}
