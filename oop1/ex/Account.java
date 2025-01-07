package oop1.ex;

public class Account {

    int balance = 0;

    void deposit(int amount) {
        balance += amount;
        System.out.println(amount + "원을 입급했습니다. 현재 잔액: " + balance);
    }

    void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액이 부족하여 출금하지 못했습니다. 현재 잔액: " + balance);
        } else {
            balance -= amount;
            System.out.println(amount + "원을 출금했습니다. 현재 잔액: " + balance);
        }
    }
}
