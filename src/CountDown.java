import java.util.Scanner;

public class CountDown {
    public static void main(String args[]) {

        int userInput;
        Scanner keybd = new Scanner(System.in);
        System.out.println("Enter a number: ");

        //1. I want to store the user's input in the userInput variable
        userInput = keybd.nextInt();

        //2. Create for loop from userInput down to 1
        for(int i = userInput; i >= 1; i--) {
            System.out.println(i);
        }

        // use for loop

    }
}
