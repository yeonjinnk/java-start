package cond.ex;

public class EvenOddEx {
    public static void main(String[] args) {
        int x = 2;
        String evenOdd = (x % 2 == 0) ? "even" : "odd";
        System.out.println("x = " + x + evenOdd);
    }

}
