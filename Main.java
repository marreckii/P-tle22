import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean shouldContinue = true;
        Scanner scanner = new Scanner(System.in);
        int i = 1;

        while (shouldContinue && i <= 100) {
            System.out.println("Lecimy dalej?");
            String answer = scanner.nextLine();

            if (answer.equals("tak")) {
                shouldContinue = true;
                System.out.println(i++);

            } else if (answer.equals("nie")) {
                shouldContinue = false;
            }
        }
//        Tutaj musimy wpisac tak zeby szlo do 100

            for (int i = 0; i <= 100; i ++) {
                System.out.println(i);

//        Tutaj jest zwykła pętla ktora wpisuje od 1-100.
    }
}


