package buoi5;

import java.util.Scanner;

public class KhachHangVIP extends KhachHang {
	private float tle;
	private Date5 d;
	
	public KhachHangVIP() {
		super();
		tle = 0.0f;
		d = new Date5();
	}
	
	public KhachHangVIP(KhachHangVIP k) {
		super(k);
		tle = k.tle;
		d = new Date5(k.d);
	}
	
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao ti le giam: ");
		tle = sc.nextFloat();
		System.out.println("nhap vao ngay tro thanh Khach Hang VIP: ");
		d.nhap();
	}
	
	public void in() {
		super.in();
		System.out.println(", ti le giam: "+ tle + ", ngay tro thanh VIP: "+ d);
	}
	
	public String toString() {
		return super.toString() + (", ti le giam: "+ tle + ", ngay tro thanh VIP: "+ d);
	}
	
	public float laytle() {
		return tle;
	}

}
