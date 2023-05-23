/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lelang;

/**
 *
 * @author aditn
 */
import java.util.*;

public class Sistem implements Buku {

    Scanner input = new Scanner(System.in);
    Siswa s = new Siswa();

    //Declare ArrayList
    public ArrayList<String> namaBuku = new ArrayList<String>();
    public ArrayList<Integer> nomor = new ArrayList<Integer>();
    public ArrayList<Integer> idBuku = new ArrayList<Integer>();
    public ArrayList<Integer> Banyak = new ArrayList<Integer>();
    public ArrayList<Integer> Stok = new ArrayList<Integer>();
   private  int pinjam = 0;
    //Constructor

    public int getPinjam() {
        return pinjam;
    }

    public void setPinjam(int pinjam) {
        this.pinjam = pinjam;
    }

    public Sistem() {

        this.nomor.add(0);
        this.namaBuku.add("Novel");
        this.Stok.add(20);

        this.nomor.add(1);
        this.namaBuku.add("Komik");
        this.Stok.add(10);

        this.nomor.add(2);
        this.namaBuku.add("Sejarah Indonesia");
        this.Stok.add(15);

        this.Banyak.add(0);
        this.Banyak.add(0);
        this.Banyak.add(0);
    }
    int bukuPinjam = 3;

    //Override
    @Override
    public void tampilBuku() {
        System.out.println("Daftar Buku : ");
        System.out.println("");
        System.out.println("Nomor buku: " + nomor.get(0));
        System.out.println("Nama buku: " + namaBuku.get(0));
        System.out.println("Stok buku: " + Stok.get(0));
        System.out.println("");
        System.out.println("Nomor buku: " + nomor.get(1));
        System.out.println("Nama buku: " + namaBuku.get(1));
        System.out.println("Stok buku: " + Stok.get(1));
        System.out.println("");
        System.out.println("Nomor buku: " + nomor.get(2));
        System.out.println("Nama buku: " + namaBuku.get(2));
        System.out.println("Stok buku: " + Stok.get(2));
        System.out.println("");

    }

    public void pinjambuku(Siswa s) {
        s.getMurid();
        System.out.println("Masukan id Siswa :");
        int member = input.nextInt();
        tampilBuku();
        System.out.println("");
        System.out.println("Masukkan nomor Buku yang ingin dipinjam: ");
        int id = input.nextInt();
        bukuPinjam = id;
        System.out.println("Berapa banyak buku yang ingin anda pinjam: ");
        int banyakb = input.nextInt();
        s.setPinjam(banyakb);
        System.out.println("Buku yang dipinjam: " + namaBuku.get(id));
        System.out.println("Stok buku saat ini: " + Stok.get(id));
        if (banyakb <= Stok.get(id) && s.getStatusSiswa(member - 1)) {
            System.out.println("Anda Berhasil Meminjam Sebanyak " + banyakb + " Buku " + namaBuku.get(id) + ", Harap Mengembalikan Buku Sebelum Meminjam Buku Lain");
            s.editStatus(member - 1, false);
            editStok(id, (Stok.get(id) - banyakb));

        } else {
            System.out.println("Buku Gagal Dipinjam ");
        }

    }

    public void kembalikanbuku(Siswa s) {
        s.getMurid();
        System.out.println("Masukan id Siswa :");
        int member = input.nextInt();
        System.out.println("");
        System.out.println("Masukkan nomor Buku yang ingin dikembalikan: ");
        int id = input.nextInt();
        if (id == bukuPinjam) {
            System.out.println("Berapa banyak buku yang ingin anda kembalikan: ");
            int banyak = input.nextInt();
            if (s.getPinjam() == banyak) {
                System.out.println("Buku yang dikembalikan: " + namaBuku.get(id));
                System.out.println("Stok buku saat ini: " + Stok.get(id));
                System.out.println("Anda Berhasil Mengembalikan " + banyak + " Buku " + namaBuku.get(id));
                s.editStatus(member - 1, true);
                editStok(id, (Stok.get(id) + banyak));
            } else {
                System.out.println("Maaf, buku yang anda kembalikan tidak sesuai dengan yang anda pinjam\nJumlah di pinjam: " + s.getPinjam());
            }
        }

    }

    @Override
    public void lihatbuku() {
        System.out.println("--Daftar Buku--");
        System.out.println("");
        for (int i = 0; i < namaBuku.size(); i++) {
            System.out.println("Nomor buku: " + nomor.get(i));
            System.out.println("Nama buku: " + namaBuku.get(i));
            System.out.println("Stok buku: " + Stok.get(i));
            System.out.println("");

        }
    }

//        public boolean editStatus(int id, boolean status) {
//        return this.statusSiswa.set(id, status);
//
//    }
    public int editStok(int nomor, int stok) {
        return this.Stok.set(nomor, stok);
    }
}
