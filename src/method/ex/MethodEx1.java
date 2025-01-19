package method.ex;

public class MethodEx1 {
    public static void main(String[] args) {
        int sumVar = sum(1, 2, 3);
        double averageVar = average(sumVar);
        System.out.println("평균값: " + averageVar);

        int sumVar2 = sum(15, 25, 35);
        double averageVar2 = average(sumVar);
        System.out.println("평균값: " + averageVar2);

    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static double average(int sum) {
        return sum / 3.0;
    }
}
