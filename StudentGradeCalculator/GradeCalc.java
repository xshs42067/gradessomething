package StudentGradeCalculator;

public class GradeCalc {

	public static double calculateAverage(double[] grades) {
		double sum = 0;
		for (double grade : grades) {
			sum += grade;
		}
		return sum / grades.length;
	}
}