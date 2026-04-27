/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author USER
 */
public class tugas {
     // Variabel
    String nama;
    int umur;

    // Constructor 1 (tanpa parameter)
    public tugas() {
        nama = "Tidak diketahui";
        umur = 0;
    }

    // Constructor 2 (dengan parameter)
    public tugas(String nama, int umur) {
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
}
