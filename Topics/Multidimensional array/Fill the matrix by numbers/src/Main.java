import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] numGrid = createZero(n);
        printGrid(numGrid, n);



    }

    public static int[][] createZero(int n){

        int[][] numGrid = new int[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                int distance = Math.abs(i - j);
                numGrid[i][j] = distance;

            }
        }

        return numGrid;
    }


    public static void printGrid(int[][] numGrid, int n){

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(numGrid[i][j] + " ");
            }
            System.out.println();
        }
    }
}