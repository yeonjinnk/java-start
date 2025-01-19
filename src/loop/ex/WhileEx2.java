package loop.ex;

public class WhileEx2 {
    public static void main(String[] args) {
        int num = 2;
        while(num <= 20) {
            System.out.println(num);
            num += 2;
        }
        System.out.println();
        for(num = 2; num <= 20; num += 2) {
            System.out.println(num);
        }
    }
}
