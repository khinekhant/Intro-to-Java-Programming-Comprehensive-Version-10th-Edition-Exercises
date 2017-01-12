package stopwatch;

import java.util.Date;

public class Exercise9_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] num=new double[10000];
		
		for(int i=0;i<num.length;i++){
			num[i]=Math.random()*num.length;
		}
		
		Stopwatch stopwatch=new Stopwatch();
		//stopwatch.start();
		for(int i=0;i<num.length-1;i++){
			int smallestIndex=i;
			double sNum=num[smallestIndex];
			
			for(int j=i+1;j<num.length;j++){
				if(sNum>num[j]){
					smallestIndex=j;
					sNum=num[smallestIndex];
				}
			}
			
			if(smallestIndex!=i){
				num[smallestIndex]=num[i];
				num[i]=sNum;
			}
		}
		stopwatch.stop();
		
		System.out.println(stopwatch.getElispedTime());

	}

}

class Stopwatch{
	private long startTime;
	private long endTime;
	
	//Date date=new Date();
	public Stopwatch() {
		// TODO Auto-generated constructor stub
		startTime=System.currentTimeMillis();
		//endTime=startTime;
	}
	
	public void start() {
		startTime=System.currentTimeMillis();
	}
	public void stop() {
		endTime=System.currentTimeMillis();
	}
	
	public long getElispedTime() {
		return endTime-startTime;
	}
}
