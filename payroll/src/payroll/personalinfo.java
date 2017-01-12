package payroll;

public class personalinfo {
private String name;
private int idnumber;
private double payrate;
private double hours;

public personalinfo(String n,int id){
	name=n;
	idnumber=id;
	payrate=0.0;
	hours=0.0;
	
}
public void setpayrate(double pay){
	payrate=pay;
}
 public void sethours(double h){
	 hours=h;
 }
 public String getname(){
	 return name;
 }
 public int getid(){
	 return idnumber;
 }
 public double getpayrate(){
	 return payrate;
 }
 public double gethours(){
	 return hours;
 }
 public double grosspay(double p,double h){
	 double gp=p*h;
	 return gp;
 }
}
