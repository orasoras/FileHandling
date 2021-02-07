import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class StudentFile {
	private File myFile;
	
	public void createFile(String fileName) {
		try {
			myFile = new File(fileName);
			if(myFile.exists()) {
				System.out.println(fileName + " exists");
			}
			else {
				System.out.println("..File created..");
			}
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
	 }
	
	
	public void WriteFile(ArrayList<Student> list) {
		try (BufferedWriter  w = new BufferedWriter(new FileWriter(myFile))){
			w.write("---- STUDENT DATA ----\n");
			for (Student student: list) {
				w.append(student.printStudent());
				w.append("\n");
			}
			System.out.println("\nText written in the file\n");
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void readFile() {
		String line = "";
		try (BufferedReader reader = new BufferedReader(new FileReader(myFile))){
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
