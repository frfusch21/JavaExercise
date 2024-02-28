package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Collection;
import java.util.AbstractCollection;

// Define a Shape interface
interface Shape{ //One of implementation of Polymorphism
    void draw(int height, int side);
}

// TriangleSS implements Shape interface
class drawTriangleSS implements Shape {
    @Override //Overriding (Mengganti secara paksa content dari function dalam polymorphism)
    public void draw(int height, int side) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// TriangleSK implements Shape interface
class drawTriangleSK implements Shape {
    @Override
    public void draw(int height, int side) {
        for (int i = 1; i <= height; i++) {
            for (int j = height - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class ShapeDrawerPolyMorph {
    Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        System.out.println("Selamat datang di ASCII draw!");
        System.out.println("Pilih bentuk yang mau digambar");
        System.out.println("1. Segitiga Siku-Siku");
        System.out.println("2. Segitiga Sama Kaki");
        System.out.println("3. Exit\n");
    }

    public void drawShape(int choice) {
        try {
            switch (choice) {
                case 1:
                    System.out.println("Masukkan Panjang segitiga siku-siku: ");
                    int height = scanner.nextInt();
                    new drawTriangleSS().draw(height, 1);
                    break;
                case 2:
                    System.out.println("Masukkan Panjang segitiga sama kaki: ");
                    int height2 = scanner.nextInt();
                    new drawTriangleSK().draw(height2, 1);
                    break;
                case 3:
                    System.exit(0);
                    break;
//                default:
//                    System.out.println("Invalid Input");
            }
        } catch (InputMismatchException ime) {
            System.out.println("Please enter a valid integer.");
            scanner.next(); // to consume the invalid token
        }
    }

    public void run() {
        while (true) {
            displayMenu();
            System.out.println("Masukkan pilihan anda: ");
            try {
                int choice = scanner.nextInt();
                drawShape(choice);
                System.out.println();
            } catch (InputMismatchException ime) {
                System.out.println("Please enter a valid integer.");
                scanner.next(); // to consume the invalid token
            }
        }
    }

    public static void main(String[] args) {
        ShapeDrawerPolyMorph drawer = new ShapeDrawerPolyMorph();
        drawer.run();
    }
}
