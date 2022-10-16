package programs;

public class Student {
	private String name;
	private String course;
	private int age;
	private Subject subject;
	public Student(String name, String course, int age, Subject subject) {
		super();
		this.name = name;
		this.course = course;
		this.age = age;
		this.subject = subject;
	}
	
	public void Display()
	{
		System.out.println(name+course+age+subject.getName());
	}

	
}
