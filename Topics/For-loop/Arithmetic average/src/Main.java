import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double average = 0;
        int count = 0;

        for (int i = (int)num1; i <= num2; i++) {

            if (i % 3 == 0) {
                average += i;
                count++;
            }

        }
        if (count > 0){
            System.out.println(average / count);
        }

    }
}