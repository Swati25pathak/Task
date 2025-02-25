package ComprableComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Student> student = Arrays.asList(new Student(2,"Swati",10,"ABC"),new Student(10,"Riya",12,"DEF"),new Student(3,"Anaya",2,"DESSF"));

//sort by name in accending
//student.sort((m1, m2) -> m1.getName().compareTo(m2.getName()));
// Sort by name using a comparator
student.sort(Comparator.comparing(Student::getName));

//sort by name in decending
student.sort((m1, m2) -> m2.getName().compareTo(m1.getName()));
//student.sort(Comparator.comparing(Student::getName).reversed());

student.sort((m1, m2) -> Integer.compare(m1.getId(), m2.getId()));

//  for(Student stu : student) {
//	  Collections.sort(student,new NameCollector());
//  }

  System.out.println(student);
	}

}
