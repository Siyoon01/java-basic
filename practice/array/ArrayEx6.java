package practice.array;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;

        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int count = scanner.nextInt();
        int[] numbers = new int[count];

        System.out.println(count + "개의 정수를 입력하세요:");
        for(int i = 0; i < numbers.length; i++) {
            int num = scanner.nextInt();
            if(i == 0) {
                min = num;
                max = num;
            } else if(num >= max) {
                max = num;
            } else if(num <= min) {
                min = num;
            }
        }
        System.out.println("가장 작은 수: " + min);
        System.out.println("가장 큰 수: " + max);
    }
}
