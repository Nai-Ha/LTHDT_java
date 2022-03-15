package buoi1;
import java.util.Scanner;
public class hellojava {

	public static void main(String[] args) {
		int i, sum=0;
		// TODO Auto-generated method stub
		System.out.println("Hello");
		//tinh sum cac so nguyen le
		Scanner sc = new Scanner(System.in);
		System.out.println("\nnhap vao so nguyen duong n ");
		int n = sc.nextInt();
		for(i=1; i<n; i=i+2) {
			sum = sum+i;
		}
		System.out.println("\n Sum = " + sum);
	}
}
