package scanner;

import java.util.Scanner;

public class Scanner6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하세요 (0)을 입력하면 종료");
        int sum=0;
        while(true){
            int a=scanner.nextInt();
            sum+=a;
            if(a==0){
                System.out.println("종료");
                break;
            }
            System.out.println("합계 = " + sum);
        }
    }
}
