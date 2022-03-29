package buoi4;

import java.util.Scanner;

import buoi3.SinhVien;

	public class SinhVienCNTT extends SinhVien{
		
		public  Scanner sc = new Scanner(System.in);
		
		private String taikhoan, matkhau, email;
		
		public SinhVienCNTT(){
			super();
			taikhoan = new String();
			matkhau = new String();
			email = new String();
		}
		
		public SinhVienCNTT (SinhVienCNTT s){
			super((SinhVien) s);
			taikhoan = new String(s.taikhoan);
			matkhau = new String(s.matkhau);
			email = new String(s.email);
		}
		
		public String toString(){
			return super.toString() + "|" + taikhoan + "|"
			+ email;		
		}
		
		public void nhap(){
			super.nhap();
			System.out.println("Nhap tai khoan elcit: ");
			taikhoan = sc.nextLine();
			System.out.println("Nhap mat khau elcit: ");
			matkhau = sc.nextLine();
			System.out.println("Nhap email: ");
			email = sc.nextLine();
		}
		
		public void in(){
			super.in();
			System.out.println("|" + taikhoan + "|" + email);
		}
		
		public void doimatKhau(String newpass){
			matkhau = new String(newpass);
		}
		
		public String layEmail(){
			return email;
		}
		
		public String layUser(){
			return taikhoan;
		}
	}

