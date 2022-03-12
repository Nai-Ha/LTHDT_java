package buoi1;

import java.util.Scanner;

public class nameSubString {
	public static void main(String[] args) {
		nameSubString ten = new nameSubString();
		ten.nhap();
		
	}
	
	public void nhap() {
		String hoTen;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao ho va ten cua ai do ");
		hoTen = sc.nextLine(); 
		hoTen = hoTen.trim();
		int k = hoTen.lastIndexOf(" ");
		String ten = hoTen.substring(k+1);
		System.out.println("Sau khi ho va ten duoc tach ra la: "+ ten);
		 
	}

}
