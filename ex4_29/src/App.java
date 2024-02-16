import java.util.Scanner;

public class App {

    private static void exibirQuadrado(int tamanho) {
        for (int i = 1; i <= tamanho; i++) {
            for (int j = 1; j <= tamanho; j++) {
                // Verificar se estamos na borda do quadrado
                if (i == 1 || i == tamanho || j == 1 || j == tamanho) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Espaço para o interior do quadrado
                }
            }
            System.out.println(); // Mudar para a próxima linha após cada linha do quadrado
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o tamanho do quadrado entre 1 e 20: ");
        int tamanho = sc.nextInt();

        if (tamanho >= 1 && tamanho <= 20) {
            exibirQuadrado(tamanho); // Criar quadrado
        } else {
            System.out.println("Tamanho do lado fora do intervalo permitido.");
        }

        sc.close();
    }
}
