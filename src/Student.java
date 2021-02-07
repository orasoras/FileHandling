
public class Student{
	
	private String name;
	private String course;
	private int grade;
	
	public Student(String name, String course, int grade){
		this.name =name;
		this.course = course;
		this.grade = grade;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public String printStudent() {
		String str = "Name: " + getName()+", Course: "+getCourse()+", Grade: "+getGrade();
		return str;
	}
	
	
}
