package com.kelompoksatu.programpertama;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Memanggil Method judulProgram()
        Program.judulProgram("Program Kalkulasi IPK", "Erik", "Melyana", "Savina", "Agus");

        // Memanggil Method jalankanProgram()
        Program.jalankanProgram();
    }

    // Membuat Inner Class dengan Access Modifier Private
    private static class Program {

        // Method Private untuk Mengatur Nama Program
        private static void judulProgram(String namaProgram, String namaSatu, String namaDua, String namaTiga, String namaEmpat) {
            System.out.printf("%s\n", namaProgram);
            System.out.printf("%s\n", "-------------------------");
            System.out.printf("%s : \n%s\n%s\n%s\n%s\n", "Kelompok Satu", namaSatu, namaDua, namaTiga, namaEmpat);
            System.out.printf("%s\n", "-------------------------");
        }

        // Method Private untuk Mengolah Data
        private static void jalankanProgram() {

            // Membuat Object userInput dari Library Class Scanner
            Scanner userInput = new Scanner(System.in);

            System.out.printf("%s : ", "Masukkan NIM");
            int nim = userInput.nextInt();

            // Membuat Object mahasiswaUMPO dari Class Mahasiswa
            Mahasiswa mahasiswaUMPO = new Mahasiswa(nim);

            System.out.printf("%s : ", "Masukkan Nama");
            String nama = userInput.next();
            mahasiswaUMPO.setNama(nama);

            System.out.printf("%s : ", "Masukkan Jenis Kelamin");
            String jenisKelamin = userInput.next();
            mahasiswaUMPO.setJenisKelamin(jenisKelamin);

            System.out.printf("%s : ", "Masukkan Usia");
            int usia = userInput.nextInt();
            mahasiswaUMPO.setUsia(usia);


            System.out.printf("%s : ", "Masukkan IP Semester 1");
            Double ipSatu = userInput.nextDouble();
            mahasiswaUMPO.setIpSemesterSatu(ipSatu);

            System.out.printf("%s : ", "Masukkan IP Semester 2");
            Double ipDua = userInput.nextDouble();
            mahasiswaUMPO.setIpsemesterDua(ipDua);

            System.out.printf("%s : ", "Masukkan IP Semester 3");
            Double ipTiga = userInput.nextDouble();
            mahasiswaUMPO.setIpSemesterTiga(ipTiga);

            System.out.printf("%s : ", "Masukkan IP Semester 4");
            Double ipEmpat = userInput.nextDouble();
            mahasiswaUMPO.setIpSemesterEmpat(ipEmpat);

            System.out.printf("%s : ", "Masukkan IP Semester 5");
            Double ipLima = userInput.nextDouble();
            mahasiswaUMPO.setIpSemesterLima(ipLima);

            System.out.printf("%s : ", "Masukkan IP Semester 6");
            Double ipEnam = userInput.nextDouble();
            mahasiswaUMPO.setIpSemesterEnam(ipEnam);

            System.out.printf("%s : ", "Masukkan IP Semester 7");
            Double ipTujuh = userInput.nextDouble();
            mahasiswaUMPO.setIpSemesterTujuh(ipTujuh);

            System.out.printf("%s : ", "Masukkan IP Semester 8");
            Double ipDelapan = userInput.nextDouble();
            mahasiswaUMPO.setIpSemesterDelapan(ipDelapan);

            System.out.printf("\n%s\n", "-------------------------");
            System.out.printf("%s \n", "Hasil Kalkulasi IPK");
            System.out.printf("%s : %s\n", "Nama", mahasiswaUMPO.getNama());
            System.out.printf("%s : %s\n", "NIM", mahasiswaUMPO.getNim());
            System.out.printf("%s : %s\n", "Jenis Kelamin", mahasiswaUMPO.getJenisKelamin());
            System.out.printf("%s : %s\n", "Usia", mahasiswaUMPO.getUsia());
            System.out.printf("%s : %f\n", "Hasil Nilai IPK", mahasiswaUMPO.indekPrestasiKumulatif(ipSatu, ipDua, ipTiga, ipEmpat, ipLima, ipEnam, ipTujuh, ipDelapan));
            System.out.printf("%s\n", "-------------------------");
        }
    }
}
