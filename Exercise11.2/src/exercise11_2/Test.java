package exercise11_2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Person person=new Person("khine");
Student student=new Student("kk");
Employee employee=new Employee("Khine k","HR",7000.9,new MyDate());
Staff staff=new Staff("Soe lwin","Doctor");
Faculty faculty=new Faculty(3);

System.out.println(person.toString());
System.out.println(staff.toString());
System.out.println(student.toString());
System.out.println(employee.toString());
System.out.println(faculty.toString());



	}

}
