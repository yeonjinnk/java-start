package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    static int balance = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println(" ```--------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println(" ```--------------------------------");
            System.out.print("선택: ");

            int input = sc.nextInt();


            if(input == 1) {
                System.out.println("입금액을 입력하세요: ");
                deposit(sc.nextInt());
            } else if(input == 2) {
                System.out.println("출금액을 입력하세요: ");
                withdraw(sc.nextInt());
            } else if(input == 3) {
                balance();
            } else {
                System.out.println("시스템을 종료합니다.");
                break;
            }
        }


    }

    public static void deposit(int won) {
        balance += won;
        System.out.print(won + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
    }

    public static void withdraw(int won) {
        if(balance >= won) {
            balance -= won;
            System.out.print(won + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(won + "원을 출금하려 했으나 잔액이 부족합니다.");
        }


    }

    public static void balance() {
        System.out.print("현재 잔액: " + balance);

    }

}
