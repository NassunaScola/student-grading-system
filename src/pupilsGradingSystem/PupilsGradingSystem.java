package pupilsGradingSystem;
import java.util.Scanner;
public class PupilsGradingSystem {

	public static void main(String[] args) {
		
				        Scanner scanner = new Scanner(System.in);

				        // Number of students
				        System.out.print("Enter the number of students: ");
				        int numStudents = scanner.nextInt();

				        // Array to store scores
				        int[] scores = new int[numStudents];

				        // Get scores from the user
				        for (int i = 0; i < numStudents; i++) {
				            System.out.print("Enter the score for student " + (i + 1) + ": ");
				            scores[i] = scanner.nextInt();
				        }

				        // Assign grades
				        System.out.println("\nGrades for students:");
				        for (int i = 0; i < numStudents; i++) {
				            System.out.print("Student " + (i + 1) + " with score " + scores[i] + " has grade: ");
				            if (scores[i] >= 90) {
				                System.out.println("A");
				            } else if (scores[i] >= 80) {
				                System.out.println("B");
				            } else if (scores[i] >= 70) {
				                System.out.println("C");
				            } else if (scores[i] >= 60) {
				                System.out.println("D");
				            } else {
				                System.out.println("F");
				            }
				        }

				        scanner.close();
				    }
					

		

	}


