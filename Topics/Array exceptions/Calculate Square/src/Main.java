import java.util.Arrays;

class FixingExceptions {

    public static void calculateSquare(int[] array, int index) {
        // write your code here
        int size = array == null ? 0 : array.length;
        if (index < 0 || index > size) {
            System.out.println("Exception!");
        } else {
            System.out.println(array[index] * array[index]);
        }
    }
}