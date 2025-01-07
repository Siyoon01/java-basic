package practice.method;

import java.util.Scanner;

public class MethodEx4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int balance = 0;

        while (true) {
            printMessage();
            selectMenu();
            int choice = scanner.nextInt();

            if(choice == 1) {
                System.out.print("입금액을 입력하세요: ");
                int amount = scanner.nextInt();
                balance = depositAmount(balance, amount);
            } else if (choice == 2) {
                System.out.print("출금액을 입력하세요: ");
                int amount = scanner.nextInt();
                balance = withdrawAmount(balance, amount);
            } else if (choice == 3) {
                nowBalance(balance);
            } else if (choice == 4) {
                System.out.println("시스템을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }

    public static void printMessage() {
        System.out.println("--------------------------------------------");
        System.out.println("1. 입금  |  2. 출금  |  3. 잔액 확인  |  4. 종료");
        System.out.println("--------------------------------------------");
    }

    public static void selectMenu() {
        System.out.print("선택: ");
    }

    public static int depositAmount(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금했습니다. 현재 잔액: " + balance);
        return balance;
    }

    public static int withdrawAmount(int balance, int amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금했습니다. 현재 잔액: " + balance);
        } else {
            System.out.println("잔액이 부족합니다.");
        }
        return balance;
    }

    public static void nowBalance(int balance) {
        System.out.println("현재 잔액: " + balance);
    }

}
