import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1 UZD
        int sk1, sk2;
        System.out.println("Print integer number: ");
        sk1 = scanner.nextInt();
        System.out.println("Print integer number: ");
        sk2 = scanner.nextInt();

        double sk3, sk4;
        System.out.println("Print number with comma: ");
        sk3 = scanner.nextDouble();
        System.out.println("Print number with comma: ");
        sk4 = scanner.nextDouble();

        //2 UZD
        Random random = new Random();
        int sk5, sk6;

        sk5 = random.nextInt(21)+5;
        System.out.println("Random number [5, 25]\t"+ sk5);
        sk6 = random.nextInt(6)-6;
        System.out.println("Random number [-6, -1]\t"+ sk6);

        System.out.println("(max - min) + 1     -->     (-1 - (-6)) + 1");

        //3 UZD
        double all = sk1 + sk2 + sk3 + sk4 + sk5 + sk6;
        System.out.println(all);

        //4 UZD
        int rem = sk5 % sk6;
        System.out.println("remainder: "+ rem);

        //5 UZD
        double general = Math.pow(sk1, sk6);
        System.out.println(sk1 +" and "+ sk6+"\n"+ general);

        //6 UZD
        double sqrtOfGeneral = 0;
        if (general >= 0) {
            sqrtOfGeneral = Math.sqrt(general);
            System.out.println("Square root of general (" + general + ") = " + sqrtOfGeneral);
        } else {
            System.out.println("General < 0. Cannot compute square root.");
        }

        //7 UZD
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println(decimalFormat.format(sqrtOfGeneral));

        //8 UZD
        int max = Math.max(sk1, sk2);
        System.out.println(max);

    }
}