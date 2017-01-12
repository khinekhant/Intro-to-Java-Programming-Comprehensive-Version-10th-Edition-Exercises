package employee;

public class Employee {
	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	public Employee(String n,int idn,String dep,String posi){
		name=n;
		idNumber=idn;
		department=dep;
		position=posi;
	}
public Employee(String n,int idn){
	name=n;
	idNumber=idn;
	department="";
	position="";
}

public Employee(){
	name="";
	idNumber=0;
	department="";
	position="";
	
}
public void setname(String n){
	name=n;
}
public void setid(int id){
	idNumber=id;
}
public void setdepa(String dep){
	department=dep;
}
public void setpo(String posi){
	position=posi;
}
public String getname(){
	return name;
}
public String getdepa(){
	return department;
}
public String getpo(){
	return position;
}
public int getid(){
	return idNumber;
}


}
