package buoi3;

import java.util.Scanner;

public class SDSinhVien {
	
	 	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVien s = new SinhVien();
		s.nhap();
		s.layTen();
		
		System.out.println("Thong tin sinh vien " + s);	//in kieu toString
		
		//mang ds doi tuong
		
		SinhVien ds[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao danh sach so luong sinh vien: ");
		int n = sc.nextInt();
		ds = new SinhVien[n]; // khai bao truc tiep va gan SinhVien ds[] = new SinhVien[n]
		for(int i=0; i<n; i++){
			System.out.println("Nhap sinh vien thu "+ (i+1)+ ": ");
			ds[i] = new SinhVien();
			ds[i].nhap();
		}
		for(int i=0; i<n; i++)
			ds[i].in();
		
		System.out.println("Sinh vien bi canh bao hoc vu");
		for (int i=0; i<n; i++)
			if(ds[i].dtb() < 1)
				System.out.println(ds[i]);
		System.out.println("Danh sach sinh vien duoc sap xep");
		for (int i=0; i<n-1; i++)
			for( int j=i+1; j<n; j++)
				if( ds[i].layTen().compareTo(ds[i].layTen()) > 0) {
					SinhVien t = ds[i];
					ds[i] = ds[j];
					ds[j] = t;
				}
		for( SinhVien sv : ds)
			System.out.println(sv);
		
	}
}
		
		
	