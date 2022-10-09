import java.util.Scanner;

public class RepeatQuiz {

    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        System.out.print(
                "What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();

        boolean numberIsWrong =number1 + number2 != answer;
        while (numberIsWrong) {
            System.out.print("Wrong answer. Try again. What is "
                    + number1 + " + " + number2 + "? ");
            answer = input.nextInt();
            //checkt of numberIsWrong
            numberIsWrong =number1 + number2 != answer;

        }

        System.out.println("You got it!");

    }
}
