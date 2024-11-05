
package session1.exercise1;


public class GradeCalculator {

    public static void main(String[] args) {

        double score = 45; 
        char grade;


        int roundedScore = (int) (score / 10);

        switch (roundedScore) {

            case 10: 
                     case 9:  
                grade = 'A';
                break;

            case 8:  
                grade = 'B';
                break;

            case 7:  
                grade = 'C';
                break;

            case 6:  
                grade = 'D';
                break;

            default: 
                grade = 'F';
        }

        System.out.println("The grade is " + grade);
    }
}
