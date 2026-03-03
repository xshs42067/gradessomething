package StudentGradeCalculator;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		try {
			// array
			List<Student> students = new ArrayList<>();

			// loops to 20 and creates general avg off the loop
			// DONT FORGET TO CLOSE YOUR TEXT EDITORS LIKE EXCEL OR NOTEPAD BEFORE EXECUTING! KAY BASI MAG EROOR ANG CODE
			// update: added a error message just in case nalipatan nyo xd
			
			for (int i = 1; i <= 20; i++) {
				double[] grades = {75 + i % 10, 80 + i % 5, 70 + i % 8};

				double avg = GradeCalc.calculateAverage(grades);

				Student student = new Student("Student" + "(" + i + ")" , "BSIT", 1, "A", "College of ICT", avg);

				students.add(student);
			}

			writeToCSV.sendToCSV(students);
			System.out.println("CSV File Created!\n");
			writeToCSV.readFromCSV();

			//spit out error
		} catch (Exception e) {
			System.out.println("ERROR! File is open on another program. Please close it and try again!");
			System.out.println("Errors: " + e);
		}
	}
}