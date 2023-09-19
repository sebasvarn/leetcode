package Easy;
/*
You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians). The soldiers are positioned in front of the civilians. That is, all the 1's will appear to the left of all the 0's in each row.

        A row i is weaker than a row j if one of the following is true:

        The number of soldiers in row i is less than the number of soldiers in row j.
        Both rows have the same number of soldiers and i < j.

        Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.
        Example 1:
        Input: mat =
        [[1,1,0,0,0],
        [1,1,1,1,0],
        [1,0,0,0,0],
        [1,1,0,0,0],
        [1,1,1,1,1]],
        k = 3
        Output: [2,0,3]
        Explanation:
        The number of soldiers in each row is:
        - Row 0: 2
        - Row 1: 4
        - Row 2: 1
        - Row 3: 2
        - Row 4: 5
        The rows ordered from weakest to strongest are [2,0,3,1,4].
        Example 2:

        Input: mat =

        [[1,0,0,0], [1,0]
        [1,1,1,1],  [4,2]
        [1,0,0,0],  [1,3]
        [1,0,0,0]], [1,4]

        k = 2
        Output: [0,2]
        Explanation:
        The number of soldiers in each row is:
        - Row 0: 1
        - Row 1: 4
        - Row 2: 1
        - Row 3: 1
        The rows ordered from weakest to strongest are [0,2,3,1].
*/

/*

 */
public class KweakestR {
    public int[] kWeakestRows(int[][] mat, int k) {
        int i, j = 0;

        int[] weakestR = new int[k];
        int[][] contadores = new int[mat.length][2];

        for (int m = 0; m < mat.length;m++ ) {
            i = 0;
            for (int n = 0; n < mat[0].length;n++ ) {
                if (mat[m][n] == 1) {
                    i++;
                }
            }
            contadores[j][0] = i;
            contadores[j][1] = m;
            j++;
        }
        bubbleSort(contadores, contadores.length);
        for ( i  = 0; i< k;i++ ){
            weakestR[i] = contadores[i][1];
        }

            return weakestR;
    }
    public static void main(String[] args) {
        KweakestR kweakestR = new KweakestR();
        int[][] mat = {{1,1,0,0,0},
                       {1,1,1,1,0},
                       {1,0,0,0,0},
                       {1,1,0,0,0},
                       {1,1,1,1,1}};
        int k = 3;
        kweakestR.kWeakestRows(mat,k);
    }
    static void bubbleSort(int[][] arr, int n)
    {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = isSwapped(arr, n, i);

            // If no two elements were
            // swapped by inner loop, then break
            if (!swapped)
                break;
        }
    }

    private static boolean isSwapped(int[][] arr, int n, int i) {
        boolean swapped;
        int j;
        int[] temp = new int[2];
        swapped = false;
        for (j = 0; j < n - i - 1; j++) {
            if (arr[j][0] > arr[j + 1][0] || (arr[j][0] == arr[j + 1][0]) && arr[j][1] > arr[j + 1][1]) {
                // Swap arr[j] and arr[j+1]
                temp[0] = arr[j][0];
                temp[1] = arr[j][1];

                arr[j][0] = arr[j + 1][0];

                arr[j][1] = arr[j + 1][1];
                arr[j + 1][0] = temp[0];
                arr[j + 1][1] = temp[1];
                swapped = true;
            }
        }
        return swapped;
    }
}
