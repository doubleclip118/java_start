package variable;

public class Var8 {
    public static void main(String[] args) {
        //정수
        byte b=127; //-128~ 127 파일을 조작할때말고는 사용안한다.
        short s=32767; // -32768~32767
        int i=2147483647;//-2147483648~2147483647 약 20억
        long l=1L;//L을 붙혀서 표기하고 매우큰수를 표기한다.

        //실수
        float f=10.0f;//f를 붙혀줘야함 7자리 정밀도 실무사용안함
        double d=10.0; //d 15자리 정밀도


    }
}
