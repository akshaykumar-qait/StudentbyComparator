import java.util.Comparator;

public class SortbyID implements Comparator<Student> {

	@Override
	public int compare(Student arg0, Student arg1) {
		// TODO Auto-generated method stub
		return arg0.ID - arg1.ID;

	}
	
	
	
	
}
