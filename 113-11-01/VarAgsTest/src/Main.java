import java.util.Scanner;

public class Main {
    public  static double average(String announcement, double... numbers){
        double sum = 0;
        System.out.printf("計算%s的平均數\n",announcement);
        for(double number : numbers){
            sum += number;
        }
        return sum / numbers.length;
    }
    public static void main(String[] args) {
        double d1 = 10.0;
        double d2 = 20.0;
        double d3 = 30.0;
        double d4 = 40.0;

        System.out.printf("d1 = %.1f, d2 = %.1f ,d3 = %.1f, d4 = %.1f\n", d1, d2, d3, d4);

        System.out.printf("avaerage(d1, d2) = %.1f\n" , average(ann
        System.out.printf("avaerage(d1, d2, d3) = %.1f\n" , average(d1, d2, d3));
        System.out.printf("avaerage(d1, d2, d3, d4) = %.1f\n" , average(d1, d2, d3, d4));
    }
}