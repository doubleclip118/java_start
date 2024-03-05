package array;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int[][] arr = new int[4][3];


        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                arr[i][j] = input.nextInt();
            }
        }
        for(int i=0;i<4;i++){
            int sum = 0;
            for(int j=0;j<3;j++){
                sum+=arr[i][j];
            }
            System.out.println("sum = " + sum);
            System.out.println("avg = " + (double)sum/3);
        }


    }
}
