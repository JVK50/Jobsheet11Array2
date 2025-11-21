package Array2d;

import java.util.Scanner;

public class BioskopWithScanner13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] penonton = new String[4][2];
        int baris, kolom, pilihMenu;
        String nama, teks;

        boolean keluar = false;

        while (!keluar) {
            System.out.println("\n===== MENU BIOSKOP =====");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            pilihMenu = sc.nextInt();
            sc.nextLine(); // membersihkan newline

            switch (pilihMenu) {
                case 1:
                    // Menu 1: Input data penonton
                    System.out.println("\n--- INPUT DATA PENONTON ---");
                    boolean inputLagi = true;
                    
                    while (inputLagi) {
                        System.out.print("Masukkan nama: ");
                        nama = sc.nextLine();
                        
                        System.out.print("Masukkan baris (1-4): ");
                        baris = sc.nextInt();
                        
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine(); // membersihkan newline

                        // Validasi input
                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println("❌ Posisi tidak valid! Baris (1-4) dan Kolom (1-2)");
                            continue;
                        }

                        // Cek apakah kursi sudah terisi
                        if (penonton[baris-1][kolom-1] != null) {
                            System.out.println("❌ Kursi sudah terisi oleh: " + penonton[baris-1][kolom-1]);
                        } else {
                            penonton[baris-1][kolom-1] = nama;
                            System.out.println("✅ Data penonton berhasil ditambahkan");
                        }

                        System.out.print("Input penonton lainnya? (y/n): ");
                        teks = sc.nextLine();

                        if (teks.equalsIgnoreCase("n")) {
                            inputLagi = false;
                        }
                    }
                    break;

                case 2:
                    // Menu 2: Tampilkan daftar penonton
                    System.out.println("\n--- DAFTAR PENONTON ---");
                    System.out.println("Kolom 1 \t Kolom 2");
                    System.out.println("------- \t -------");
                    
                    for (int i = 0; i < penonton.length; i++) {
                        String kol1 = (penonton[i][0] != null) ? penonton[i][0] : "-";
                        String kol2 = (penonton[i][1] != null) ? penonton[i][1] : "-";
                        System.out.printf("Baris %d: %s \t %s\n", (i+1), kol1, kol2);
                    }
                    break;

                case 3:
                    // Menu 3: Exit
                    System.out.println("Terima kasih telah menggunakan sistem bioskop!");
                    keluar = true;
                    break;

                default:
                    System.out.println("Menu tidak valid! Pilih menu 1-3");
            }
        }

        sc.close();
    }
}