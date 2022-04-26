

// HO VA TEN: VO THANH EM  
//MSSV: B2012081  
//DE THI SO: 04/26

import java.util.Scanner;
public class Date2 {
	private int dd, mm, yy;

	Date2(){
		dd=26;
		mm=04;
		yy=2022;
	}

	Date2(int d1, int m1, int y1){
		dd=d1;
		mm=m1;
		yy=y1;
	}

	Date2(Date2 a){
		dd=a.dd;
		mm=a.mm;
		yy=a.yy;
	}

	public boolean hopLe() {
		int max[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if( yy % 4 == 0)	max[2] = 29;
		if( dd>0 && mm>0 && dd <= max[mm] && mm <= 12)
			return true;
		return false;
	}

	public void nhap() {
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print(" nhap ngay: ");
			dd=sc.nextInt();
			System.out.print(" nhap thang: ");
			mm=sc.nextInt();
			System.out.print(" nhap nam: ");
			yy=sc.nextInt();
			if(!hopLe())
				System.out.println(" Loi nhap! moi nhap lai");
		}while(!hopLe());
	}

	public void in() {
		System.out.println(dd + "/" + mm + "/" + yy);
	}

	public String toString() {
		return(dd + "/" + mm + "/" + yy);
	}

	public Date2 ngayHomSau() {
		Date2 d = new Date2(dd,mm,yy);
		d.dd++;
		if(!d.hopLe()) {
			d.dd=1;
			d.mm++;
		}
		if(!d.hopLe()) {
			d.mm=1;
			d.yy++;
		}
		return d;
	}

	public Date2 congNgay(int n) {
		Date2 c = new Date2(dd,mm,yy);
		for(int i=0; i<n; i++) {
			c=c.ngayHomSau();
		}
		return c;

	}

	public static void main(String[] args) {
		Date2 A = new Date2(28,04,2022);
		A.in();
		Date2 C = new Date2();
		System.out.println("Ngay hom sau cua A la:");
		C=A.ngayHomSau();
		C.in();
		System.out.println("In A theo kieu to String :"+ A);
		
		System.out.println("\nNhap vao mot ngay moi:");
		Date2 B = new Date2();
		B.nhap();
		B.in();
		
		System.out.println("Ngay Thi ");
		B = B.congNgay(18);
		B.in();
		
		// tao mang doi tuong
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so luong n phan tu: ");
		int n = sc.nextInt();
		Date2 ds[] = new Date2 [n];
		
		for(int i=0;  i<n; i++) {
			System.out.println("Nhap phan tu thu: "+ (i+1) + ": ");
			ds[i] = new Date2();
			ds[i].nhap();
		}
		
		System.out.println("Thong tin mang");
		for(int i=0;  i<n; i++) {
			System.out.println("phan tu thu: "+ (i+1) + ": ");
			ds[i].in();
		}

	}

}
