package _24_05_06_home;

public class _02_Variables {
    static int num;
    public static void main(String[] args) {

        num = 100;
        System.out.println(num);

        int num2 = 150;
        System.out.println(num2);

        int sum = 0;

        if (num < 101) {
            sum = num + num2;
            System.out.println(sum);
        } else {
            System.out.println(num);
        }
    }
}
