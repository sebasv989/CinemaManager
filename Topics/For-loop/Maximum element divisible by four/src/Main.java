import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int lines = scanner .nextInt();
        int maxNum = 0;

        for (int i = 0; i < lines; i++) {

            int num = scanner.nextInt();

            if (num % 4 == 0 && num > maxNum){

                maxNum = num;

            }
        }

        System.out.println(maxNum);

    }
}