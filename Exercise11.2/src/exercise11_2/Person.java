package exercise11_2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person{
	protected String name;
	protected String address;
	protected String phone;
	protected String email;
	
	public Person() {
		// TODO Auto-generated constructor stub
		
	}
	
	public Person(String name) {
		// TODO Auto-generated constructor stub
		this.name =name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString(){
		return"Person is "+name;
	}

}

class Student extends Person{
	
	protected static final int FRESHMAN=0;
	protected static final int SOPHOMORE=1;
	protected static final int JUNIOR=2;
	protected static final int SENIOR=3;
	
	public Student(String name) {
		this.name=name;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString(){
		return"Student class";
	}
	
}

class Employee extends Person{
	

	
	protected String office;
	protected double salary;
	protected MyDate datehired;
	
	public Employee() {
		//super();
	}
	public Employee(String name) {
		this(name,null,0,new MyDate());
	}
	
	public Employee(String name,String office, double salary, MyDate datehired) {
		super(name);
		this.office = office;
		this.salary = salary;
		this.datehired = datehired;
		//this.datehired.toString();
	}
	@Override
	public String toString(){
		return"Employee "+name+" and "+datehired;
	}
}

class Staff extends Employee{

	protected String title;
	
	public Staff(String name,String title) {
		super(name);
		this.title=title;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString(){
		return"Staff "+name+" and title is "+title;
	}
}

class Faculty extends Employee{
	protected String officeHours;
	protected int rank;
	
	public Faculty(int rank) {
		//super(name);
		// TODO Auto-generated constructor stub
		this.rank=rank;
	}
	@Override
	public String toString(){
		return"Faculty "+ rank;
	}
}


class MyDate {
	  protected int year;
	  protected int month;
	  protected int day;
	  
	  public MyDate() {
		// TODO Auto-generated constructor stub
		  GregorianCalendar calendar=new GregorianCalendar();
		  year=calendar.get(Calendar.YEAR);
		  month=calendar.get(Calendar.MONTH);
		  day=calendar.get(Calendar.DAY_OF_MONTH);
	}	
	  
	    public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			this.month = month;
		}

		public int getDay() {
			return day;
		}

		public void setDay(int day) {
			this.day = day;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return year+" "+month+" "+day;
		}
}



