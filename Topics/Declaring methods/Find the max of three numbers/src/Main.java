import java.util.Scanner;

public class Main {

    public static int getNumberOfMaxParam(int a, int b, int c) {
        // write a body here
        int indexNum = 0;
        
        if (a >= b && a >= c) {
            indexNum = 1;
        } else if (b >= a && b >= c) {
            indexNum = 2;
        } else {
            indexNum = 3;
        }
        return indexNum;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}
