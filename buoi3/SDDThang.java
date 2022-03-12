package buoi3;

import buoi2.Diem;

public class SDDThang {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diem A = new Diem(2,5);
		Diem B = new Diem(20, 35);
		DThang AB = new DThang(A, B);
		System.out.println("Doan thang AB vua nhap: "+ AB);
		AB.tinhTien(5, 3);
		System.out.println("Doan thang AB sau khi tinh tien mot doan (5, 3): "+ AB);
		
		DThang CD = new DThang();
		CD.nhap();
		System.out.println("Doan thang CD vua nhap: "+ CD);
			
		System.out.println("Do dai doan thang CD = "+ CD.doDaiDoanThang());
		
		System.out.println("trung diem cua CD :");
		CD.trungDiem().in();
		System.out.println("Trung diem CD " + CD.trungDiem());
		
		DThang d1 = new DThang(CD);
		d1.in();
		DThang d2 = d1;
		d2.in();
		
	}


}
