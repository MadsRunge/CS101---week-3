package A;

import java.util.Random;

import static A.RandomNumber.RandomNumberBetween1and10;

public class Main {
    public static void main(String[] args) {



        for (int i = 0; i < 10; i++) {
            int number = RandomNumberBetween1and10();
            System.out.println(number);

        }


    }
}