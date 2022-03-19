package buoi3;

import java.util.Scanner;

public class UseStudents {
	public static void main(String[] args) {
		Students a = new Students();
		a.nhap();
		System.out.println("chuoi sau khi tach ten la: "+a.layTen());
		System.out.println("in theo kieu toString la :"+a);
		a.in();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap danh sach n so luong sinh vien: ");
		int n = sc.nextInt();
		Students ds[] = new Students[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("nhap vao danh sach sinh vien thu "+(i+1)+": ");
			ds[i] = new Students();
			ds[i].nhap();
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(" danh sach sinh vien thu "+(i+1)+": ");
			System.out.println("chuoi sau khi tach ten la: "+ds[i].layTen());
			ds[i].in();
		}
		
//sinh vien bi canh bao hoc vu
		for(int i=0; i<n; i++) {
			if(ds[i].dtb() < 1)
				System.out.println("danh sach sinh vien bi canh bao hoc vu: "+ds[i]);
		}
//sinh vien co GPA lon nhat
		System.out.println("Sinh vien co diem trung binh lon nhat la: ");
		Double max = Double.MIN_VALUE;
		for(int i=0; i<n; i++) {
			if(ds[i].dtb() > max)
				max = (double) ds[i].dtb();
		}
		for (int i=0; i<n; i++) {
			if(ds[i].dtb() == max )
				System.out.println(ds[i].layHoTen());
		}
//sap xep noi bot BubbleSort
		System.out.println("Danh sach sinh vien sap xep theo Alphabet cua ten la: ");
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++)
				if(ds[i].layTen().compareTo(ds[i].layTen()) > 0 ) {
					Students t = ds[i];
					ds[i] = ds[j];
					ds[j] = t;
				}
					
		}
		for (Students sv : ds)
			sv.in();
		// System.out.println(sv);
		
	}

}
