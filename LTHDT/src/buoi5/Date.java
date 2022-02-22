package buoi5;

import java.util.Scanner;

public class Date {
	private int d,m,y;
	public Date() {
		d = 1;
		m = 1;
		y = 2021;
	}
	public Date(int d1, int m1, int y1) {
		d = d1;
		m = m1;
		y = y1;
	}
	public Date(Date a) {
		d = a.d;
		m = a.m;
		y = a.y;
	}
	public void in() {
		System.out.println(d + "/" + m + "/"+ y);
	}
	public String toString() {
		return (d + "/" + m + "/"+ y);
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("\nNhap ngay: ");
			d = sc.nextInt();
			System.out.print("\nNhap thang: ");
			m = sc.nextInt();
			System.out.print("\nNhap nam: ");
			y = sc.nextInt();
			if(!hopLe())
					System.out.println("khong hop le xin nhap lai: ");
		}while(!hopLe());
		
	}
	public boolean hopLe() {
		boolean h = false;
		int max[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if( y%4 == 0 ) max[2] = 29;
		if( d>0 && m>0 && y>0 && d <= max[m] && m<13 )
			h = true;
		return h;
	}
	public Date ngayHomSau() {
		Date kq = new Date(d,m,y);
		kq.d++;
		if(!kq.hopLe()) {
			kq.d = 1;
			kq.m++;
		}	
			if(!kq.hopLe()) {
				kq.m = 1;
				kq.y++;
		}
		return kq;
	}
	public Date congNgay(int n) {
		Date kq = new  Date(d,m,y);
		for(int i=0;i<n;i++)
			kq = kq.ngayHomSau();
		return kq;
	}
	

}
