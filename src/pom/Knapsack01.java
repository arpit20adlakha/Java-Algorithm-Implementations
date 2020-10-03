package pom;

public class Knapsack01 {


    public static void main (String []args) {
        int val[] = new int[]{60, 100, 120};
        int wt[] = new int[]{10, 20 , 30};
        int rows = wt.length;
        int W = 50;
        int arr[][] = new int[rows+1][W+1];

        for (int i =0; i<=W; i++) {
            arr[0][i] = 0;
        }

        for (int i =0; i<=rows ; i++) {
            arr[i][0] = 0;
        }

        for(int i =1; i <=rows ; i++) {
            for (int j =1 ; j<=W; j++) {
                if (j >= wt[i-1]) {
                    arr[i][j] = Math.max(arr[i - 1][j], val[i-1] + arr[i-1][j- wt[i-1]]);
                }
                else {
                    arr[i][j] = arr[i-1][j];
                }
            }
        }



        System.out.println(arr[rows][W]);

    }
}
