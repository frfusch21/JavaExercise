package com.example;
public class Main {
    public static void main(String[] args) {
        //Sama kaya print
        System.out.printf("Hello and welcome!");
        //Print dengan newline
        System.out.println("Nama saya Farah");
        System.out.print("Ini tanpa spasi");
        System.out.println("hohohoho");

        boolean flag;
        //Looping dari 1 sampai 5
        for (int i = 1; i < 5; i++) {
            System.out.println("i = " + i);
        }

        //Data types and variable
        int a = 10;
        int b = 2;
        float c = 3;
        String nama = "Farah";
        char q = 'Y';
        boolean flag2 = false; //true

//      Arithmathic Operation
        int result = a / b;
        int result2 = (int) (a/c); // 1 int dibagi 1 float --> Hierarki float lebih tinggi (hasilnya float)
        float result3 = a/c; //10 dibagi 3
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);

        //If, else, else-if
        int timeStart = 8;
        int timeFinish = 17;
        int waktuMasuk = 10; //Waktu Karyawan
        int waktuPulang = 15;

        // Karyawan yang masuk tepat waktu, dan pulang tepat waktu atau lebih lama, di selamati
        if(waktuMasuk <= timeStart && waktuPulang >= timeFinish) {
            System.out.println("Selamat, and masuk tepat waktu");
            System.out.println("Anda sampai " + (timeStart - waktuMasuk) + " jam lebih cepat");

            // Karyawan yang masuk tepat waktu, pulang duluan, di cengin
        }else if(waktuMasuk <= timeStart && waktuPulang <= timeFinish) {
            System.out.println("yeu pulang duluan");

            // Karyawan yang telat masuk, tapi pulang lebih lama atau tepat waktu, dimaafkan
        }else if(waktuMasuk >= timeStart && waktuPulang >= timeFinish){
            System.out.println("dimaafin telatnya");

            // Karyawan yang telat masuk, pulang duluan disoraki.
        }else{
            System.out.println("YEU TELAT!");
            System.out.println("Anda sampai " + (waktuMasuk - timeStart) + " jam lebih lama");
        }

        int day = 3;
        char question ='Y';
        switch (day){
            case 1:
                System.out.println("Saya WFO");
                break;
            case 2:
                System.out.println("Saya Cuti");
                break;
            case 3:
                System.out.println("Saya WFH");
                break;
            default:
                System.out.println("Saya ga kerja alias nganggur");
                break;
        }
    }
}