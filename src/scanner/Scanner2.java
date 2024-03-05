package scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력해주세요:");
        int First_Num = scanner.nextInt();
        System.out.print("두번째 숫자를 입력해주세요:");
        int Second_Num = scanner.nextInt();
        int sum = First_Num+Second_Num;
        System.out.println("숫자의 합은:" + sum);

    }
}
