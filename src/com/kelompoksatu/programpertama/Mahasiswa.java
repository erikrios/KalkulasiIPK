package com.kelompoksatu.programpertama;

public class Mahasiswa extends Orang {

    //Atribut Class Mahasiswa
    private int nim;
    private Double ipSemesterSatu, ipsemesterDua, ipSemesterTiga, ipSemesterEmpat;
    private Double ipSemesterLima, ipSemesterEnam, ipSemesterTujuh, ipSemesterDelapan;

    // Membuat Constructor kelas Mahasiswa
    public Mahasiswa(int nomorIndukMahasiswa) {
        nim = nomorIndukMahasiswa;
    }

    // Method Getter untuk Mendapatkan NIM
    public int getNim() {
        return nim;
    }

    // Method Setter & Getter Untuk Mengatur dan Mendapatkan nilai dari IP persemester
    public Double getIpSemesterSatu() {
        return ipSemesterSatu;
    }

    public void setIpSemesterSatu(Double ipSemesterSatu) {
        this.ipSemesterSatu = ipSemesterSatu;
    }

    public Double getIpsemesterDua() {
        return ipsemesterDua;
    }

    public void setIpsemesterDua(Double ipsemesterDua) {
        this.ipsemesterDua = ipsemesterDua;
    }

    public Double getIpSemesterTiga() {
        return ipSemesterTiga;
    }

    public void setIpSemesterTiga(Double ipSemesterTiga) {
        this.ipSemesterTiga = ipSemesterTiga;
    }

    public Double getIpSemesterEmpat() {
        return ipSemesterEmpat;
    }

    public void setIpSemesterEmpat(Double ipSemesterEmpat) {
        this.ipSemesterEmpat = ipSemesterEmpat;
    }

    public Double getIpSemesterLima() {
        return ipSemesterLima;
    }

    public void setIpSemesterLima(Double ipSemesterLima) {
        this.ipSemesterLima = ipSemesterLima;
    }

    public Double getIpSemesterEnam() {
        return ipSemesterEnam;
    }

    public void setIpSemesterEnam(Double ipSemesterEnam) {
        this.ipSemesterEnam = ipSemesterEnam;
    }

    public Double getIpSemesterTujuh() {
        return ipSemesterTujuh;
    }

    public void setIpSemesterTujuh(Double ipSemesterTujuh) {
        this.ipSemesterTujuh = ipSemesterTujuh;
    }

    public Double getIpSemesterDelapan() {
        return ipSemesterDelapan;
    }

    public void setIpSemesterDelapan(Double ipSemesterDelapan) {
        this.ipSemesterDelapan = ipSemesterDelapan;
    }


    // Membuat Method untuk Menghitung IPK
    protected Double indekPrestasiKumulatif(Double ipSatu, Double ipDua, Double ipTiga, Double ipEmpat, Double ipLima, Double ipEnam, Double ipTujuh, Double ipDelapan) {
        return (ipSatu + ipDua + ipTiga + ipEmpat + ipLima + ipEnam + ipTujuh + ipDelapan) / 8;
    }
}
