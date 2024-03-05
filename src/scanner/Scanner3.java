package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력해주세요");
        int first = scanner.nextInt();
        System.out.println("두번째 숫자를 입력해주세요");
        int second = scanner.nextInt();
        if(first > second){
            System.out.println("첫번째숫자가 더 크다");
        }
        else if(first < second){
            System.out.println("두번째숫자가 더 크다");
        }
        else{
            System.out.println("두 숫자는 같다");
        }


    }
}
