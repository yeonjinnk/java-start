package loop.ex;

public class WhileEx3 {
    public static void main(String[] args) {
        int sum = 0;
        int max = 100;
        for(int i = 1; i <= max; i++) {
            sum += i;
        }
        System.out.println(sum);

        int count = 1;
        while(count <= max) {
            sum += count;
            count++;
        }
        System.out.println(sum);
    }
}
