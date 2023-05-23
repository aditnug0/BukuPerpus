/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.lelang;

/**
 *
 * @author aditn
 */
import java.util.*;

public class Perpustakaan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Declare object
        Sistem s = new Sistem();
        Siswa sw = new Siswa();
        //Buku bk = new Buku();
        Petugas p = new Petugas();
        int pilihan;

        System.out.println("--Selamat Datang Di Perpustakaan--\n ");
        System.out.println("Petugas Hari Ini Adalah : ");
        Petugas.Karyawan();
        do {
            //Main menu
            System.out.println("");
            System.out.println("--Menu Perpustakaan--");
            System.out.println("1. Pinjam Buku");
            System.out.println("2. Kembalikan Buku");
            System.out.println("3. Lihat Buku");
            System.out.println("4. Exit\n");

            System.out.println("--Masukkan Pilihan Anda--");

            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    sw.getSiswa();
                    System.out.println("");
                    s.pinjambuku(sw);

                    break;
                case 2:
                    sw.getSiswa();
                    System.out.println("");
                    s.tampilBuku();
                    s.kembalikanbuku(sw);
                    break;

                case 3:
                    sw.getSiswa();
                    System.out.println("");
                    s.lihatbuku();
                    break;

                case 4:
                    System.out.println("--Terimakasih Telah Menggunakan Perpustakaan--");
                    break;

                default:
                    System.out.println("Harap masukkan kode yang benar");
                    main(args);
                    break;
            }
        } while (pilihan != 4);

    }
}
