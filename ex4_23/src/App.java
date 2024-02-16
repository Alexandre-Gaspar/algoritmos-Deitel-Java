import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int number;
        int largest1 = 0;
        int largest2 = 0;
        
        for (int count = 0; count < 10; count++) {
            System.out.print("Enter " + (count+1) + "º number: ");
            number = sc.nextInt();

            if (number > largest1) {
                largest2 = largest1;
                largest1 = number;
            } else if (number > largest2) {
                largest1 = largest2;
                largest2 = number;
            }
        }

        System.out.println();
        if (largest1 > largest2) {
            System.out.println("First largest: " + largest1 + "\nSecond largest: " + largest2);
        } else {
            System.out.println("First largest: " + largest2 + "\nSecond largest: " + largest1);
        }

        sc.close();

    }
}
