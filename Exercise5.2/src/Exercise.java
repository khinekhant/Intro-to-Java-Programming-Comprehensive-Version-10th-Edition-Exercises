
public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.printf("%-12s%-6s","KiloGram","Pound");
		System.out.print("\t|\t");
		System.out.printf("%-6s%-12s", "Pound","Kilogram");
		System.out.println();
		
		
for(int i=1,j=20;i<200;j+=5,i+=2){
	    //System.out.print(i);
		System.out.printf("%-12d%-6.2f",i,i*2.2);
		System.out.print("\t|\t");
		//System.out.print(j);
		System.out.printf("%-6d%-12.2f", j,j/2.2);
		System.out.println();
	
	
	
}
	}

}
