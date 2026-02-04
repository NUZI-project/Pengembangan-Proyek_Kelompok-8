package app;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SimpanData {
    public static void keFile(String teksAncaman) {
        try (FileWriter fw = new FileWriter("database_ancaman.txt", true);
             PrintWriter out = new PrintWriter(fw)) {
            
            // Tambahkan waktu saat data diinput
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            
            out.println("[" + dtf.format(now) + "]");
            out.println(teksAncaman);
            out.println("----------------------------------------");
            System.out.println(">> Berhasil disimpan ke database_ancaman.txt");
            
        } catch (IOException e) {
            System.out.println("Error saat menyimpan: " + e.getMessage());
        }
    }
}
