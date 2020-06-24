package testy;

import java.util.Random;

public class testy {
    public static void main(String[] args) {
        Random random = new Random();
        for(int i = 0; i <200; i++) {
            int n = (random.nextInt(49)+1);
            if (n==0) System.out.println(" JEST ZERO !!!!!");
            System.out.println("Wynik: " + n);
        }
    }
}
