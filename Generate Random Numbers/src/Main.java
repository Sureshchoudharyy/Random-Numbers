import java.util.Random;
public class Main {
    public static void main(String[] args) {

        Random r = new Random();
        int num1;
        int num2;
        int num3;
        num1 = r.nextInt(1,11);
        num2 = r.nextInt(1,11);
        num3 = r.nextInt(1,11);

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}