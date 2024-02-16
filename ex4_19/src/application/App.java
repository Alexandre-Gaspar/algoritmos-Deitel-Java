package application;

import java.util.Scanner;

public class App {
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int contaItem = 0;
        String sentinela = "S";
        double percent = 0.09;
        double totalVendido = 0.0;
        final double salarioBase = 200.00;

        do {
            ++contaItem;
            System.out.println("\n\nInsira o valor do " + contaItem + "º item:");
            double precoUnitario = sc.nextDouble();

            totalVendido += precoUnitario; // Adiciona cada valor do item ao total

            System.out.print("Deseja inserir mais item? (S/N): ");
            sentinela = sc.next();
        } while (sentinela.equals("s") || sentinela.equals("s"));

        double salarioComRendimento = salarioBase + totalVendido*percent;

        System.out.printf("Rendimento do vendedor: %.2f", salarioComRendimento);

        sc.close();
    }
}
