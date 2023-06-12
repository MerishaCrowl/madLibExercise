//MadLib Exercise
import java.util.Scanner;
public class MadLib {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a name: Please respond in the console window");
        String name = userInput.nextLine();
        System.out.println("Name an adjective: Please respond in the console window");
        String adjective = userInput.nextLine();
        System.out.println("Name a verb. Please respond in the console window");
        String verbOne = userInput.nextLine();
        System.out.println("Name another verb. Please respond in the console window");
        String verbTwo = userInput.nextLine();
        System.out.println("Name a number. Please respond in the console window");
        String number = userInput.nextLine();
        System.out.println("What is your name? Please respond in the console window");
        String yourName = userInput.nextLine();

        System.out.print("Here is your Madlib: \n");
        System.out.printf("\n Dear %s,\n", name);
        System.out.printf("\nYou are %s and I want to be your %s!", adjective, verbOne);
        System.out.printf("I want to go to the %s with you  in %s days.", verbTwo, number);
        System.out.printf("Sincerely, %s \n", yourName);

    }
}