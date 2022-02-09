package buoi3;

import java.util.Scanner;

import buoi2.Date;

public class SinhVien {
	
public static Scanner sc = new Scanner(System.in);	

	private String MSSV, hoTen;
	private Date ngaySinh;
	private int soLuongHPDK;
	private String tenHP[];
	private String diemHP[];
	
	public SinhVien(){
		MSSV = new String();
		hoTen = new String();
		ngaySinh = new Date();
		soLuongHPDK = 1;
		tenHP = new String[50];
		diemHP = new String[50];
	}
	
	public SinhVien(String MSSV1, String hoTen1, Date ngaySinh1, int SLHPDK1){
		MSSV = new String(MSSV1);
		hoTen = new String(hoTen1);
		ngaySinh = new Date(ngaySinh1);
		soLuongHPDK = SLHPDK1;
		tenHP = new String[50];
		diemHP = new String[50];
	}
	
	public SinhVien(SinhVien sv){
		MSSV = new String(sv.MSSV);
		hoTen = new String(sv.hoTen);
		ngaySinh = new Date(sv.ngaySinh);
		soLuongHPDK = sv.soLuongHPDK;
		tenHP = new String[50];
		diemHP = new String[50];

		for(int i=0; i<soLuongHPDK; i++){
		tenHP[i] = new String(tenHP[i]);
		diemHP[i] = new String(diemHP[i]);
		}
	}	
	
	public void nhap(){
		System.out.println("Nhap ma so sinh vien: ");
		MSSV = sc.nextLine();
		System.out.println("Nhap ho ten: ");
		hoTen = sc.nextLine();
		System.out.println("Nhap ngay thang nam sinh: ");
		ngaySinh.nhap();
	}
	
	public void nhapDiem(){
		for(int i=0; i<soLuongHPDK; i++){
			System.out.println("Nhap diem mon hoc "+ tenHP[i]);
			diemHP[i] = sc.nextLine();
		}
	}
	
	public String toString(){
		String s = MSSV+ ", " +hoTen+ ", " + ngaySinh+ ", ";
		for(int i=0; i<soLuongHPDK-1; i++){
			s += tenHP[i]+ ":" +diemHP[i]+ ", ";
		}
		s += tenHP[soLuongHPDK-1]+ ":" +diemHP[soLuongHPDK-1];
		
		return "[" +s+ "]";
	}
	
	public void nhapHocPhan(){
		System.out.println("Nhap so mon hoc: ");
		soLuongHPDK = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<soLuongHPDK; i++){
			System.out.println("Nhap mon hoc thu "+ (i+1)+ ": ");
			tenHP[i] = sc.nextLine();
		}
	}
	
	public float dtb(){
		float d=0;
		for(int i=0; i<soLuongHPDK; i++){
			if(diemHP[i].equals("A"))
				d += 4.0;
			else if(diemHP[i].equals("B+"))
				d += 3.5;
			else if(diemHP[i].equals("B"))
				d += 3.0;
			else if(diemHP[i].equals("C+"))
				d += 2.5;
			else if(diemHP[i].equals("C"))
				d += 2.0;
			else if(diemHP[i].equals("D+"))
				d += 1.5;
			else if(diemHP[i].equals("D"))
				d += 1.0;
			else d += 0;
		}
		return d/soLuongHPDK;
	}
	
	public void ThemHP(String ten, String diem){
		if(soLuongHPDK < tenHP.length +1){
			tenHP[soLuongHPDK] = new String(ten);
			diemHP[soLuongHPDK] = new String(diem);
			soLuongHPDK++;
		}
	}
	
	public void xoaHP(String ten){
		int pos=-1;
		for(int i=0; i<soLuongHPDK; i++){
			if(tenHP[i].equals(ten)){
				pos = i;
				break;
			}
		}
		if(pos != -1){
			for(int i=pos; i<soLuongHPDK; i++){
				tenHP[i] = tenHP[i+1];
				diemHP[i] = diemHP[i+1];
			}
			soLuongHPDK--;
		}
	}
	
}
		
	