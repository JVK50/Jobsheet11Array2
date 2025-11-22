package Array2d;
import java.util.Scanner;

public class Tugas13 {
    public static void main(String[] args) {
        Scanner jvk = new Scanner(System.in);
        int [][] Survey = new int [10][6];
        double rata1, rata2;
        double total = 0;

        for (int i = 0; i < Survey.length; i++) {
            System.out.println("Responden ke-" + (i+1));
            System.out.println("========================");

            for (int j = 0; j < Survey[i].length; j++) {
                System.out.print("Survey ke-" + (j+1) + " (1-5): ");
                Survey[i][j] = jvk.nextInt();
                if (Survey[i][j] < 1 || Survey[i][j] > 5) {
                    System.out.println("Inputan salah, silakan masukkan nilai antara 1-5");
                    j--;
                }
            }
        }

        for (int i = 0; i < Survey.length; i++) {
            System.out.print("Rata-rata responden ke-" + (i+1) + ": ");  
            rata1 = 0;
            
            for (int j = 0; j < Survey[i].length; j++) {
                rata1 += Survey[i][j];
                total += rata1;
            }
            System.out.println(rata1/6);
        }

        for (int j = 0; j < 6; j++) {
            System.out.print("Rata-rata survey ke-" + (j+1) + ": ");
            rata2 = 0;

            for (int i = 0; i < 10; i++) {
                rata2 += Survey[i][j];
                total += rata2;
            }

            System.out.println(rata2/10);
        }

        total = total / (10 * 6);
        System.out.println("Rata-rata keseluruhan: " + total);
        
        jvk.close();
    }
}
