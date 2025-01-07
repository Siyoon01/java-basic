package practice.scanner;

import java.util.Scanner;

public class ScannerEx3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while (true) {
            int num = scanner.nextInt();
            if(num == 0) {
                System.out.println("총 입력한 정수의 합 : " + sum);
                break;
            }
            sum += num;
        }

    }
}
