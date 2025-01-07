package practice.scanner;

import java.util.Scanner;

public class ScannerEx1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String str = scanner.nextLine();
            if(str.equals("exit")) {
                System.out.println(str);
                break;
            }
            System.out.println(str);
        }
    }
}
