import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        x = 0;
        y = 4;

        while (x < 3) {
            y = y + 2;
            x = x + 1;
            System.out.println(x + "-" + y);
        }
    }
}
