package ComprableComparator;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class EmployeeDetails {

	public static void main(String[] args) {
List<Employee> emp =Arrays.asList(new Employee(1,"Swati",9110339287l,"swati@gmail.com",2000),new Employee(2,"riya",9110339283l,"riya@gmail.com",1000 ));
   emp.stream().sorted().forEach(System.out::println);
//   for(Employee i : emp) {
//	   Collections.sort(emp);
//   }
//   System.out.println(emp);
//	}
	}
}
