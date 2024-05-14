import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int numParts = scanner.nextInt();
        int fix = 0;
        int reject = 0;
        int ready = 0;

        for (int i = 0; i < numParts; i++) {

            int logs = scanner.nextInt();

            if (logs == 1) {

                fix++;

            } else if (logs == -1) {

                reject++;

            } else if (logs == 0) {

                ready++;

            }


        }

        System.out.println(ready + " " + fix + " " + reject);

    }
}