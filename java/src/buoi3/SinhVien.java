package buoi3;

import java.util.Scanner;

import buoi2.Date;

public class SinhVien {

	private String ms, hoTen;
	private Date ngaySinh;
	private int n; // soLuongHPDK
	private String tenHP[];
	private String diemHP[];

	public SinhVien(){
		ms = new String();
		hoTen = new String();
		ngaySinh = new Date();
		n = 0;
		tenHP = new String[50];
		diemHP = new String[50];
	}

	public SinhVien(SinhVien sv){
		ms = new String(sv.ms);
		hoTen = new String(sv.hoTen);
		ngaySinh = new Date(sv.ngaySinh);
		n = sv.n;
		tenHP = new String[sv.tenHP.length];
		diemHP = new String[sv.diemHP.length];

		for(int i=0; i<n; i++){
			tenHP[i] = new String(sv.tenHP[i]);
			diemHP[i] = new String(sv.diemHP[i]);
		}
	}

	public void nhap(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap mssv : ");
		ms = sc.nextLine();
		System.out.print("Nhap ho ten: ");
		hoTen = sc.nextLine();
		System.out.print("Nhap ngay, thang, nam sinh: ");
		ngaySinh.nhap();	// ham nhap lop Date
		System.out.print("Nhap so Mon Hoc ");
		n = sc.nextInt();

		sc.nextLine(); 	// bo qua de nhap chuoi
		for (int i=0; i<n; i++){
			System.out.println(" Nhap mon hoc thu " + (i+1) + ": ");
			tenHP[i] = sc.nextLine();
			System.out.println(" Nhap diem mon hoc " + tenHP[i] + ": ");
			diemHP[i] = sc.nextLine();

		}

	}

	public void in(){
		System.out.println("Thong tin sinh vien sau khi nhhap la :");
		System.out.println("[" + ms + "," + ngaySinh + "]");
		for(int i=0; i<n; i++)
			System.out.println(tenHP[i] + ":" + diemHP[i]+" ");
	}

	public String toString(){
		String s = ms + "," + hoTen + "," + ngaySinh + ", " ;
		for(int i=0; i<n; i++){
			s = s+ (tenHP[i] + ":" + diemHP[i]+" ");
		}
		return "[" + s + "]";
	}


	// ham tach ten
	public String layTen(){
		hoTen = hoTen.trim();
		int k = hoTen.lastIndexOf(" ");
		String ten = hoTen.substring(k+1);
		return ten;
	}


	public String layHoTen() {
		return hoTen;
	}

	public float dtb(){
		float d= 0.0f;
		for (int i=0; i<n; i++){
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
		return d/n;
	}

	public void ThemHP(String ten, String d){
		if(n < (tenHP.length - 1) ){
			tenHP[n] = new String(ten);
			diemHP[n] = new String(d);
			n++;
		}
		else 
			System.out.println("Loi! mang day! ");
	}

	public void xoaHP(String ten){	
		int i = 0;	// khai bao o ngoai xac dinh vi tri i can xoa
		for( i=0; i<n; i++){
			if(tenHP[i].equals(ten)){
				break;
			} 	
		}
		if( i < n){	// xoa mon hoc o vi tri i
			for(int j=i; j<n-1; j++){
				tenHP[j] = tenHP[j+1];
				diemHP[j] = diemHP[j+1];
			}
			n--;
		}
	}


	public Date layngSinh() {
		return ngaySinh;
	}




}
