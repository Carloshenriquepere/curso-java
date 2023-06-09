package src.java;

import src.java.entities010.Service;

import java.util.Locale;
import java.util.Scanner;

public class Ex010 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Service service;

        System.out.print("Entre com o número da conta: ");
        int numeroConta = sc.nextInt();

        System.out.print("Entre com o nome: ");
        sc.nextLine();
        String nome = sc.nextLine();

        System.out.print("Quer fazer depósito inicial? (s/n)");
        char resposta = sc.next().charAt(0);
        if (resposta == 's'){
            System.out.print("Entre com o valor do depósito: ");
            double inicialDeposito = sc.nextDouble();
            service = new Service(numeroConta, nome, inicialDeposito);
        }else{
            service = new Service(numeroConta, nome);
        }

        System.out.println("\n"+ service);

        System.out.print("Entre com valor do depósito: ");
        double depositoValor = sc.nextDouble();
        service.deposit(depositoValor);
        System.out.println("Novo valor da conta: \n" + service);

        System.out.print("Entre com valor do saque: ");
        double saque = sc.nextDouble();
        service.withdraw(saque);
        System.out.println("Novo valor da conta: \n" + service);

        sc.close();
    }



}
