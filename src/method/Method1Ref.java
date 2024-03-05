package method;

public class Method1Ref {
    public static void main(String[] args) {

        int sum1 = add(5,10);
        System.out.println("sum = " + sum1);

        int x = 10;
        int y = 20;
        System.out.println(x+"+"+y +"연산수행" );
        int sum2 = x+y;
        System.out.println("sum2 = " + sum2);
    }

    public static int add(int a, int b) {
        System.out.println(a+"+"+b +"연산수행" );
        int sum = a+b;
        return sum;
    }
}
