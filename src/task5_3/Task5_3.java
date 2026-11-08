package task5_3;

import java.util.Scanner; // 	Importuoja Scanner klasę
import java.text.DecimalFormat;

public class Task5_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Sukuria objektą duomenims nuskaityti
        DecimalFormat df = new DecimalFormat("0.##");

        int d = in.nextInt(); // Nuskaito dalykų skaičių
        int s = in.nextInt(); // Nuskaito studentų skaičių
        int[][] grades = new int[s][d]; // Sukuria dvimatį masyvą, kuris saugos pažymių duomenis
        double[] avg = new double[s]; // Sukuria masyvą, kuris saugos vidurkius
        int studentSum = 0; // Inicializuoja kintamąjį studentSum su reikšme 0
        int groupSum = 0; // Inicializuoja kintamąjį groupSum su reikšme 0

        for (int i = 0; i < s; i++) { // ciklas eina per studentus
            for (int j = 0; j < d; j++) { // ciklas eina per kiekvieno studento dalykus
                grades[i][j] = in.nextInt(); // Nuskaito pažymį ir priskiria jį masyvo elementui
                studentSum += grades[i][j]; // Prideda pažymį prie studento sumos   

            }
            avg[i] = (double)studentSum / d; // Apskaičiuoja vidurkį

            groupSum += studentSum; // Prideda studento sumą prie grupės sumos

            studentSum = 0;

        }
        double groupAvg = (double)groupSum / (s * d); // Apskaičiuoja grupės vidurkį

        System.out.println("Student averages: ");
        for (int i = 0; i < s; i++) {
            System.out.println(df.format(avg[i]));
        };
        
        System.out.println("Group average: ");
        System.out.println(groupAvg);
                int findHighestPerformingStudent = 0;
        for (int i = 0; i < s; i++) {
            if (avg[i] > avg[findHighestPerformingStudent]) {
                findHighestPerformingStudent = i;
            }
        }

        double maxAvg = avg[0];
        for (int i = 1; i < s; i++) {
            if (avg[i] > maxAvg) {
                maxAvg = avg[i];
            }
        }
        for(int i = 0; i < s; i++){
            if (maxAvg == avg[i]) {
                System.out.println("Highest-performing student: ");
                System.out.println(1 + i);
            }
        }

        System.out.println("Students with at least one grade below 5: ");
        boolean foundAny = false;
        for (int i = 0; i < s; i++) {
            boolean hasBelow5 = false;
            for (int j = 0; j < d; j++) {
                if ( grades[i][j] < 5) {
                    hasBelow5 = true;
                    foundAny = true;
                    break;    
                }
            }
            if (hasBelow5) {
                System.out.println((1 + i));
            }
        }
        if (!foundAny) {
            System.out.println("None");
        }

        in.close();
    }
}
