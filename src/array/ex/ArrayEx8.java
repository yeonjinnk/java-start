package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("학생수를 입력하세요:");
        int length = sc.nextInt();
        int[][] arr = new int[length][3];
        String[] subject = {"국어", "영어", "수학"};
        int[] sum = new int[length];
        double[] average = new double[length];

        for(int row = 0; row < arr.length; row++) {
            System.out.println((row + 1) + "번 학생의 성적을 입력하세요:");

            for(int col = 0; col < arr[row].length; col++) {
                System.out.print(subject[col] + " 점수:");
                arr[row][col] = sc.nextInt();
                sum[row] += arr[row][col];
            }


        }
        for(int i = 0; i < sum.length; i++) {
            average[i] = (double) sum[i] / subject.length;
            System.out.println((i + 1) + "번 학생의 총점: " + sum[i] + ", 평균: " + average[i]);
        }
    }
}
