package buoi3;

import buoi2.Diem;

public class DoanThang {
	
	private Diem d1, d2;
	
	public DoanThang(){
		d1 = new Diem();
		d2 = new Diem();
	}
	
	public DoanThang(Diem A, Diem B){
		d1 = new Diem(A);
		d2 = new Diem(B);
	}
	
	public DoanThang(DoanThang dt){
		d1 = new Diem(dt.d1);
		d2 = new Diem(dt.d2);
	}
	
	public DoanThang(int x1, int y1, int x2, int y2){
		d1 = new Diem(x1, y1);
		d2 = new Diem(x2, y2);
	}
	
	public void nhap(){
		System.out.println("Nhap toa do diem dau: ");
		d1.nhap();
		System.out.println("Nhap toa do diem cuoi: ");
		d2.nhap();
	}
	
	public String toString(){  // [(6,5),(-1,4)]
		return "["+d1+","+d2+"]";
	}
	
	public void in(){
		System.out.println("Toa do hai diem cua doan thang la: ");
		System.out.println("["+d1+","+d2+"]");
	}
	
	public void tinhTien(int dx, int dy){
		d1.tinhTien(dx, dy);
		d2.tinhTien(dx, dy);
	}
	
	public float doDaiDoanThang(){
		return d1.khoangCach(d2);
	}
	
	
}







