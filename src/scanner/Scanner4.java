package scanner;


import java.util.Scanner;

public class Scanner4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("문자열을 입력해주세요");
            String str = scanner.nextLine();
            if(str.equals("exit") ){
                break;
            }
            else{
                System.out.println("입력한 문자는 = " + str);

            }
        }


    }
}
