package org.example;

import java.util.Scanner;

public class ShapeDrawer {
    Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        System.out.println("Selamat datang di ASCII drawing");
        System.out.println("Pilih bentuk yang mau digambar");
        System.out.println("1. Segitiga siku-siku");
        System.out.println("2. Segitiga sama kaki");
        System.out.println("3. Persegi");
        System.out.println("4. Persegi panjang");
        System.out.println("5. Exit");
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
                System.out.println("Masukkan sisi persegi: ");
                int sides = scanner.nextInt();
                drawSquare(sides);
                break;
            case 4:
                System.out.println("Masukkan panjang persegi panjang: ");
                int width = scanner.nextInt();

                System.out.println("Masukkan lebar persegi panjang: ");
                int height3 = scanner.nextInt();
                drawRectangle(width, height3);
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }

    public void drawTriangleSS(int height) {
        //nested loop
        for (int i = 1; i <= height; i++) { //outer loop untuk row atau baris
            for (int j = 1; j <= i; j++) { // inner loop untuk column
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void drawTriangleSK(int height) {
        //nested loop
        for (int i = 1; i <= height; i++) { //outer loop untuk row atau baris
            // print whitespace untuk segitiga berada di tengah
            for (int j = height - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void drawSquare(int sides) {
        //nested loop
        for (int i = 1; i <= sides; i++) { //outer loop untuk row atau baris
            for (int j = 1; j <= sides; j++) { // inner loop untuk column
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void drawRectangle(int width, int height) {
        //nested loop
        for (int i = 1; i <= width; i++) { //outer loop untuk row atau baris
            for (int j = 1; j <= height; j++) { // inner loop untuk column
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void run() {
        //loop untuk terus menampilkan menu
        while (true) {
            displayMenu();
            System.out.println("Masukkan pilihan anda: ");
            int choice = scanner.nextInt();
            drawShape(choice);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //runner
        ShapeDrawer drawer = new ShapeDrawer();
        drawer.run();
    }
}
