package task5_2; // Nurodo programos paketą

import java.util.Scanner; // 	Importuoja Scanner klasę
import java.text.DecimalFormat;

public class Task5_2 { // Sukuria klasę
    public static void main(String[] args) { // Nurodo programos pradžią
        Scanner in = new Scanner(System.in); // Sukuria objektą duomenims nuskaityti
        
        int n = in.nextInt();
        int[] residents = new int[n]; // Sukuria masyvą, kuris saugos gyventojų skaičių kiekviename name
        
        for (int i = 0; i < n; i++) { // Ciklas, kuris kartojasi n kartų
            residents[i] = in.nextInt(); // Nuskaito gyventojų skaičių kiekviename name ir priskiria jį masyvo elementui
        }

        int leftSum = 0; // Inicializuoja kintamąjį leftSum su reikšme 0
        int rightSum = 0; // Inicializuoja kintamąjį rightSum su reikšme 0
        int leftCount = 0; // Inicializuoja kintamąjį leftCount su reikšme 0
        int rightCount = 0; // Inicializuoja kintamąjį rightCount su reikšme 0
        
        for (int i = 0; i < n; i++) { // Ciklas, kuris kartojasi n kartų
            if ( (i + 1) % 2 == 0) { // Tikrina, ar namo numeris yra lyginis
                rightSum += residents[i]; // Jei taip, prideda gyventojų skaičių prie dešinės pusės sumos
                rightCount++; // Padidina dešinės pusės namų skaičių
            } else { // Jei namo numeris yra nelyginis
                leftSum += residents[i]; // Prideda gyventojų skaičių prie kairės pusės sumos
                leftCount++; // Padidina kairės pusės namų skaičių
            }
        }

        int total = leftSum + rightSum; // Apskaičiuoja bendrą gyventojų skaičių

        DecimalFormat df = new DecimalFormat("0.##");

        String leftAvg = leftCount == 0 ? "N/A" : df.format((double) leftSum / leftCount); // Apskaičiuoja kairės pusės gyventojų vidurkį
        String rightAvg = rightCount == 0 ? "N/A" : df.format((double) rightSum / rightCount); // Apskaičiuoja dešinės pusės gyventojų vidurkį

        System.out.println("Total residents: " + total); // Išveda bendrą gyventojų skaičių        
        System.out.println("Residents on the left: " + leftSum); // Išveda kairės pusės gyventojų skaičių
        System.out.println("Residents on the right: " + rightSum); // Išveda dešinės pusės gyventojų skaičių
        System.out.println("Average per house on the left: " + leftAvg); // Išveda kairės pusės gyventojų vidurkį
        System.out.println("Average per house on the right: " + rightAvg); // Išveda dešinės pusės gyventojų vidurkį

        in.close();
    }
}
