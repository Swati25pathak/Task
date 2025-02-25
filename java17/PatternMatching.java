package java17;

public class PatternMatching {

	
	public static String dayOFWeek(int dayNum) {
		String day;
		switch(dayNum) {
		case 1:
			day="Monday" ;
			break;
		case 2:
			day="Tuesday" ;
			break;
		case 3:
			day="Wednesday" ;
			break;
		default :
		day="good day";
		break;
		}

		return day;	
	}
	
	public static void main(String[] args) {
		System.out.println(dayOFWeek(3));
		
		
	}
}
