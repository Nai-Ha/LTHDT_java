package buoi4;

import java.util.Scanner;

import buoi3.SinhVien;

public class SDSVCNTT {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVien d;
		d = new SinhVien();
		d.nhap(); // ham nhap() cua lop Sinh Vien
		d.in(); //ham in() cua lop Sinh Vien
		
		System.out.println("Sinh vien cntt");
		d = new SinhVienCNTT();
		d.nhap(); //ham nhap() lop SVCNTT
		d.in();  //ham in() lop SVCNTT
		
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Nhap n so sinh vien: ");
		int n = sc.nextInt();
		SinhVien ds[] = new SinhVien[n];
		int c = 0;
		for(int i=0; i<n; i++){
			ds[i] = new SinhVienCNTT();
			System.out.println("\nSinh vien thu " + (i+1) + ": ");
			System.out.print("nhap Sinh Vien(0), SVCNTT(1): ");
			
			c = sc.nextInt();
			if(c==0) ds[i] = new SinhVien();
			else ds[i] = new SinhVienCNTT(); 
				ds[i].nhap();
			
		}
		for (SinhVien d1: ds) {
			d1.in();
		}
			
		System.out.println("Nhap email de tim kiem va hien thi thong tin : ");
		Scanner sc1 = new Scanner(System.in);
		String email = sc1.nextLine();
		for(SinhVien s: ds){
			if(s.layEmail().equals(email)){
				System.out.println("User: "+s.layUser());
				break;
			}
		}
		
	}

}
