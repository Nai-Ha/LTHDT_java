package buoi5;

import java.util.Scanner;

public class Date5 {
	private int d,m,y;

	public Date5() {
		d=1;
		m=1;
		y=2022;
	}

	public Date5(int d1, int m1, int y1) {
		d=d1;
		m=m1;
		y=y1;
	}

	public Date5(Date5 a) {
		d=a.d;
		m=a.m;
		y=a.y;
	}

	public boolean hopLe() {
		int max[]= { 0,31,28,31,30,31,30,31,31,30,31,30,31 };
		if( y % 4 == 0) max[2]=29;
		if( d>0 && m>0 && d <= max[m] && m <= 12 )
			return true;
		return false;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Nhap ngay: ");
			d=sc.nextInt();
			System.out.print("Nhap thang: ");
			m=sc.nextInt();
			System.out.print("Nhap nam: ");
			y=sc.nextInt();
			if(!hopLe())
				System.out.println("!nhap sai, moi nhap lai!");
		}while(!hopLe());

	}

	public void in() {
		System.out.println(d + "/" + m + "/" + y);
	}

	public String toString() {
		return (d + "/" + m + "/" + y);
	}

	public Date5 ngayHomSau() {
		Date5 day = new Date5(d,m,y);
		day.d++ ;
		if(!day.hopLe()) {
			day.d=1;
			day.m++;
		}
		if(!day.hopLe()) {
			day.m=1;
			day.y++;
		}
		return day;
	}
	
	public Date5 congNgay(int n) {
		Date5 day = new Date5(d,m,y);
		for(int i=0; i<n; i++)
			day=day.ngayHomSau();
		return day;
		
	}


}
