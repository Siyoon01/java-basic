package practice.array;

import java.util.Scanner;

public class ArrayEx7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] students = new int[4][3];
        String[] subjects = {"국어", "영어", "수학"};

        for(int i = 0; i < students.length; i++) {
            System.out.println((i+1) + "번 학생의 성적을 입력하세요:");
            for(int j = 0; j < subjects.length; j++) {
                System.out.print(subjects[j] + " 점수: ");
                int score = scanner.nextInt();
                students[i][j] = score;
            }
        }

        for(int i = 0; i < students.length; i++) {
            int sum = 0;
            double average = 0;
            for(int j = 0; j < subjects.length; j++) {
                sum += students[i][j];
            }
            average = (double) sum / subjects.length;
            System.out.println((i+1) + "번 학생의 총점: " + sum + ", 평균: " + average);
        }
    }
}
