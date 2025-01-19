package cond.ex;

public class GradeSwitchEx {
    public static void main(String[] args) {
        String grade = "B";
        String result;
        switch(grade) {
            case "A":
                result = "탁월한 성과입니다!"; break;
            case "B":
                result = "좋은 성과입니다!"; break;
            case "C":
                result = "준수한 성과입니다!"; break;
            case "D":
                result = "향상이 필요합니다."; break;
            case "F":
                result = "불합격입니다."; break;
            default:
                result = "잘못된 학점입니다."; break;

        }
        System.out.println(result);
    }
}
