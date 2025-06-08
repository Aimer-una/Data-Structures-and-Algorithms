import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        // jdk14 switch新特性
        enum Size { SMALL, MEDIUM, LARGE }

        Size size = Size.SMALL;

        String result = switch(size) {
            case SMALL -> "小";
            case MEDIUM -> "中";
            case LARGE -> "大";
            };
        System.out.println(result);
    }
}
//println