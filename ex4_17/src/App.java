import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in); // Instanciando objectio para leitura
        String controller;
        double totalPerTravel = 0.0;
        double totalKm = 0.0;
        double lietrs = 0.0;

        ArrayList<Double> travels = new ArrayList<>();

        do {
            int count = 1;
            System.out.println("---------- Viagem " + count + " ----------");

            System.out.print("Quilômetros dirigidos: ");
            int KmDrived = sc.nextInt();
    
            System.out.print("Litros de gasolinas gastos: ");
            int litersOfGasoline = sc.nextInt();
            
            totalPerTravel = (double) KmDrived/litersOfGasoline;
            travels.add(totalPerTravel);
            lietrs += litersOfGasoline;

            System.out.print("Deseja continuar a cadastrar viagens? (S/N) ");
            controller = sc.next();
            count++;
        } while (controller.equals("s") || controller.equals("S"));

        /* Otherwise
        for (double x: travels) {
            int count = 0;
            ++count;
            
        }*/
        System.out.println();
        for (int i = 0; i < travels.size(); i++) {
            System.out.println("Total (Km) da " + (i+1) + "ª viagem: " + 
                String.format("%.2f", travels.get(i)));
            
            totalKm += travels.get(i);
        }

        System.out.printf("%nTotal: %.2f%n", totalKm);
        System.out.printf("Total liters fo gasoline: %.2f%n", lietrs);

        sc.close();
    }
}