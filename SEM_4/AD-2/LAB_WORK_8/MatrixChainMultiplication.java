public class MatrixChainMultiplication {

    public static int matrixChain(int p[], int i, int j) {
        if ( i == j) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int count = matrixChain(p, i, k) + matrixChain(p, k + 1, j) + p[i - 1] * p[k] * p[j];
            if (count < min) {
                min = count;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4, 3 };
        int N = arr.length;
        System.out.println(
            "Minimum number of multiplications is " + matrixChain(arr, 1, N - 1));
    }
}

/*

output : 
    Minimum number of multiplications is 30
    
 */