package src.java;

import src.java.entities008.Products8;

import java.util.Locale;
import java.util.Scanner;

public class Ex008 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Products8 products8 = new Products8();

        System.out.print("Nome do funcionário: ");
        products8.nome = sc.next();
        System.out.print("Entre com salário bruto: ");
        products8.salarioBruto = sc.nextDouble();
        System.out.print("Qual a taxa: ");
        products8.taxa = sc.nextDouble();

        System.out.println(products8);

        System.out.print("Quantos porcentos você deseja adicionar ao salário: ");
        double porcento = sc.nextDouble();
        products8.adicaoSalarial(porcento);
        System.out.println(products8);
        sc.close();

    }
}
