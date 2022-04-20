package buoi5;

import java.util.Scanner;

public class HoaDon {
	private String mso, tde, nvien;
	
	private ChiTiet c[];
	private int sl;
	
	public HoaDon(){
		mso = new String();
		tde = new String();
		nvien = new String();
		c = new ChiTiet[100];
		sl = 0;
	}
	
	public HoaDon(HoaDon a){
		mso = new String(a.mso);
		tde = new String(a.tde);
		nvien = new String(a.nvien);
		c = new ChiTiet[a.c.length];
		sl = a.sl;
		
		for(int i=0; i < sl; i++)
			c[i] = new ChiTiet(a.c[i]);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ma so hoa don: ");
		mso = sc.nextLine();
		System.out.println("Nhap vao tieu de hoa don: ");
		tde = sc.nextLine();
		System.out.println("Nhap vao ten nhan vien hoa don: ");
		nvien = sc.nextLine();
		System.out.println("Nhap vao so luong hoa don: ");
		sl = sc.nextInt();
		
		for(int i=0; i < sl; i++) {
			System.out.print("\nNhap vao chi tiet thu: "+ (i+1) + ": ");
			c[i] = new ChiTiet();
			c[i].nhap();
		}
	}
	
	
	
	public void in() {
		System.out.println("ma so hoa don" + mso + ", tieu de" + tde + ", ten nhan vien lap hoa don" + nvien );
		System.out.println("Cac chi tiet hoa don");
		for(int i =0; i < sl; i++)
			System.out.println("\n" + (i+1) + ":" + c[i]);
		System.out.print("\n Tong so tien :" + tong());
	}
	
	public String toString() {
	String s = ("ma so hoa don " + mso + ", tieu de " + tde + ", ten nhan vien lap hoa don " + nvien );
		s += ("Cac chi tiet hoa don");
		for(int i =0; i < sl; i++)
			s += ("\n" + (i+1) + ":" + c[i]);
		s += ("\n Tong so tien :" + tong());
		return s;
	}
	
	public float tong() {
		float t = 0.0f;
		for(int i=0; i < sl; i++)
			t += c[i].laySoLuong() * c[i].layDonGia();
		return t;
	}
	
	public static void main(String[] args) {
		HoaDon h = new HoaDon();
		h.nhap();
		h.in();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Nhap vao so Hoa Don: ");
		int n = sc.nextInt();
		HoaDon ds[] = new HoaDon[n];
		for(int i=0; i<n; i++) {
			System.out.println("Nhap vao hoa don thu: "+ (i+1) + ":" );
			ds[i] = new HoaDon();
			ds[i].nhap();
		}
		
		System.out.print("\nDanh sach vua nhap: ");
		for(int i=0; i<n; i++) 
			System.out.println("hoa don thu: "+ (i+1) + ":" +ds[i]);
	
	}


}
