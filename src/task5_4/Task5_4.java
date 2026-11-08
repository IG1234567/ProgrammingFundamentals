package task5_4;

import java.util.Scanner; // 	Importuoja Scanner klasę

public class Task5_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Sukuria objektą duomenims nuskaityti
        int n = in.nextInt(); // Nuskaito skaičių
        int[][] a = new int[n][n]; // Sukuria dvimatį masyvą, kuris saugos duomenis

        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) { 
                a[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    a[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
