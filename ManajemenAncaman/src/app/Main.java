package app;

import factory.*;
import threat.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean berjalan = true;

        while (berjalan) {
            System.out.println("\n========================================");
            System.out.println("   SISTEM MANAJEMEN ANCAMAN SIBER");
            System.out.println("========================================");
            System.out.println("1. Input Data Malware");
            System.out.println("2. Input Data Phishing");
            System.out.println("3. Lihat Riwayat Ancaman (Database)");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");

            int pilihan = 0;
            try {
                pilihan = scanner.nextInt();
                scanner.nextLine(); // Membersihkan sisa enter agar tidak error
            } catch (Exception e) {
                System.out.println("Input harus angka!");
                scanner.nextLine();
                continue;
            }

            if (pilihan == 0) {
                berjalan = false;
                System.out.println("Sistem dimatikan. Sampai jumpa!");
                break;
            }

            ThreatCreator creator = null;

            if (pilihan == 1) {
                System.out.print("Masukkan Nama Malware: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan Hash File: ");
                String hash = scanner.nextLine();
                System.out.print("Masukkan Dampak: ");
                String dampak = scanner.nextLine();
                
                creator = new MalwareFactory(nama, hash, dampak);

            } else if (pilihan == 2) {
                System.out.print("Masukkan Nama Phishing: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan URL Berbahaya: ");
                String url = scanner.nextLine();
                System.out.print("Masukkan Target: ");
                String target = scanner.nextLine();
                
                creator = new PhishingFactory(nama, url, target);

            } else if (pilihan == 3) {
                lihatRiwayat();
                continue;
            } else {
                System.out.println("Pilihan tidak tersedia!");
                continue;
            }

            if (creator != null) {
                Threat threat = creator.createThreat();
                System.out.println("\n--- Hasil Deteksi ---");
                threat.displayInfo();
                
                // Simpan ke file otomatis
                SimpanData.keFile(threat.toString());
            }
        }
        scanner.close();
    }

    private static void lihatRiwayat() {
        System.out.println("\n--- RIWAYAT ANCAMAN DARI DATABASE ---");
        try (BufferedReader reader = new BufferedReader(new FileReader("database_ancaman.txt"))) {
            String baris;
            while ((baris = reader.readLine()) != null) {
                System.out.println(baris);
            }
        } catch (IOException e) {
            System.out.println("Belum ada data atau file tidak ditemukan.");
        }
    }
}