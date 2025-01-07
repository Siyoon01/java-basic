package practice.scanner;

import java.util.Scanner;

public class ScannerEx2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            if(num1 == 0 && num2 == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            int sum = num1 + num2;
            System.out.println("num1 + num2 = " + sum);
        }
    }
}
