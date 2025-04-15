import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter Total of Items: ");
        double items = scnr.nextDouble();

        while (true) { 
            
            System.out.println("Enter Score:");
            int score = scnr.nextInt();

            double FinalScore = (score/items)*40+60;

            if(score > items) {
                System.out.println("Score is invalid.");
            } else {
            System.out.println("Your Score is: "+ FinalScore);
            }
        }
    }
}
