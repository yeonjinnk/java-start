package method.ex;

public class MethodEx3 {
    public static void main(String[] args) {
        int balance = 10000;
    }

    public static void deposit(int balance, int depositAmount) {
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
    }

    public static void withdraw(int balance, int withdrawAmount) {
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        }
        else {
            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
    }
}


