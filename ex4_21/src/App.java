import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int number;
        int largest = 0;
        
        for (int count = 0; count < 10; count++) {
            System.out.print("Enter " + (count+1) + "º number: ");
            number = sc.nextInt();

            if (number > largest) {
                largest = number;
            }
        }

        System.out.println("The largest number is: " + largest);

        sc.close();
    }
}
