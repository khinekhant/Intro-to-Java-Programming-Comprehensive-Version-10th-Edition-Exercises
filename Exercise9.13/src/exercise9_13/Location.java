package exercise9_13;

public class Location {
	public int row;
	public int column;
	public double maxValue;
	
	public Location(int row,int column,double maxValue){
		this.row=row;
		this.column=column;
		this.maxValue=maxValue;
	}
	
	public static Location locateLargest(double[][] a) {
		int r=0;
		int c=0;
		double max=a[r][c];
		
		for(int row=0;row<a.length;row++){
			for(int col=0;col<a[row].length;col++){
				if(max<a[row][col]){
					max=a[row][col];
					r=row;
					c=col;
				}
			}
		}
		return new Location(r, c, max);
		
	}

}
