package buoi3;

import java.util.Scanner;

import buoi2.Date;

public class Students {
	private String id, hTen;
	private Date ngaySinh;
	private int n; 	//so luong hp
	private String tenHP[], diemHP[];

	public Students() {
		id = new String();
		hTen = new String();
		ngaySinh = new Date();
		n = 0;
		tenHP = new String[55];
		diemHP = new String[55];

	}

	public Students(Students s) {
		id = new String(s.id);
		hTen = new String(s.hTen);
		ngaySinh = new Date(s.ngaySinh);
		n = s.n;
		tenHP = new String[s.tenHP.length];
		diemHP = new String[s.diemHP.length];

		for (int i=0; i<n; i++) {
			tenHP[i] = new String(s.tenHP[i]);
			diemHP[i] = new String(s.diemHP[i]);

		}

	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap vao id sinh vien: ");
		id = sc.nextLine();
		System.out.print("nhap vao ho va ten sinh vien: ");
		hTen = sc.nextLine();
		System.out.println("nhap vao ngay , thang, nam sinh cua sinh vien: ");
		ngaySinh.nhap(); //ham nhap cua lop Date buoi 2
		System.out.print("nhap vao so luong mon hoc cua sinh vien: ");
		n = sc.nextInt();

		sc.nextLine(); //bo ky tu Enter de nhap chuoi mang
		for (int i=0; i<n; i++) {
			System.out.println("Nhap vao ten hoc phan "+ (i+1) +" :");
			tenHP[i] = sc.nextLine();
			System.out.println("Nhap vao diem hoc phan :" + tenHP[i]);
			diemHP[i] = sc.nextLine();
		}

	}

	public void in() {
		System.out.println("Thong tin cua Sinh vien sau khi nhap la :");
		System.out.println("[" + id + "," + hTen + "," + ngaySinh + "]");
		for (int i=0; i<n; i++)
			System.out.println(tenHP[i] + ": " + diemHP[i]);

	}

	public String toString() {

		String s = ("[" + id + "," + hTen + "," + ngaySinh + "]");
		for (int i=0; i<n; i++)
			s = s + (" " + tenHP[i] + ": " + diemHP[i]);
		return s;

	}
	public String layHoTen() {
		return hTen;
		
	}
	public Date layNgaySinh() {
		return ngaySinh;
		
	}

	public String layTen() {
		String ten = hTen.trim();
		int k = hTen.lastIndexOf(" ");
		return hTen.substring(k+1);

		//		hTen = hTen.trim();
		//		int k = hTen.lastIndexOf(" ");
		//		String ten = hTen.substring(k+1);
		//		return ten;
	}

	public float dtb() {
		float d = 0.0f;
		for( int i=0; i<n; i++) {
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

			else
				d += 0;
		}
		return d/n;
	}

	public void themHP(String ten, String diem) {

		if(n < (tenHP.length-1)) {
			tenHP[n] = new String (ten);
			diemHP[n] = new String (diem);
			n++;
		}

		else
			System.out.println("Mang day! bao loi!");

	}

	public void xoaHP(String ten) {
		int i = 0;	//xac dinh vi tri can xoa
		for ( i=0; i<n; i++) {
			if(tenHP[i].equals(ten)) {
				break;
			}
		}
		if(i < n) { //xoa mon hoc o vi tri i
			for( int j=i; j<n-1; j++) {
				tenHP[j] = tenHP[j+1];
				diemHP[j] = diemHP[j+1];
			}
			n--;
		}
	}


}
