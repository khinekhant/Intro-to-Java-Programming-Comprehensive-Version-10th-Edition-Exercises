package exercise10_9;

public class TestCourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Course c1=new Course("Mathematics");
Course c2=new Course("Database Design");

c1.addStudent("Khine");
c1.addStudent("Khant");
c1.addStudent("Lwin");

c2.addStudent("Moe");
c2.addStudent("Shin");

System.out.println("Number of students in course 1: "+c1.getNumberOfStudents());
String[] stu=c1.getStudents();
System.out.println("Students enrolled in course 1 are: ");
for(int i=0;i<c1.getNumberOfStudents();i++){
	System.out.println(stu[i]);
}
c1.dropStudent("Lwin");
System.out.println("Number of students in course 1: "+c1.getNumberOfStudents());
System.out.println("Number of students in course 2: "+c2.getNumberOfStudents());
c1.clear();
String[] stud=c1.getStudents();
System.out.println("Students enrolled in "+c1.getCourseName() +" are: ");
for(int i=0;i<=c1.getNumberOfStudents();i++){
	System.out.println(stud[i]);
}
	}

}
