package practice.scanner;

import java.util.Scanner;

public class ScannerEx7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("구구단의 단수를 입력하세요: ");
        int n = scanner.nextInt();

        System.out.println(n + "단의 구구단:");
        for(int i = 1; i < 10; i++) {
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
}
