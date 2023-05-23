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
import java.io.*;

public class Siswa {

    Scanner input = new Scanner(System.in);

    //ArrayList declare
    ArrayList<String> namaSiswa = new ArrayList<String>();
    ArrayList<String> alamatSiswa = new ArrayList<String>();
    ArrayList<String> telefonSiswa = new ArrayList<String>();
    ArrayList<Boolean> statusSiswa = new ArrayList<Boolean>();
    ArrayList<Integer> idSiswa = new ArrayList<Integer>();
    int Pinjam = 0;

    public Siswa() {

        //Siswa 1
        this.idSiswa.add(1);
        this.namaSiswa.add("Aldi");
        this.alamatSiswa.add("Ngawi");
        this.telefonSiswa.add("08321556586");
        this.statusSiswa.add(true);

        //Siswa 2
        this.idSiswa.add(2);
        this.namaSiswa.add("Ahmad");
        this.alamatSiswa.add("Jombang");
        this.telefonSiswa.add("08321593638");
        this.statusSiswa.add(true);

        //Siswa 3
        this.idSiswa.add(3);
        this.namaSiswa.add("Nabila");
        this.alamatSiswa.add("Malang");
        this.telefonSiswa.add("0832150283");
        this.statusSiswa.add(true);

        //Siswa 4
        this.idSiswa.add(4);
        this.namaSiswa.add("Nurul");
        this.alamatSiswa.add("Batu");
        this.telefonSiswa.add("08329373920");
        this.statusSiswa.add(true);
    }

    public String getNamaSiswa(int id) {
        return this.namaSiswa.get(id);
    }

    public String getAlamatSiswa(int id) {
        return this.alamatSiswa.get(id);
    }

    public String getTelefonSiswa(int id) {
        return this.telefonSiswa.get(id);
    }

    public Boolean getStatusSiswa(int meme) {
        return this.statusSiswa.get(meme);
    }

    public void setNamaSiswa(String namaSiswa) {
        this.namaSiswa.add(namaSiswa);
    }

    public void setAlamatSiswa(String alamatSiswa) {
        this.alamatSiswa.add(alamatSiswa);
    }

    public void setTelefonSiswa(String telefonSiswa) {
        this.telefonSiswa.add(telefonSiswa);
    }

    public void setStatusSiswa(Boolean statusSiswa) {
        this.statusSiswa.add(statusSiswa);
    }

    public int getSiswa() {

        return this.namaSiswa.size();

    }

    public boolean editStatus(int id, boolean status) {
        return this.statusSiswa.set(id, status);

    }

    public int getPinjam() {
        return Pinjam;
    }

    public void setPinjam(int Pinjam) {
        this.Pinjam = Pinjam;
    }

    public void getMurid() {
        int x = getSiswa();
        System.out.println("Id \tNama\tAlamat\tNo.Telp\t\tStatus");
        for (int i = 0; i < x; i++) {
            System.out.println(i + 1 + "\t" + getNamaSiswa(i) + "\t" + getAlamatSiswa(i) + "\t" + getTelefonSiswa(i) + "\t" + getStatusSiswa(i));
        }
    }
}
