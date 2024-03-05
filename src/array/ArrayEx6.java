package array;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        int[] arr = new int[n];
        int min,max;
        
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        
        min = arr[0];
        max = arr[0];

        for (int i : arr) {
            if(i<min){
                min = i;
            }
            else if (i>max){
                max = i;
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
