package task5_1;

import java.util.Scanner; // importuoja Scanner klasę

public class Task5_1 { // jeigu klasę pavadinsi LargestCircle, failas turi vadintis LargestCircle.java
    public static void main(String[] args) { // main metodo deklaraciją klasės Task5_1 viduje
        Scanner in = new Scanner(System.in); // Scanner objektas pavadinimu in
        int n = in.nextInt(); // nuskaito sveikąjį skaičių n iš vartotojo įvesties
        int max = 0; // inicializuoja kintamąjį max su reikšme 0
        int count = 0; // inicializuoja kintamąjį count su reikšme 0

        for (int i = 0; i < n; i++) { // ciklas, kuris kartojasi n kartų
            int x = in.nextInt(); // nuskaito sveikąjį skaičių x iš vartotojo įvesties
            if (x > max) { // tikrina, ar x yra didesnis už max
                max = x; // jei taip, priskiria x reikšmę kintamajam max
                count = 1; // nustato count reikšmę į 1
            } else if (x == max) { // tikrina, ar x yra lygus max
                count++; // jei taip, padidina count reikšmę vienetu
            }
        }
        System.out.println(max + " - " + count); // išveda didžiausią skaičių ir jo pasikartojimų skaičių

        in.close();
    }
}


