package buoi3;
import java.util.Scanner;

import buoi2.Diem;
public class SDDThang {
	public static void main(String[] args) {
		Diem A = new Diem(2, 5);
		A.in();
		Diem B = new Diem(20, 35);
		B.in();
		DThang AB = new DThang(A, B);
		System.out.println("Doan thang AB vua nhap la" + AB);
		AB.tinhTien(5, 3);
		System.out.println("Doan thang AB sau khi doi tinh tien mot doan la " +AB);

		
		DThang CD = new DThang();
		CD.nhap();
		System.out.println("Doan thang CD vua nhap la" + CD);
		
		System.out.println(" Do dai Doan thang CD la " + CD.doDaiDThang()
);
		System.out.println("trung diem cua CD :");
		CD.trungDiem().in();
		System.out.println("Trung diem CD " + CD.trungDiem());
		
		DThang d1 = new DThang(CD);
		d1.in();
		DThang d2 = d1;
		d2.in();
		
		
	}

}
