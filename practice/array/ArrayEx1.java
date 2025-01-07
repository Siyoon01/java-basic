package practice.array;

public class ArrayEx1 {

    public static void main(String[] args) {

        int[] students = {80, 90, 70, 60, 50};

        int totalScore = 0;

        for(int student : students) {
            totalScore += student;
        }

        double average = (double) totalScore / 5;

        System.out.println("점수 총합: " + totalScore);
        System.out.println("점수 평균: " + average);
    }
}
