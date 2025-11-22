package Array2d;

import java.util.Scanner;

public class SIAKAD13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] nilai = new int[5][5];
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.println("Nilai Mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            System.out.println("Nilai rata-rata : " + totalPerSiswa/5);
        }

        System.out.println("\n===============================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah");

        for (int j = 0; j < 5; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < 5; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j + 1) + ": " + totalPerMatkul/5);
        }
    sc.close();
    }
}
