package array;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int loop = input.nextInt();
        int [] arr ;
        arr = new int[loop];

        for(int i=0;i<loop;i++){
            arr[i] = input.nextInt();
        }

        int sum= 0;
        for (int i : arr) {
            sum+=i;
        }
        System.out.println("sum = " + sum);

        double avg = (double)sum / loop;
        System.out.println("avg = " + avg);
    }
}
