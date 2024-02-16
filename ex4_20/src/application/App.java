package application;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Employee;

public class App {

    private static void limparTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US); // Permite a entrada de valores de ponto flutuantes usando a . (padrão amenricano)
        Scanner sc = new Scanner(System.in); // Instância do objecto de leitura do teclado
        
        String nome;
        double salarioHora;
        int horasTrabalhadas;
        String controller;
        int count = 0;

        List<Employee> employees = new ArrayList<>();
        
        do { // Execute o bloco pelo menos uma vez
            limparTela();
            ++count;
            System.out.println("Dados do empregado " + count);
            
            System.out.print("Nome: ");
            nome = sc.nextLine();
            System.out.print("Salario-hora: ");
            salarioHora = sc.nextDouble();
            System.out.print("Horas trabalhadas: ");
            horasTrabalhadas = sc.nextInt();

            employees.add(new Employee(nome, salarioHora, horasTrabalhadas)); // Adiciona uma instância a cada iteração

            System.out.print("Deseja inserir mais empregado ? [S/N] ");
            controller = sc.next();
            sc.nextLine();
            limparTela();
        } while (controller.equals("s") || controller.equals("S")); // Enquanto for verdade continue executando

        System.out.println("\n------Lista de empregados------");
        for (Employee e: employees) { // Percorre por todos os itens da lista de employees e mostra na tela
            System.out.println(e.toString());
        }

        sc.close();
    }
}
