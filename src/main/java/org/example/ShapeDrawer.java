package org.example;

import java.util.Scanner;

public class ShapeDrawer {
    Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        System.out.println("Selamat datang di ASCII drawing");
        System.out.println("Choose a shape to draw : ");
        System.out.println("1. Segitiga siku-siku");
        System.out.println("2. Segitiga sama kaki");
        System.out.println("3. Belah ketupat");
        System.out.println("4. Exit");
    }

    public void drawShape(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Masukkan panjang segitiga siku-siku: ");
                int height = scanner.nextInt();
                drawTriangleSS(height);
                break;
            case 2:
                System.out.println("Masukkan panjang segitiga sama kaki: ");
                int height2 = scanner.nextInt();
                drawTriangleSK(height2);
                break;
            case 3:
                System.out.println("Masukkan lebar belah ketupat: ");
                int widthRhombus = scanner.nextInt();
                drawRhombus(widthRhombus);
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }

    public void drawTriangleSS(int height) {
        //nested loop
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void drawTriangleSK(int height) {
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

    public void drawRhombus(int width) {
        for(int i=1; i<=width; i++) {

            for(int j=1; j<=width-i; j++) {
                System.out.print(" ");
            }

            for(int k=1; k<=i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for(int i=1; i<width; i++) {

            for(int j=1; j<=i; j++) {
                System.out.print(" ");
            }

            for(int k=1; k<=width-i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public void run() {
        while (true) {
            displayMenu();
            System.out.println("Masukkan pilihan anda: ");
            int choice = scanner.nextInt();
            drawShape(choice);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ShapeDrawer drawer = new ShapeDrawer();
        drawer.run();
    }
}