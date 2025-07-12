package Presentation.Helpers;

import java.util.Scanner;

public class InputValidators
{
    public static int ValidateInputInt(){
        Scanner sc = new Scanner(System.in);
        int result;

        while(true){
            System.out.println("Enter an integer: ");
            String userInput = sc.nextLine();

            if (isInt(userInput)){
                result = Integer.parseInt(userInput);
                return result;
            }

            System.out.println("Invalid Input! Please try again.");
        }
    }

    public static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
