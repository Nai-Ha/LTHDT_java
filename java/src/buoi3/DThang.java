package buoi3;

import buoi2.Diem;

public class DThang {
	private Diem d1, d2;

	public DThang(){
		d1 = new Diem();
		d2 = new Diem();
	}
	public DThang(Diem A, Diem B){
		d1 = new Diem(A);
		d2 = new Diem(B);
	}
	public DThang(int ax, int ay, int bx, int by){
		d1 = new Diem(ax, ay);
		d2 = new Diem(bx, by);
	}
	public DThang(DThang dt ){
		d1 = new Diem(dt.d1);
		d2 = new Diem(dt.d2);
	}
	public void nhap(){
		System.out.println("Nhap toa do diem dau: ");
		d1.nhap();	// ham nhap cua lop Diem
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
		int x = (d1.layX() + d2.layX())/2;
		int y = (d1.layY() + d2.layX())/2;
		return new Diem(x,y);
	}



}
