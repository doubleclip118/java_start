package scanner;

import java.util.Scanner;

public class Scanner5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("첫번쨰 숫자를 입력해주세요");
            int a=sc.nextInt();
            System.out.println("두번쨰 숫자를 입력해주세요");
            int b=sc.nextInt();
            if(a==0 && b==0){
                break;
            }
            else{
                int sum=a+b;
                System.out.println("두숫자의 합은:" +sum );
            }

        }

    }
}
