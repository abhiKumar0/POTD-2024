public class ArrayConversion {
    public static int[][] construct2DArray(int[] o, int m, int n) {
        //Initializing a 2d array
        int[][] arr = new int[m][n];

        //Returning an empty array if m*n is greater than size of original array;
        if (m*n != o.length) return new int[0][0];

        //Index of Original array
        int a = 0;

        //Adding elements in 2d array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = o[a++];
            }
        }

//        returning that 2d array
        return arr;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int m = 2;
        int n = 2;
        int[][] newArr = construct2DArray(arr, m, n);


        for (int[] a: newArr) {
            for (int b: a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}