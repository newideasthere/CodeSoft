import java.util.Scanner;
import java.lang.Math;
    public class GuessingTheNum {
      public static void main(String[] args) {
        int answer = (int)(Math.random() * 100) + 1;
        int i = 5;
        Scanner sc = new Scanner(System.in);
        boolean correct = false;
        System.out.println("Welcome to the game : Guess The Number \nYou have to guess a number between 1 and 100.You have 5 tries to guess the number.");
    
        while (i > 0) {
          System.out.print("Enter your guess: ");
          int guess = sc.nextInt();
          
          if (guess == answer) {
            System.out.println("Congrats !! You guessed the number. \nYou win!");
            correct = true;
            break;
          } else if (guess > answer) {
            System.out.println("Your guess is too high.\nYou have only " + (i - 1) + " tries left.");
          } else {
            System.out.println("Your guess is too low.\nYou have only " + (i - 1) + " tries left.");
          }
          
          i--;
        }
    
        if (!correct) {
          System.out.println("Oops, You ran out of tries.\nYou lose!");
          System.out.println("The number was " + answer);
        }
      }
    }
    