package buoi3;

import java.util.Scanner;

public class SDSinhVien {
	
	public static Scanner sc = new Scanner(System.in);	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVien a = new SinhVien();
		a.nhap();
		a.nhapHocPhan();
		a.nhapDiem();
		System.out.println(a);
	
		a.ThemHP("LTHDT", "B+");
		System.out.println("\nSinh vien sau khi them hoc Phan:");
		System.out.println(a);
	}
}
		
//		SinhVien ds[];
//		System.out.println("Nhap vao danh sach n sinh vien: ");
//		int n = sc.nextInt();
//		for(int i=0; i<n; i++){
//			System.out.println("Nhap sinh vien thu "+ (i+1)+ ": ");
//			ds[i] = new SinhVien();
//			
//		}
	