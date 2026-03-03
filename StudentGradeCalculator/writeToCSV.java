package StudentGradeCalculator;
import java.io.*;
import java.util.*;

public class writeToCSV {

	// write
	public static void sendToCSV(List<Student> students) throws IOException {
		File file = new File("students.csv");
		FileWriter writer = new FileWriter(file);

		writer.write("Student_name,Course,Year,Section,Department,Average_Grade\n");

		for (Student s : students) {
			writer.write(s.toCSV() + "\n");
		}

		System.out.println(file.getAbsolutePath());
		writer.close();
	}

	// read
	public static void readFromCSV() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("students.csv"));
		String line;

		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}

		reader.close();
	}
}