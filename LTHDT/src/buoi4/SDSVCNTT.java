package buoi4;

import java.util.Scanner;

public class SDSVCNTT {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SinhVienCNTT [] danhSachSV;
		System.out.println("Nhap n sinh vien CNTT: ");
		int n = sc.nextInt();
		danhSachSV = new SinhVienCNTT[n];
		for(int i=0; i<n; i++){
			danhSachSV[i] = new SinhVienCNTT();
			System.out.println("\nSinh vien CNTT thu " + (i+1) + ": ");
			danhSachSV[i].nhap();
		}
		
		System.out.println("Nhap email de tim kiem va hien thi thong tin SVCNTT: ");
		Scanner sc1 = new Scanner(System.in);
		String diaChiEmail = sc1.nextLine();
		for(int i=0; i<n; i++){
			if(diaChiEmail.compareTo(danhSachSV[i].getEmail()) == 0){
				System.out.println(danhSachSV[i]);
				break;
			}
		}
		
	}

}
