public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("N\t10*N\t100*N\t1000*N\n");
        for (int N = 1; N < 5; N++) {
            System.out.println(N + "\t" + (10*N)+ "\t" + (100*N)+ "\t" + (1000*N));
        }

    }
}
