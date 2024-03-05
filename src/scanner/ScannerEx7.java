package scanner;

import java.util.Scanner;

public class ScannerEx7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int start = input.nextInt();
        int end = input.nextInt();

        for(int i=start;i<end;i++){
            System.out.println(i);
        }

    }
}
