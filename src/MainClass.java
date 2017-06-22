import java.util.ArrayList;
import java.util.Collections;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> myObj = new ArrayList<>();
		myObj.add(new Student(33, "A", 3.68));
		myObj.add(new Student(85, "B", 3.68));
		myObj.add(new Student(56, "C", 3.75));
		myObj.add(new Student(57, "C", 3.75));
		myObj.add(new Student(22, "E", 3.76));

		Collections.sort(myObj, new SortbyCGPA());

		ArrayList<Student> myObj1 = new ArrayList<>();
		int index_start = 0, help_temp = 0;

		boolean flag = false;

		for (int i = 1; i < myObj.size(); i++) {

			if (myObj.get(i).CGPA == myObj.get(i - 1).CGPA) {

				flag = true;
				help_temp++;

				if (help_temp == 1) {

					myObj1.add(myObj.get(i - 1));
					index_start = i - 1;

				}

				myObj1.add(myObj.get(i));

			} else {

				if (flag == true) {

					Collections.sort(myObj1, new SortbyName());

					int q = myObj1.size() - 1;
					for (int j = index_start; j < i; j++) {

						myObj.set(j, myObj1.get(q));

						q--;
					}
					myObj1.clear();
				}

				flag = false;
				help_temp = 0;
			}

		}

		// Second part

		myObj1.clear();
		index_start = 0;
		help_temp = 0;

		flag = false;
		
		System.out.println(myObj.size());
		

		for (int i = 1; i < myObj.size(); i++) 
		{

			if (myObj.get(i).name.equals(myObj.get(i - 1).name)) {

				flag = true;
				help_temp++;

				if (help_temp == 1) {
					myObj1.add(myObj.get(i - 1));
					index_start = i - 1;
				}
			
				myObj1.add(myObj.get(i));

			} else {

				if (flag == true) {

					Collections.sort(myObj1, new SortbyID());

					int q = 0;
					for (int j = index_start; j < i; j++) {

						myObj.set(j, myObj1.get(q));

						q++;
					}

				}

				flag = false;
				help_temp = 0;
			}

		}

		for (int ii = myObj.size() - 1; ii >= 0; ii--)
			System.out.println(myObj.get(ii).PrintNow());

	}

}
