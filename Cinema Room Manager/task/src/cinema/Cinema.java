package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int numSeats = scanner.nextInt();

        char[][] seats = createSeatMap(rows,numSeats);




        int userInput;
        do {
            printMenu();
            userInput = scanner.nextInt();
            menuSelector(userInput, seats, rows, numSeats);
        } while (userInput != 0);



    }

    private static void printSeats(char[][] seats, int rows, int numSeats) {
        System.out.println("\nCinema:");
        System.out.print(" ");
        for (int i = 1; i <= numSeats; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int i = 0; i < rows; i++) {
            System.out.print((i + 1) + "");
            for (int j = 0; j < numSeats; j++) {
                System.out.print(" " + seats[i][j]);
            }
            System.out.println();
        }
    }

    public static char[][] createSeatMap (int rows, int numSeats) {
        char[][] seats = new char[rows][numSeats];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < numSeats; j++) {
                seats[i][j] = 'S';
            }
        }
        return seats;
    }
    public static int priceCalculator(int rows, int selectedRow, int numSeats) {
        int ticketPrice;

        int totalSeats = rows * numSeats;
        int frontRows = rows / 2;

        if (totalSeats <= 60 || selectedRow < frontRows) {
            ticketPrice = 10;
        } else {
            ticketPrice = 8;
        }

        return ticketPrice;
    }
    public static void printMenu(){
        System.out.println("""
                \n1. Show the seats
                2. Buy a ticket
                3. Statistics
                0. Exit""");
    }

    public static void menuSelector (int userInput, char[][] seats, int rows, int numSeats) {

        Scanner scanner = new Scanner(System.in);
        int ticketPrice = 0;
        int count = 0;

        switch (userInput) {
            case 1:
                printSeats(seats, rows, numSeats);
                break;
            case 2:

                int totalTemp = 0;

                System.out.println("\nEnter a row number:");
                int selectedRow = scanner.nextInt() - 1;

                if (selectedRow < 0 || selectedRow >= rows) {
                    System.out.println("Wrong input!");
                    break;
                }

                System.out.println("Enter a seat number in that row:");
                int selectedSeat = scanner.nextInt() - 1;

                if (selectedSeat < 0 || selectedSeat >= numSeats) {
                    System.out.println("Wrong input!");
                    break;
                }


                if (seats[selectedRow][selectedSeat] == 'B') {
                    System.out.println("\nThat ticket has already been purchased");

                    System.out.println("\nEnter a row number:");
                    int dummyRow = scanner.nextInt() - 1;

                    if (selectedRow < 0 || selectedRow >= rows) {
                        System.out.println("Wrong input!");
                        break;
                    }

                    System.out.println("Enter a seat number in that row:");
                    int dummySeat = scanner.nextInt() - 1;


                    if (selectedSeat < 0 || selectedSeat >= numSeats) {
                        System.out.println("Wrong input!");
                        break;
                    }

                    int frontRows = rows / 2;
                    int temp = 0;
                    if (rows * numSeats < 60 || dummyRow < frontRows){
                        temp = 10;
                    } else {
                        temp = 8;
                    }
                    ticketPrice = temp;
                    seats[dummyRow][dummySeat] = 'B';
                    count++;
                    System.out.println("\nTicket price: $" + ticketPrice);
                    break;
                }

                ticketPrice = priceCalculator(rows,selectedRow,numSeats);
                seats[selectedRow][selectedSeat] = 'B';
                count++;

                System.out.println("\nTicket price: $" + ticketPrice);
                break;
            case 3:

                count = 0;
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < numSeats; j++) {
                        if (seats[i][j] == 'B') {
                            count++;
                        }
                    }
                }

                double percentageSales = (count * 100.0) / (rows * numSeats);
                int totalTickets = (rows * numSeats <= 60) ? (10 * rows * numSeats) : (10 * (rows / 2) * numSeats + 8 * (rows - rows / 2) * numSeats);
                int currentIncome = 0;

                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < numSeats; j++) {
                        if (seats[i][j] == 'B') {
                            currentIncome += priceCalculator(rows, i, numSeats);
                        }
                    }
                }

                System.out.printf("Number of purchased tickets: %d%n", count);
                System.out.printf("Percentage: %.2f%%%n", percentageSales);
                System.out.printf("Current income: $%d%n", currentIncome);
                System.out.printf("Total income: $%d%n", totalTickets);
                break;
            case 0:

                break;
            default:
                System.out.println("\nWrong input!");
                break;

        }

    }


}