package StudentGradeCalculator;

public class Student {
	String studentName;
	String course;
	int year;
	String section;
	String department;
	double averageGrade;

	public Student(String studentName, String course, int year, String section, String department, double averageGrade) {
		this.studentName = studentName;
		this.course = course;
		this.year = year;
		this.section = section;
		this.department = department;
		this.averageGrade = averageGrade;
	}

	public String toCSV() {
		return studentName + "," + course + "," + year + "," + section + "," + department + "," + averageGrade;
	}
}