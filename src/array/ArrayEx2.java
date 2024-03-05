package array;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i] = input.nextInt();
        }
        for (int i : arr) {
            System.out.println("i = " + i);
        }
    }
}
