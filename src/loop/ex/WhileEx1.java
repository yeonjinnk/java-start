package loop.ex;

public class WhileEx1 {
    public static void main(String[] args) {
        int count = 1;
        while(count <= 10) {
            System.out.println(count);
            count++;
        }

        System.out.println();
        for(count = 1; count <= 10; count++) {
            System.out.println(count);
        }
    }
}
