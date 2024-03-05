package cond;

public class ConEx1 {
    public static void main(String[] args) {
        int score=95;
        System.out.println("score: "+score);
        if(score>=90){
            System.out.println("학점은 A입니다");
        }
        else if(score<90&&score>=80){
            System.out.println("학점은 B입니다");
        }
        else if(score<80&&score>=70){
            System.out.println("학점은 C입니다");
        }
        else if(score<70&&score>=80){
            System.out.println("학점은 D입니다");
        }
        else{
            System.out.println("학점은 F입니다");
        }

        int a=10,b=20;
        int max=(a>b)?a:b;
        System.out.println(max);

    }
}
