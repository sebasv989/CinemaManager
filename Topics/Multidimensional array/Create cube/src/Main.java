class ArrayOperations {
    public static int[][][] createCube() {
        // write your code here
        int[][][] arr = new int[3][3][3];

        for (int i = 0; i < arr.length; i++) {

            int element = 0;

            for (int j = 0; j < arr[i].length; j++) {

                for (int k = 0; k < arr[i][j].length; k++) {

                    arr[i][j][k] = element;
                    element++;

                }
            }
        }
        return arr;
    }
}