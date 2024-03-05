package array;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr;
        arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i] = input.nextInt();
        }
        int sum = 0;
        for (int i : arr) {
            sum+=i;
        }
        System.out.println("sum = " + sum);
        double avg = (double) sum / 5;
        System.out.println("avg = " + avg);
    }
}
