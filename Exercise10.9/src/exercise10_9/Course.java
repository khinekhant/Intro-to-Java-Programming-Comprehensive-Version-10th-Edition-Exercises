package exercise10_9;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Course {
	private String courseName;
	private String[] students = new String[100];
	 private int numberOfStudents;
	
	 public Course(String courseName) {
	 this.courseName = courseName;
	 }
	
	 public void addStudent(String student) {
		 if(numberOfStudents>=students.length){
			 String[] tempStu=new String[students.length*2];
			 System.arraycopy(students, 0, tempStu, 0, students.length);
			 students=tempStu;
		 }
	 students[numberOfStudents++] = student;
	// numberOfStudents++;
	 }
	
	public String[] getStudents() {
	 return students;
	}
	
	 public int getNumberOfStudents() {
	 return numberOfStudents;
	 }
	
	 public String getCourseName() {
	 return courseName;
	 }
	
	 public void dropStudent(String student) {
	// Left as an exercise in Programming Exercise 10.9
		 for(int i=0;i<students.length;i++){
				if(students[i].equals(student)){
					students[i]=null;
					numberOfStudents-=1;
					break;
			    }
		 }
		 
	 }
	 
	 public void clear(){
		 Arrays.fill(students, null);
		 numberOfStudents=0;
	 }
}
