package A;

import java.util.Random;

public class RandomNumber {
    public static int RandomNumberBetween1and10(){
        Random random = new Random();
        return random.nextInt(10)+ 1;
    }
}
