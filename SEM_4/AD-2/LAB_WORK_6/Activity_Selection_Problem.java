public class Activity_Selection_Problem {

    public static void printActivities(int S[], int F[], int n) {
        System.out.print("The Following activities are selected : ");
        int i = 0;
        System.out.print(i + " ");
        for (int j = 1; j < n ; j++) {
            if (S[j] >= F[i]) {
                System.out.print(j + " ");
                i = j;
            }
        }
    }
    public static void main(String[] args) {
        int S[] = { 1, 3, 0, 5, 8, 5 }; 
        int F[] = { 2, 4, 6, 7, 9, 9 }; 
        printActivities(S, F, S.length);
    }
}

/*
output : 

    The Following activities are selected : 0 1 3 4 
    
 */