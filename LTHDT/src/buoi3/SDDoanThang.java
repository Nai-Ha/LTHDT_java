package buoi3;

import buoi2.Diem;

public class SDDoanThang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diem A = new Diem(2,5);
		Diem B = new Diem(20, 35);
		DoanThang AB = new DoanThang(A, B);
		System.out.println("Doan thang AB vua nhap: "+ AB);
		AB.tinhTien(5, 3);
		System.out.println("Doan thang AB sau khi tinh tien mot doan (5, 3): "+ AB);
		
		DoanThang CD = new DoanThang();
		CD.nhap();
		System.out.println("Doan thang CD vua nhap: "+ CD);
		
		
		System.out.println("Do dai doan thang CD = "+ CD.doDaiDoanThang());
	}

}
