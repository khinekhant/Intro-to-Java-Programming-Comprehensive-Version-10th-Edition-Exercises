package exercise6_24;

public class exercise6_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
long milisec=System.currentTimeMillis();

long totalSec=milisec/1000;
int currentSec=(int)(totalSec%60);

long totalMin=totalSec/60;
int currentMin=(int)(totalMin%60);

long totalHours=totalMin/60;
int currentHours=(int)(totalHours%24)+8;

long totalDay=totalHours/24;

int startYear=2010;
while(daysForYears(startYear)<totalDay){
	startYear++;
}
  
int currentMonth=getCurrentMonth(startYear,totalDay);

int currentDate=getCurrentDate(startYear, totalDay, currentMonth);

System.out.println(startYear+" "+currentDate);

}

	private static boolean leapyear(int year) {
		// TODO Auto-generated method stub
		return (year%4==0 || year%400==0) && year%100!=0;
	}
	
	private static int getCurrentMonth(int year,long totaldays){
		
		int month=0;
		int totalDaysUptoLastYear=daysForYears(year-1);
		int remainingDaysForThisYear=(int)totaldays-totalDaysUptoLastYear;
		int daysInRemainingMonth=0;
		
		while(daysInRemainingMonth<remainingDaysForThisYear){
			month++;
			daysInRemainingMonth+=getNumofDaysInMonth(year, month);
			
		}
		
		
		return month;
	}
	private static int getCurrentDate(int year,long totaldays,int month){
	int totalDaysUptoLastMonth=0;
	for(int i=1;i<=month-1;i++){
		totalDaysUptoLastMonth+=getNumofDaysInMonth(year, i);
	}
	int totalDaysUptoLastYear=daysForYears(year-1);
	int remainingDaysForThisYear=(int)totaldays-totalDaysUptoLastYear;
	int currentDate=remainingDaysForThisYear-totalDaysUptoLastMonth;
	
	//System.out.println(startYear+" "+totalDaysUptoLastMonth);
	return currentDate;
	}
	
	private static int daysForYears(int year){
		int i;
		int days=0;

		for(i=1970;i<=year;i++){
			
			if(leapyear(i)) {
				days+=366;
			}
			else{
				days+=365;	
			}	

		}

		return days;
	}
	
	
	private static int getNumofDaysInMonth(int year,int month){
		  
			    if (month == 1 || month==3 || month == 5 || month == 7 ||
			      month == 8 || month == 10 || month == 12)
			      return 31;

			    if (month == 4 || month == 6 || month == 9 || month == 11)
			      return 30;

			    if (month == 2)
			      if (leapyear(year))
			        return 29;
			      else
			        return 28;

			    return 0; 
			  }
	
	


}
