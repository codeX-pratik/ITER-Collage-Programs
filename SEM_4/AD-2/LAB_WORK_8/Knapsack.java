public class Knapsack {

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int KnapSack(int capacity, int []weight, int []value, int n) {
        if (n == 0 || capacity == 0) {
            return 0;
        }

        if (weight[n - 1] > capacity) {
            return KnapSack(capacity, weight, value, n - 1);
        } else {
            return max(value[n - 1] + KnapSack(capacity - weight[n - 1], weight, value, n - 1), KnapSack(capacity, weight, value, n - 1));
        }
    }
    public static void main(String[] args) {
        int weight[] = new int[] { 10, 20, 30 };
        int profit[] = new int[] { 60, 100, 120 };

        int W = 50;
        int n = profit.length;
        System.out.println(KnapSack(W, weight, profit, n));
    }
}

/*

output : 220

 */