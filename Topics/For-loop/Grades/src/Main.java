import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int students = scanner.nextInt();


        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;

        for (int i = 0; i <= students; i++) {

            String grade = scanner.nextLine();

            if (grade.equals("D")) {

                dCount++;

            } else if (grade.equals("C")) {

                cCount++;

            } else if (grade.equals("B")) {

                bCount++;

            } else if (grade.equals("A")){

                aCount++;

            }



        }

        System.out.println(dCount + " " + cCount + " " + bCount + " " + aCount);

    }
}