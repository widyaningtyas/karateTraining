package org.example;

public class Main2 {
    public static void main(String[] args) {
        System.out.print("Hello and welcome!");
        System.out.println("Hello world!");

        for (int i = 0; i < 4; i++) {
            if (i == 2) {
                break;
            }
            System.out.println(i);
        }

        int a = 10;
        int b = 2;
        float c = 3;
        String nama = "Ferdinand";
        char q = 'Y';
        boolean flag = false;

        //Arithmetic Operation
        int result = a / b;
        int result2 = (int) (a + c);
        float result3 = a + c;
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);

        int timeStart = 9;
        int timeFinish = 18;
        int waktuMasuk = 7;
        int waktuPulang = 17;

        if (waktuMasuk <= timeStart && waktuPulang >= timeFinish) {
            System.out.println("Selamat anda karyawan teladan");
            System.out.println("Anda sampai " + (timeStart - waktuMasuk) + " jam lebih cepat");
        } else if (waktuMasuk <= timeStart && waktuPulang < timeFinish) {
            System.out.println("Wah pulang duluan");
            System.out.println("Anda sampai " + (timeStart - waktuMasuk) + " jam lebih cepat");
            System.out.println("Anda pulang " + (timeFinish - waktuPulang) + " jam lebih cepat");
        } else {
            System.out.println("Udah telat, pulang duluan");
        }

        // Switch case
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Saya WFH");
                break;
            case 2:
                System.out.println("Saya WFH lagi");
                break;
            case 3:
                System.out.println("Saya WFO");
                break;
            case 4:
                System.out.println("Kerja ga ya?");
                break;
            default:
                System.out.println("Saya Libur");
                break;
        }

        //Loop
        for (int i = 1; i < 10; i += 2) { //Execute 3x
            if (i == 7) {
                break;
            }
            System.out.println("Outer loop " + i);

            for (int j = 0; j <= 5; j++) { //Execute 6x
                System.out.println(j + 1);
            }
        }


    }
}