import java.util.ArrayList;

public class Student {

	
	
	
	
	String name;
	int ID;
	double CGPA;
	
	
	
	public Student(int a , String name, double CGPA ) {
		// TODO Auto-generated constructor stub
	
		this.name=name.toLowerCase();
		this.ID = a;
		this.CGPA = CGPA;
	
	}
	
	
	public String PrintNow()
	{
		return this.ID+" "+this.name+" "+this.CGPA;
		
	}
	
	
	

}
