package practice.array;

import java.util.Scanner;

public class ArrayEx2 {

    public static void main(String[] args) {

        int[] numbers = new int[5];

        Scanner scanner = new Scanner(System.in);

        System.out.println("5개의 정수를 입력하세요:");
        for(int i = 0; i <numbers.length; i++) {
            int num = scanner.nextInt();
            numbers[i] = num;
        }

        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if(i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
