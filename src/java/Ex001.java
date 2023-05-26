package src.java;

import java.util.Locale;

public class Ex001 {
    public static void main(String[] args) {
        System.out.println("Olá, Mundo.");
        String nome = "Maria";
        int idade = 33;
        double renda = 4000.0;
        Locale.setDefault(Locale.US);
        System.out.println(nome + " tem " + idade + " e ganha R$ " + renda +" reais.");



    }
}
