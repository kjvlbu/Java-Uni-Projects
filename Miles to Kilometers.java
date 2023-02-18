import java.util.Scanner;

public class Main{
    public static void main(String args[]) {

        float miles;
        double kilometers;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the amount of miles travelled: ");
        miles = scan.nextFloat();

        kilometers = (miles * 1.60935);
        System.out.println(miles + " miles in kilometres would be "+kilometers+" kilometers travelled");

    }
}
