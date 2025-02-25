package ComprableComparator;

import java.util.Comparator;
import java.util.stream.Collector;

public class NameCollector implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return -o2.getId()-o1.getId();
	}
	
//	@Override
//	public int compare(Student o1, Student o2) {
//		// TODO Auto-generated method stub
//		return o1.getName().compareTo(o2.getName());
//	}
	

}
