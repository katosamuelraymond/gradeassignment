package oopassigment;
import java.util.Scanner;
public class Gradeassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        //here am requesting the user to  input the number of students using a do-while loop
        int numberOfStudents;
        do {
            System.out.print("Enter the number of students: ");
            numberOfStudents = scanner.nextInt();
        } while (numberOfStudents <= 0);

        int[] scores = new int[numberOfStudents];
        char[] grades = new char[numberOfStudents];

        
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter score for student " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }

        for (int i = 0; i < numberOfStudents; i++) {
            if (scores[i] >= 90) {
                grades[i] = 'A';
            } else if (scores[i] >= 80) {
                grades[i] = 'B';
            } else if (scores[i] >= 70) {
                grades[i] = 'C';
            } else if (scores[i] >= 60) {
                grades[i] = 'D';
            } else if (scores[i] >= 50) {
                grades[i] = 'E';
            } else {
                grades[i] = 'F';
            }
        }

        
        int i = 0;
        while (i < numberOfStudents) {
            System.out.println("Student " + (i + 1) + ": " + grades[i]);
            i++;
        }


    }
}
	



        


