import java.util.ArrayList;

public class MainStudentFile {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("Tom Smith", "Math",80));
		list.add(new Student("Amy Green", "Bio",85));
		list.add(new Student("Eddy Ben", "Computer",70));
		list.add(new Student("Nadia Jimmy", "Math",80));
		
		StudentFile  studentFile= new StudentFile();
		studentFile.createFile("student.txt");
		studentFile.WriteFile(list);
		studentFile.readFile();
	
	}

}
