package com.kelompoksatu.programpertama;

public class Orang {


    // Atribut kelas Orang
    private String nama, jenisKelamin;
    private int usia;


    // Method Setter untuk mengatur nilai dari tiap variabel dengan access modifier private
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }


    // Method Getter untuk mendapatkan nilai dari tiap variabel private dengan access modifier private
    public String getNama() {
        return nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public int getUsia() {
        return usia;
    }
}