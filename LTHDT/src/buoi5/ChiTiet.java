package buoi5;

import java.util.Scanner;

public class ChiTiet {
	private int sluong;
	private float dgia;
	private HangHoa h;
	public ChiTiet() {
		h = new HangHoa();
		sluong = 0;
		dgia = 0.0f;
	}
	public ChiTiet(ChiTiet c) {
		h = new HangHoa(c.h);
		sluong = c.sluong;
		dgia = c.dgia;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap vao thong tin hang hoa: ");
		h.nhap();
		
		System.out.print("\nNhap vao so luong hang hoa: ");
		sluong = sc.nextInt();
		
		System.out.print("\nNhap vao don gia hang hoa: ");
		dgia = sc.nextFloat();
	}
	public void in() {
		System.out.println("Thong tin hang hoa: " + h + ", so luong: " + sluong + ", don gia: " + dgia);
	}
	public String toString() {
		return("Thong tin hang hoa: " + h + ", so luong: " + sluong + ", don gia: " + dgia);
	}
	public int laySLuong() {
		return sluong;
	}
	public float layDGia() {
		return dgia;
	}
}
