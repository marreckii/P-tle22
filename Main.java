import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        guessNumber();
        askToContinue();
        printNumbers();
    }


    public static void guessNumber () {
            Random draw = new Random();
            Scanner scanner = new Scanner(System.in);

            int drawn = draw.nextInt(11);
            int guessednumber;
            do {
                System.out.println("Guess the number 1-10:");
                guessednumber = scanner.nextInt();

                if (drawn != guessednumber) {
                    System.out.println("You haven't guessed, try again");
                }
            } while (drawn != guessednumber);
            System.out.println("Bravo! You guessed the number: " + guessednumber);
        }
        public static void askToContinue () {
            boolean shouldContinue = true;
            Scanner scanner = new Scanner(System.in);
            int i = 1;
//            I gave below us 10 so that you don't type a lot as you check
            while (shouldContinue && i <= 100) {
                System.out.println("Next?");
                String answer = scanner.nextLine();

                if (answer.equals("yes")) {
                    shouldContinue = true;
                    System.out.println(i++);

                } else if (answer.equals("no")) {
                    shouldContinue = false;
                }
            }
        }
            public static void printNumbers () {
                for (int i = 0; i <= 100; i++) {
                    System.out.println(i);
                }
            }

    }
//    e




