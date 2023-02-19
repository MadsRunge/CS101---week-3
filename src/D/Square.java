package D;

public class Square implements Comparable<Square> {
    private int width;
    private int height;

    public Square(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getPerimeter(){
        int perimeter = 2 * (this.width + this.height);
        return perimeter;

    }

    @Override
    public int compareTo(Square o) {
        if (this.getPerimeter() > o.getPerimeter())
        return 0;
        else {
            return 1;
        }
    }


    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
