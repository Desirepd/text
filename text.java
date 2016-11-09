/**
 * Created by admin on 2016/11/1.
 */
public class text {
    public static void main(String[] args) {
        int row, col, blank;
        for (row = 0; row <= 5; row++) {
            for (blank = 0; blank < 5 - row; blank++)
                System.out.print(" ");
            for (col = 0; col <= 2 * row + 1; col++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
}
