public class PascalsTrianglee {
    public static int PascalsTriangle1(int[] arr) {
        int row = arr[1];
        int col = arr.length-1;
        int number = 1, result = 0;

        for (int i = 0; i < row+1;i++){
            number = 1;
            for (int j = 0; j <= i; j++){
                number = number * (i - j) / (j + 1);
                if (i == row && j == col) result = number;
            }
        }
        return result == 0 ? -1 : result;
    }
}
