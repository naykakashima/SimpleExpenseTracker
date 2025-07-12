package Presentation;

import java.util.Scanner;

import Presentation.Helpers.MenuHelper;

public class Menu {

    private static final Scanner scanner = new Scanner(System.in);

    public void MenuLogic(){
        boolean running = true;

        while (running) {
            MenuHelper.displayMenu();
            String input = scanner.nextLine().trim();

            switch (input) {
                case "1":
                    addExpense();
                    break;
                case "2":
                    viewExpenses();
                    break;
                case "3":
                    setBudget();
                    break;
                case "4":
                    viewReport();
                    break;
                case "5":
                    saveAndExit();
                    running = false;
                    break;
                default:
                    MenuHelper.invalidOption();
            }
        }

        scanner.close();
    }

    private static void addExpense() {
        System.out.println("");

    }

    private static void viewExpenses() {
        System.out.println("");
    }

    private static void setBudget() {
        System.out.println("");
    }

    private static void viewReport() {
        System.out.println("");
    }

    private static void saveAndExit() {
        System.out.println("");
        MenuHelper.goodbye();
    }
}
