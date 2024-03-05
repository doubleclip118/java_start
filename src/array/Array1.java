package array;

public class Array1 {
    public static void main(String[] args) {
        int[] students;//배열변수 선언
        students = new int[5]; //생성시 자동으로 초기화된다. 그리고 배열의 크기만큼 메모리를 확보한다.
                               // 배열을 생성하고나면 자바는 메모리 어딘가에 있는 배열 참조값을 반환한다.
                                // 메모리 주소를 students 에 담는다고 생각하면된다.

        students[0] =90;
        students[1] =80;
        students[2] =70;
        students[3] =60;
        students[4] =50;

        System.out.println("students[0] = " + students[0]);
    }
}
