package exercise10_1;


public class Time {
private long hour;
private long minute;
private long second;


public Time() {
	// TODO Auto-generated constructor stub
	this(System.currentTimeMillis());
}

public Time(long t){
	long milisec=t;
	long totalsec=milisec/1000;
	long totalmin=totalsec/60;
	long totalhour=totalmin/60;
	
	hour=totalhour%24;
	minute=totalmin%60;
	second=totalsec%60;
}

public Time(long h,long m, long s){
	hour=h;
	minute=m;
	second=s;
}


public long getHour() {
	return hour;
}

public long getMinute() {
	return minute;
}

public long getSecond() {
	return second;
}






}
