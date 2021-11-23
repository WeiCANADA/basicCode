package week9;

public class Student{

	private String name;
	private int id;
	private int numCourses;
	private final double RATE;
	
	public Student(String name, int id, int numCourses){
		this.name = name;
		this.id = id;
		this.numCourses = numCourses;
		RATE = 850;
	}

	public String getName(){
		return name;
	}

	public int getId(){
		return id;
	}
	
	public double tuition(){
		return numCourses * RATE;
	}
}
