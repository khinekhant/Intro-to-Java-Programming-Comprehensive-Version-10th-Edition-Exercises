package employee;

public class employeedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e1=new Employee("kk",11411,"fist","student");
Employee e2=new Employee("sl",11412);
Employee e3=new Employee();
e2.setdepa("FOB");
e2.setpo("Stuff");
System.out.println("Name"+"  "+"ID Number"+"  "+"Department"+"  "+"Position");
System.out.println("________________________________________________________________");
System.out.println(e1.getname()+"      "+e1.getid()+"     "+e1.getdepa()+"     "+e1.getpo());
System.out.println(e2.getname()+"      "+e2.getid()+"     "+e2.getdepa()+"     "+e2.getpo());
System.out.println(e3.getname()+"      "+e3.getid()+"     "+e3.getdepa()+"     "+e3.getpo());

	}

}
