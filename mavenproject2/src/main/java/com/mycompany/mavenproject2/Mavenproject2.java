package com.mycompany.mavenproject2;

public class Mavenproject2 {

    // Variabel
    String nama;
    int umur;

    // Constructor 1 (tanpa parameter)
    public Mavenproject2() {
        nama = "Tidak diketahui";
        umur = 0;
    }

    // Constructor 2 (dengan parameter)
    public Mavenproject2(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Method tanpa nilai balik
    public void tampilData() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }

    // Method dengan nilai balik
    public int hitungTahunLahir(int tahunSekarang) {
        return tahunSekarang - umur;
    }

    public static void main(String[] args) {

        // Objek pakai constructor 1
        Mavenproject2 obj1 = new Mavenproject2();
        obj1.tampilData();

        System.out.println("------------------");

        // Objek pakai constructor 2
        Mavenproject2 obj2 = new Mavenproject2("Riezky", 20);
        obj2.tampilData();

        int tahunLahir = obj2.hitungTahunLahir(2025);
        System.out.println("Tahun Lahir: " + tahunLahir);
    }
}