package buoi3;

import buoi2.Diem;

public class DThang {
private Diem d1, d2;	//kieu dl tham chieu muon use thi cap phat bo nho new
	
	public DThang(){
		d1 = new Diem();
		d2 = new Diem();
	}
	
	public DThang(Diem A, Diem B){
		d1 = new Diem(A);
		d2 = new Diem(B);
	}
	
	public DThang(DThang dt){
		d1 = new Diem(dt.d1);
		d2 = new Diem(dt.d2);
	}
	
	public DThang(int x1, int y1, int x2, int y2){
		d1 = new Diem(x1, y1);
		d2 = new Diem(x2, y2);
	}
	
	public void nhap(){
		System.out.println("Nhap toa do diem dau: ");
		d1.nhap();
		System.out.println("Nhap toa do diem cuoi: ");
		d2.nhap();
	}
	
	
	public void in(){
		System.out.println("Toa do hai diem cua doan thang la: ");
		System.out.println("["+d1+","+d2+"]");
	}
	
	
	public String toString(){  // [(9,8),(-2,8)]
		return "["+d1+","+d2+"]";
	}
	
	
	public void tinhTien(int dx, int dy){
		d1.tinhTien(dx, dy);
		d2.tinhTien(dx, dy);
	}

	public float doDaiDoanThang(){
		return d1.khoangCach(d2);
	}

	public Diem trungDiem(){
		int x = (d1.giaTriX() + d2.giaTriX())/2;
		int y = (d1.giaTriY() + d2.giaTriX())/2;
		return new Diem(x,y);
	}
	

}
