import java.util.*;
public class GradingProgram {
    //Get the exam grades from student
    public static void main(String[] args){
        try {
            Scanner midterm1 = new Scanner(System.in);
            Scanner midterm2 = new Scanner(System.in);
            Scanner finalG = new Scanner(System.in);

            double midtermGrade1 = midterm1.nextInt();
            double midtermGrade2 = midterm2.nextInt();
            double finalGrade = finalG.nextInt();

            // calculate the average of the exams
            double averageGrade = (midtermGrade1 + midtermGrade2 + finalGrade) / 3;
            // Print result to the screen
            System.out.println("Average of the exams: " + averageGrade);
            char grade = ' ';

            if (averageGrade >= 90) {
                grade = 'A';
            }
            if (averageGrade >= 80) {
                grade = 'B';
            }
            if (averageGrade >= 70) {
                grade = 'C';
            }
            if (averageGrade >= 60) {
                grade = 'D';
            }
            if (60 > averageGrade ) {
                grade = 'F';
            }
            System.out.println( "First Midterm Grade : " + midtermGrade1  );
            System.out.println( "Second Midterm Grade: " + midtermGrade2  );
            System.out.println( "Final Grade         : " + finalGrade );
            System.out.println( "--------------------- " );
            System.out.println( "Average             : " + averageGrade );
            System.out.println( "Letter Grade        : " + grade );
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}