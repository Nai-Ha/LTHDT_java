package buoi1;
import static java.lang.Integer.toBinaryString;
import java.util.Scanner;

public class Ktnt {
	public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot so nguyen n = ");
        int n = sc.nextInt();
        if (isPrime(n)) {
            System.out.println(n + " la so nguyen to");
            String s = toBinaryString(n);
            System.out.println("Day so nhi phan cua so nguyen to do la: " + s);
        } else {
            System.out.println(n + " khong la so nguyen to");
        }
    }

	public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
