package D;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList squares = new ArrayList<>();
        Square s1 = new Square(4, 10);
        Square s2 = new Square(5, 5);
        Square s3 = new Square(4, 12);
        Square s4 = new Square(2, 4);
        squares.add(s1.getPerimeter());
        squares.add(s2.getPerimeter());
        squares.add(s3.getPerimeter());
        squares.add(s4.getPerimeter());

        s1.compareTo(s2);
        Collections.sort(squares);
        System.out.println(squares);


    }
}
