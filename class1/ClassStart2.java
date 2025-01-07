package class1;

public class ClassStart2 {

    public static void main(String[] args) {

        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrade = {90, 80};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름: " + studentNames[i] + " 나이: " + studentAges[i] + " 성적: " + studentGrade[i]);
        }

        // 학생이 많을 때, 정보 수정의 어려움이 있다.

    }
}
