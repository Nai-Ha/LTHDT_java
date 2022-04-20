package buoi5;

import java.util.Scanner;

public class SanPham {
	private String maso, ten;
	private Date nsx;

	public SanPham() {
		maso = new String();
		ten = new String();
		nsx = new Date();
	}

	public SanPham(String maso1, String ten1, Date nsx1) {
		maso = new String(maso1);
		ten = new String(ten1);
		nsx = new Date(nsx1);
	}

	public SanPham(SanPham a) {
		maso = new String(a.maso);
		ten = new String(a.ten);
		nsx = new Date(a.nsx);
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ma so san pham: ");
		maso = sc.nextLine();
		System.out.println("Nhap vao ten san pham: ");
		ten = sc.nextLine();
		System.out.println("Nhap vao ngay san xuat san pham: ");
		nsx.nhap();

	}

	public void in() {
		System.out.println("[" + maso + "," + ten + "," + nsx + "]");

	}

	public String toString() {
		return ("[" + maso + "," + ten + "," + nsx + "]");

	}
}
