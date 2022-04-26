

// HO VA TEN: VO THANH EM  
//MSSV: B2012081  
//DE THI SO: 04/26

import java.util.Scanner;

public class PhanSo2 {
	private int ts, ms;
	PhanSo2(){
		ts=1;
		ms=1;
	}

	PhanSo2(int tu, int mau){
		ts=tu;
		ms=mau;
	}

	PhanSo2(PhanSo2 a){
		ts=a.ts;
		ms=a.ms;
	}

	public void nhap() {
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("nhap TS = ");
			ts=sc.nextInt();
			System.out.println("nhap MS = ");
			ms=sc.nextInt();
			if(ms==0)
				System.out.println("yeu cau nhap lai! ms phai khac 0");
		}while(ms==0);

	}

	public void in() {
		if(ts==0) System.out.println(0);
		else if(ms==1) System.out.println(ts);
		else{
			System.out.println(ts + "/" +ms);
		}
	}

	public String toString() {
		return(ts + "/" +ms);
	}

	public void nghichDao() {
		int t = ts;
		ts=ms;
		ms=t;
	}

	public PhanSo2 giaTriNghichDao() {
		PhanSo2 a = new PhanSo2 (ts,ms);
		int t = a.ts;
		a.ts = a.ms;
		a.ms = t;
		return a;
	}

	public float giaTriThuc() {
		return ts/ms;
	}

	public boolean lonHon(PhanSo2 a) {
		if( (float)ts/ms > (float)a.ts/a.ms)	return true;
		return false;
	}

	public PhanSo2 cong(PhanSo2 a) {
		PhanSo2 kq = new PhanSo2(ts,ms);
		kq.ts= ts*a.ms+a.ts*ms;
		kq.ms= ms*a.ms;
		return kq;
	}

	public PhanSo2 tru(PhanSo2 a) {
		PhanSo2 kq = new PhanSo2(ts,ms);
		kq.ts= ts*a.ms-a.ts*ms;
		kq.ms= ms*a.ms;
		return kq;
	}

	public PhanSo2 nhan(PhanSo2 a) {
		PhanSo2 kq = new PhanSo2(ts,ms);
		kq.ts= ts*a.ts;
		kq.ms= ms*a.ms;
		return kq;
	}

	public PhanSo2 chia(PhanSo2 a) {
		PhanSo2 kq = new PhanSo2(ts,ms);
		kq.ts= ts*a.ms;
		kq.ms= ms*a.ts;
		return kq;
	}

	/*	than ham */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhanSo2 A = new PhanSo2(3,7);
		PhanSo2 B = new PhanSo2(4,9);
		System.out.println("Phan So A");
		A.in();
		System.out.println("Phan So B");
		B.in();

		PhanSo2 x = new PhanSo2();
		System.out.println("nhap vao phan so x");
		x.nhap();
		System.out.println("nhap vao phan so y");
		PhanSo2 y = new PhanSo2();
		y.nhap();

		PhanSo2 x1 = new PhanSo2();
		System.out.println("Gia tri nghich dao cua x");
		x1=x.giaTriNghichDao();
		x1.in();

		PhanSo2 x2 = new PhanSo2();
		System.out.println("tong 2 phan so x + y la");
		x2 = x.cong(y);
		x2.in();

		//mang doi tuong 
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao so luong n phan tu ");
		int n = sc.nextInt();
		PhanSo2 ds[]= new PhanSo2[n];
		for (int i=0; i<n; i++) {
			System.out.println("Nhap vao phan tu thu : "+ (i+1) + ": ");
			ds[i] = new PhanSo2();
			ds[i].nhap();
		}

		PhanSo2 SumPS = new PhanSo2();
		for(int i=0; i<n; i++) {
			SumPS = ds[i].cong(SumPS);
		}
			
		System.out.println("Tong cua %d phan so la:"+n);
		SumPS.in();

		PhanSo2 max = new PhanSo2();
		ds[0]=max;
		for(int i=1; i<n; i++) {
			if( ds[i].lonHon(max) ) max = ds[i];
		}
			
		System.out.println("Gia tri max danh sach la: ");
		max.in();

		PhanSo2 t = new PhanSo2();
		for(int i=0; i<=n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(ds[i].giaTriThuc() > ds[j].giaTriThuc()) {
					t = ds[i] ;
					ds[i]=ds[j];
					ds[j]=t;
				}	
			}
		}
		
		System.out.print("Danh sach tang dan la: \n");
		for (int i=0; i<n; i++) {
			ds[i].in();
		}

	}

}
