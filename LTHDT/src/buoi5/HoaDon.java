package buoi5;

import java.util.Scanner;

public class HoaDon {
	private String mso, tde, nvien;

	private ChiTiet c[];
	private int sl;

	public HoaDon() {
		mso = new String();
		tde = new String();
		nvien = new String();
		c = new ChiTiet[20];
		sl = 0;
	}

	public HoaDon(HoaDon h) {
		mso = new String(h.mso);
		tde = new String(h.tde);
		nvien = new String(h.nvien);
		c = new ChiTiet[h.c.length];
		sl = h.sl;
		for (int i = 0; i < sl; i++)
			c[i] = new ChiTiet(h.c[i]);

	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap vao ma so hoa don: ");
		mso = sc.nextLine();

		System.out.print("\nNhap vao tieu de hoa don: ");
		tde = sc.nextLine();

		System.out.print("\nNhap vao ten nhan vien lap hoa don: ");
		nvien = sc.nextLine();

		System.out.print("\nNhap vao so luong chi tiet hang hoa: ");
		sl = sc.nextInt();

		for (int i = 0; i < sl; i++) {
			System.out.print("\nNhap vao chi tiet thu" + (i + 1) + ":");
			c[i] = new ChiTiet();
			c[i].nhap();
		}
	}

	public void in() {
		System.out.println("\nMa so hoa don" + mso + "," + tde + "\nNguoi lap hoa don: " + nvien);
		System.out.println("Cac chi tiet hoa don:");
		for (int i = 0; i < sl; i++)
			System.out.print("\n" + (i + 1) + ":" + c[i]);
		System.out.print("\nTong so tien: " + tong());
	}

	public String toString() {
		String s = ("ma so hoa don" + mso + "," + tde + "\n Nguoi lap hoa don: " + nvien);
		s += ("Cac chi tiet hoa don: ");
		for (int i = 0; i < sl; i++)
			s += ("\n" + (i + 1) + c[i]);
		s += ("\nTong so tien: " + tong());
		return s;
	}

	public float tong() {
		float t = 0.0f;
		for (int i = 0; i < sl; i++)
			t += c[i].laySLuong() * c[i].layDGia();

		return t;
	}

	public static void main(String[] args) {
		HoaDon h = new HoaDon();
		h.nhap();
		h.in();
		Scanner sc = new Scanner(System.in);
		System.out.println("\nNhap vao so hoa don: ");
		int n = sc.nextInt();
		HoaDon ds[] = new HoaDon[n];
		for (int i = 0; i < n; i++) {
			System.out.print("\nNhap vao hoa don thu" + (i + 1) + ":");
			ds[i] = new HoaDon();
			ds[i].nhap();
		}
		System.out.println("\nDanh sach hoa don vua nhap:");
		for (int i = 0; i < n; i++)
			System.out.print((i + 1) + ": " + ds[i]);

	}
}
