package buoi3;

import java.util.Scanner;

import buoi2.Diem;

public class DThang {
	private Diem d1, d2;
	
	public DThang() {
		d1 = new Diem();
		d2 = new Diem();
	}
	
	public DThang(Diem d11, Diem d22) {
		d1 = new Diem(d11);
		d2 = new Diem(d22);
	}
	
	public DThang(DThang dt) {
		d1 = new Diem(dt.d1);
		d2 = new Diem(dt.d2);
	}
	
	public String toString() {
		return "["+ d1 +"," + d2 +"]";
		
	}
	
	public DThang( int ax, int ay, int bx, int by) {
		d1 = new Diem(ax, ay);
		d2 = new Diem(bx, by);
	}
	
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap toa do diem dau \n");
		d1.nhap(); // ham nhap lop Diem
		System.out.println("Nhap toa do diem cuoi \n");
		d2.nhap();
	}
	
	public void in() {
		System.out.println("toa do 2 dau mut cua doan thang la ");
		System.out.println("["+ d1 +"," + d2 +"]");
	}
	
	public void tinhTien(int dx, int dy) {
		d1.tinhtien(dx, dy);
		d2.tinhtien(dx, dy);
	}
	
	public float doDaiDThang() {
		return d1.khoangCach(d2);
	}
	
	public Diem trungDiem() {
		int x = ( d1.layX() + d2.layX() ) /2;
		int y = ( d2.layY() + d2.layY() ) /2;
		return new Diem(x, y);
	}

}
