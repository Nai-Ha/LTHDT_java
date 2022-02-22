package buoi5;

import java.util.Scanner;

public class HangHoa {
	private String mso, ten, nsxuat;
	public HangHoa() {
		mso = new String();
		ten = new String();
		nsxuat = new String();
	}
	public HangHoa(String m, String t, String n) {
		mso = new String(m);
		ten = new String(t);
		nsxuat = new String(n);
	}
	public HangHoa(HangHoa h) {
		mso = new String(h.mso);
		ten = new String(h.ten);
		nsxuat = new String(h.nsxuat);
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap vao ma so hang hoa: ");
		mso = sc.nextLine();
		
		System.out.print("\nNhap vao ten hang hoa: ");
		ten = sc.nextLine();
		
		System.out.print("\nNhap vao nha san xuat hang hoa: ");
		nsxuat = sc.nextLine();
	}
	public void in() {
		System.out.println("[" + mso + "," + ten + "," + nsxuat + "]");
	}
	public String toString() {
		return("[" + mso + "," + ten + "," + nsxuat + "]");
	}
}
