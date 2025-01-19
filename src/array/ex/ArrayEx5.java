package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int length = sc.nextInt();

        int[] arr = new int[length];

        System.out.println(length + "개의 정수를 입력하세요:");

        int sum = 0;
        double average = 0;
        for(int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        average = (double) sum / length;

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
