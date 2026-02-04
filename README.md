# 🛡️ Sistem Manajemen Ancaman (Kelompok 8)

Proyek ini adalah aplikasi berbasis CLI untuk mengelola data ancaman keamanan siber (Cyber Security). Aplikasi ini diimplementasikan menggunakan **Design Pattern: Factory Method** untuk memastikan pembuatan objek ancaman (Malware, Phishing, dll) terorganisir dengan baik.

## 📂 Struktur Folder
- **src/app**: Berisi logika utama aplikasi (`Main.java`) dan penyimpanan data.
- **src/factory**: Implementasi *Factory Pattern* untuk pembuatan jenis ancaman.
- **src/threat**: Definisi kelas objek ancaman.
- **database_ancaman.txt**: File penyimpanan data eksternal.

## 🚀 Fitur Utama
- Menambahkan data ancaman baru secara dinamis.
- Mengklasifikasikan jenis ancaman menggunakan Factory Method.
- Menyimpan riwayat ancaman ke dalam file teks.

## 💻 Cara Menjalankan
1. Pastikan Java (JDK) sudah terinstal di komputer Anda.
2. Clone repository ini.
3. Buka folder proyek di IDE favorit Anda (VS Code, IntelliJ, atau Eclipse).
4. Jalankan file `Main.java` yang berada di folder `src/app`.

---
*Dibuat untuk memenuhi tugas Pengembangan Proyek - Kelompok 8.*
