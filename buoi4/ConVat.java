package buoi4;

import java.util.Scanner;

public abstract class ConVat {
	
	public abstract void keu();	// phuong thuc truu tuong

	public static Scanner sc = new Scanner(System.in);

	private String giong, mauLong;
	private float cnang;

	public ConVat(){
		giong = new String();
		mauLong = new String();
		cnang = 1.0f;
	}

	public ConVat(String giong1, String mauLong1, float cnang1){
		giong = new String (giong1);
		mauLong = new String(mauLong1);
		cnang = cnang1;
	}

	public ConVat(ConVat cv){
		giong = new String(cv.giong);
		mauLong = new String(cv.mauLong);
		cnang = cv.cnang;
	}

	public void nhap(){
		System.out.println("Nhap giong: ");
		giong = sc.nextLine();
		System.out.println("Nhap mau long: ");
		mauLong = sc.nextLine();
		System.out.println("Nhap can nang: ");
		cnang = sc.nextFloat();
		sc.nextLine();
	}

	public void in(){
		System.out.println("\nThong tin con vat vua nhap: ");
		System.out.println("Giong: " + giong + ", Mau long: " + mauLong 
				+ ", Cang nang: " + cnang);
	}

	public String toString(){
		return "Giong: " + giong + ", Mau long: " + mauLong 
				+ ", Cang nang: " + cnang;
	}




}
