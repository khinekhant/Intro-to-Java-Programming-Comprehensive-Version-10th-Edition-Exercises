package exercise5_23;

public class Exercise5_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=50000;
double sum=0.0;

for(;n>=1;n--){
	sum+=1.0/n;
}
System.out.println(sum);


double sum1=0.0;

for(int i=1;i<=50000;i++){
	sum1+=1.0/i;
}

System.out.println(sum1);

double summ=0.0;
double division=0.0;
for(int i=1;i<=97;i+=2)
	division=1.0* (i/i+2);
	summ+=division;
System.out.printf("%3.2f",summ);
	}
	

	
}
