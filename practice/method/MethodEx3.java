package practice.method;

public class MethodEx3 {

    public static void main(String[] args) {

        int balance = 10000;
        balance = depositAmount(balance, 1000);
        balance = withdrawAmount(balance, 2000);
        nowBalance(balance);


    }

    public static int depositAmount(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금했습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdrawAmount(int balance, int amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금했습니다. 현재 잔액: " + balance);
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }

    public static void nowBalance(int balance) {
        System.out.println("현재 잔액: " + balance);
    }
}
