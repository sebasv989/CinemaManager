import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        String shape = scanner.nextLine();
        double floorArea = 0;
        double pi = 3.14;

        switch (shape) {


            case "triangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                double s = (a + b + c) / 2;
                floorArea = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                System.out.println(floorArea);
                break;
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                System.out.println(a * b);
                break;
            case "circle":
                double r = scanner.nextDouble();
                floorArea = pi * r * r;
                System.out.println(floorArea);
                break;

        }

    }
}
