package DSA_ASSIGNMENT_1;
public class HW_5 {
    public static void main(String[] args) {
        int [][]arr = new int[4][4];
        for (int i=0 ; i<4 ; i++) {
            for (int j=0 ; j<4 ; j++) {
                arr[i][j] = (int)(Math.random()*2);
            }
        }
        for (int i=0 ; i<4 ; i++) {
            for (int j=0 ; j<4 ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int maxRow = 0;
        int maxColumn = 0;
        int maxCount = 0;

        for (int i=0 ; i<4 ; i++) {
            int c = 0;
            for (int j=0 ; j<4 ; j++) {
                if (arr[i][j] == 1) {
                    c++;
                }
            }
            if (c > maxCount) {
                maxRow = i;
                maxCount = c;
            }
        }
        for (int j=0 ; j<4 ; j++) {
            int c = 0;
            for (int i=0 ;i<4 ;i++) {
                if (arr[i][j] == 1) {
                    c++;
                }
            }
            if ( c > maxCount) {
                maxColumn = j;
                maxCount = c;
            }
        }
        System.out.println("The largest row index : " + (maxRow + 1));
        System.out.println("The largest Column index : " + (maxColumn + 1));
    }
}
