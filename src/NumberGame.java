import java.util.Scanner;
import java.util.Random;
public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 8;
        int rounds = 0;
        int score = 0;

        System.out.println("\n___Welcome to the number Guessing Game___");

        boolean playAgain = true;
        while(playAgain){
            int randomNum = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            boolean guessed = false;

            System.out.println("\nRound - "+(rounds + 1) + ":\n Guess the number between " + minRange + " and " + maxRange );

            while(attempts < maxAttempts && !guessed){
                System.out.println("Enter your guess (" + (maxAttempts - attempts) + " attempts left): ");
                int userGuess = sc.nextInt();
                attempts++;

                if(userGuess == randomNum){
                    System.out.println("Congragulations! You've the guessed the correct number...");
                    guessed = true;
                    score++;
                }
                else if(userGuess < randomNum){
                    System.out.println("Too Low!! Try Again..");
                }
                else{
                    System.out.println("Too High!! Try Again..");
                }
            }
            if(!guessed){
                System.out.println("Sorry, you've run out of attempts. The correct number was: " + randomNum);
            }
            rounds++;
            System.out.print("Do you want to play again? (yes/no): ");
            String playChoice = sc.next().toLowerCase();
            playAgain = playChoice.equals("yes");
        }
        System.out.println("\nGame over!!!\nYour score is: " + score + " out of " + rounds + " rounds.\n");
        sc.close();
    }
}
