package buoi3;

import java.util.Scanner;

public class SDSinhVien {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SinhVien a = new SinhVien();
		a.nhap();
		System.out.println("chuoi ho va ten sau khi nhap: "+a.layHoTen());
		System.out.println("chuoi ho va ten sau khi tach ten: "+a.layTen());
		System.out.println("in theo kieu toString: "+a);
		a.in();
		
		System.out.println("Nhap danh sach Sinh Vien: ");
		int n = sc.nextInt();
		SinhVien ds[] = new SinhVien[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("nhap vao sinh vien thu "+(i+1)+": ");
			ds[i] = new SinhVien();
			ds[i].nhap();
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(" sinh vien thu "+(i+1)+": ");
			System.out.println("chuoi ho va ten sau khi tach ten: "+ds[i].layTen());
			ds[i].in();
		}
		
		for(int i=0; i<n; i++) {
			if(ds[i].dtb()<1)
				System.out.println(" Danh sach Sinh vien bi canh bao hoc vu la: "+ds[i]);
		}
		
		System.out.println("Sinh vien co GPA lon nhat la: ");
		Double max = Double.MIN_VALUE;
		for(int i=0; i<n; i++) {
			if(ds[i].dtb()> max)
				max = (double) ds[i].dtb();
		}
		
		for(int i=0; i<n; i++) {
			if(ds[i].dtb()== max)
			System.out.println(ds[i].layTen());
		}
		
		System.out.println("Danh sach sinh vien duoc sap xep the Alphabet cuaten la:  ");
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++)
				if(ds[i].layTen().compareTo(ds[i].layTen()) > 0) {
					SinhVien t = ds[i];
					ds[i] = ds[j];
					ds[j] = t;
				}
		}
		
		for (SinhVien sv:ds)
			sv.in();
		//System.out.println(sv);
	}

}











