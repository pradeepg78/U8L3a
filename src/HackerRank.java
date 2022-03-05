public class HackerRank {
    public static int hourGlass(int [][] arr)
    {
        int[][] sum = new int [4][4];
        for (int r = 0; r < arr.length - 2; r++)
        {
            for (int c = 0; c < arr[0].length - 2; c++)
            {
                int s = 0;
                s += arr[r][c] + arr[r][c + 1] + arr[r][c + 2] + arr[r + 1][c + 1] + arr[r + 2][c] + arr[r + 2][c + 1] + arr[r + 2][c + 2];
                sum[r][c] = s;
            }
        }
        int max = sum[0][0];
        for (int r = 0; r < sum.length; r++)
        {
            for (int c = 0; c < sum[0].length; c++)
            {
                if (sum[r][c] > max) max = sum[r][c];
            }
        }
        return max;
    }
}
