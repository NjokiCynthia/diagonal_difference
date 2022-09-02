public class Diagonal_difference {

    public static int difference(int arr[][], int n)
    {
        // Initialize sums of the diagonals
        int d1 = 0, d2 = 0;

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                // find the sum of the primary diagonal
                if (i == j)
                    d1 += arr[i][j];

                // find the sum of the secondary diagonal
                if (i == n - j - 1)
                    d2 += arr[i][j];
            }
        }

        // Absolute difference of the sums
        // across the diagonals
        return Math.abs(d1 - d2);
    }

    /* Driver program to test above function */
    public static void main(String[] args)
    {
        int n = 3;

        int arr[][] =
                {
                        {1, 2, 3},
                        {4 , 5, 6},
                        {9, 8, 9}
                };

        System.out.print(difference(arr, n));

    }
}
