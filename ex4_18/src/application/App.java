package application;

import java.util.Locale;
import java.util.Scanner;

import entities.*;

public class App {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.println("\n------ Credit limit calculator ------");
        System.out.print("Account number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Initial balance: ");
        double initialBalance = sc.nextDouble();

        System.out.print("Total items: ");
        double totalItems = sc.nextDouble();
        
        System.out.print("Total credits applied: ");
        double totalCredits = sc.nextDouble();

        System.out.print("Credit limit authorized: ");
        double creditLimitAutorized = sc.nextDouble();

        Client client = new Client(accountNumber, initialBalance, totalItems, totalCredits, creditLimitAutorized);
        

        System.out.println(client);
        if (client.newBalance() > client.getCreditLimit()) {
            System.out.println("Credit limit excceded! ");
        } else {
            System.out.println("The credit is arround the limit! ");
        }
    }

}
