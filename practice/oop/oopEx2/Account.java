package practice.oop.oopEx2;

public class Account {
    int balance;

    int deposit(int amount) {
        System.out.println(amount + "원 입금했습니다.");
        this.balance += amount;
        return balance;
    }

    int withdraw(int amount) {
        if(this.balance < amount) {
            System.out.println("잔액이 부족합니다. 출금이 취소됩니다.");
        } else {
            System.out.println(amount + "원이 출금되었습니다.");
            this.balance -= amount;
        }
        return this.balance;
    }

}
