public class HackerRank {
    public static int hourGlass(int [][] arr)
    {
        int max = 0;
        int sum = 0;
        for (int r = 0; r < arr.length - 2; r++)
        {
            for (int c = 0; c < arr[0].length - 2; c++)
            {
                sum += arr[r][c] + arr[r][c + 1] + arr[r][c + 2] + arr[r + 1][c + 1] + arr[r + 2][c] + arr[r + 2][c + 1] + arr[r + 2][c + 2];
                if (sum > max) max = sum;
            }
        }
        return max;
    }
}
