import java.util.Scanner;

public class ScoreCalculator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        double items=0;
        
        while(items==0){
        
        System.out.print("Enter Total of Items: ");
        items = scnr.nextDouble();
        
        if (items==0){
            System.out.println("Items cannot be 0.\n");
            } 
        }
        
        while(true) {
        
            System.out.print("\nEnter Score: ");
            int score = scnr.nextInt();

            double FinalScore = (score/items)*40+60;

            if(score>items) {
                System.out.println("Score is invalid.");
            } else {
                System.out.println("Your Score is: "+ FinalScore);
            }
        }
    }
}
