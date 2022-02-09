package buoi2;

import java.util.Scanner;

public class SDPhanSo {
	public static void main(String[] agrs){
		PhanSo a = new PhanSo(3, 7);
		PhanSo b = new PhanSo(4, 10);
		a.in();
		b.in();
		//
		PhanSo x = new PhanSo();
		PhanSo y = new PhanSo();
		System.out.println("Nhap phan so x = ");
		x.nhap();
		System.out.println("Nhap phan so y = ");
		y.nhap();
		//
		PhanSo x1 = new PhanSo();
		PhanSo x2 = new PhanSo();
		//
		System.out.println("Gia tri nghich dao cua phan so x = ");
		x1 = x.giaTriNghichDao();
		x1.in();
		System.out.println("Tong phan so x, y = ");
		x2=x.cong(y);
		x2.in();
		//
		PhanSo ds[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n phan tu trong danh sach: ");
		int n = sc.nextInt();
		ds = new PhanSo[n];
		for(int i=0; i<n; i++){
			System.out.println("Nhap phan so thu "+ (i+1)+ ": ");
			ds[i] = new PhanSo();
			ds[i].nhap();
		}
		//
		PhanSo tongPhanSo = new PhanSo();
		for(int i=0; i<n; i++){
			tongPhanSo = ds[i].cong(tongPhanSo);
		}
		System.out.println("Tong n phan so trong danh sach = ");
		tongPhanSo.in();
		//
		PhanSo max = new PhanSo();
		max = ds[0];
		for(int i=1; i<n; i++){
			if(ds[i].lonHon(max)) max = ds[i];
		}
		System.out.println("Gia tri max trong danh sach = ");
		max.in();
		//
		PhanSo t = new PhanSo();
		for(int i=0; i<n-1; i++){
			for(int j=i+1; j<n; j++){
				if(ds[i].giaTriThuc() > ds[j].giaTriThuc()){
					t = ds[i];
					ds[i] = ds[j];
					ds[j] = t;
				}
			}
		}
		System.out.println("Chuoi danh sach tang dan = ");
		for(PhanSo e : ds){
			e.in();
		}
	}
}
