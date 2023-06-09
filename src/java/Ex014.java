package src.java;

import src.java.entities014.Rent;

import java.util.Scanner;

public class Ex014 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.print("How many rooms will be rented: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nRent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();
            vect[roomNumber] = new Rent(name, email);
        }

        System.out.println("\nBusy rooms:");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null){
                System.out.println(i + ": " + vect[i]);
            }

        }






        sc.close();
    }
}