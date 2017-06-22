import java.util.Comparator;

class SortbyCGPA implements Comparator<Student> {

	@Override
	public int compare(Student arg0, Student arg1) {

		double change1 = arg0.CGPA;
		double change2 = arg1.CGPA;
		if (change1 < change2)
			return -1;
		if (change1 > change2)
			return 1;
		return 0;

	}
}