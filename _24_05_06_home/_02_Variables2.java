package _24_05_06_home;

public class _02_Variables2 {
    public static void main(String[] args) {


        byte num1 = -100;
        byte num2 = 121;


        num1--;
        System.out.println(num1);

        num2++;
        System.out.println(num2);


        char ch1 = 'A';
        char ch2 = 65;

        System.out.println(ch1);
        System.out.println(ch2);

        char ch3 = '자';

        System.out.println((int)ch3);


        int unicode = '유';
        System.out.println(unicode);

        String str1 = "java";
        String strEmpty = "";

        final double PI;
        double pi = 3.14;

        int radius = 10;

        double area = pi * radius * radius;
        double circumference = 2 * pi * radius;

        System.out.println(area);
        System.out.println(circumference);
    }
}
