package buoi5;

import java.util.Scanner;

public class ChiTiet {
	private long sl;
	private float donGia;
	private SanPham sp;
	
	public ChiTiet() {
		sl = 0;
		donGia = 0.0f;
		sp = new SanPham();
	}
	
	public ChiTiet(ChiTiet c) {
		sl = c.sl;
		donGia =c.donGia;
		sp = new SanPham(c.sp);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so luong: ");
		sl = sc.nextLong();
		System.out.println("Nhap vao Don gia san Pham: ");
		donGia = sc.nextFloat();
		System.out.println("\nNhap vao thong tin san pham: ");
		sp.nhap();
		
	}
	
	public void in() {
		System.out.println("Thong tin hang hoa: "+ sp + ", so luong " + sl + ", don gia " + donGia);
	}
	
	public String toString() {
		return ("Thong tin hang hoa: "+ sp + ", so luong " + sl + ", don gia " + donGia);
	}
	
	public long laySoLuong() {
		return sl;
	}
	
	public float layDonGia() {
		return donGia;
	}
	
	

}
