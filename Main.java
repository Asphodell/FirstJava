import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("A?");
        int a = in.nextInt();
        System.out.println("B?");
        int b = in.nextInt();
        System.out.println("C?");
        int c = in.nextInt();
        System.out.println("D?");
        int d = in.nextInt();
        System.out.println(check(a, b, c, d));
    }
    public static int min(int a, int b) {
        if (a < b)
            return a;
        else
            return b;
    }

    public static int check(int a, int b, int c, int d) {
        if (min(a, b) < min(c, d)) {
            return min(a, b);
        } else {
            return min(c, d);
        }
    }
}