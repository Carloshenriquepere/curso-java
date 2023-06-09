package src.java.entities010;

public class Service {


    private int numeroConta;
    private String nome;
    private double deposito;

    public Service(int numeroConta, String nome) {
        this.numeroConta = numeroConta;
        this.nome = nome;
    }

    public Service(int numeroConta, String nome, double initialDeposit) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        deposit(initialDeposit);
    }

    public int getNumeroConta() {
        return numeroConta;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDeposito() {
        return deposito;
    }

    public void deposit(double amount){
        deposito += amount;
    }
    public void withdraw(double amount){
        deposito -= amount + 5.0;
    }

    @Override
    public String toString() {
        return "Conta: " +
                "Número da Conta: " + numeroConta +
                ", Nome: " + nome +
                ", Valor do depósito: $" + String.format("%.2f",deposito)
                ;
    }
}
