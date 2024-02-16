package entities;

public class Employee {
    
    private String nome;
    private int numeroDeHoras;
    private double salarioBruto;
    private double salarioLiquido;

    public Employee() {}

    public Employee(String nome, double salarioLiquido, int numeroDeHoras) {
        this.nome = nome;
        this.numeroDeHoras = numeroDeHoras;
        this.salarioLiquido = salarioLiquido;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getSalarioLiquido() { return salarioLiquido; }
    public void setSalarioLiquido(double salarioLiquido) { this.salarioLiquido = salarioLiquido; }
    
    public int getNumeroDeHoras() { return numeroDeHoras; }
    public void setNumeroDeHoras(int numeroDeHoras) { this.numeroDeHoras = numeroDeHoras; }
    
    public double salarioBruto() { // Analize and return a double number according to the condition
        if (numeroDeHoras == 40) {
            salarioBruto = salarioLiquido;
        } else if (numeroDeHoras > 40) {
            salarioBruto = salarioLiquido + salarioLiquido*0.5;
        }
        
        return salarioBruto;
    }

    @Override
    public String toString() {
        return "Name: " + getNome() + 
                "\nSalário-hora: " + salarioBruto() + 
                "\nHoras: " + getNumeroDeHoras();
    }

}
