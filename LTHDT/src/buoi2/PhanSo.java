package buoi2;

import java.util.Scanner;

public class PhanSo {
	
	private int ts, ms;
	
	public PhanSo(){
		ts = 1;
		ms = 1;
	}
	
	public PhanSo(int tu, int mau){
		ts = tu;
		ms = mau;
	}

	public PhanSo(PhanSo a){
		ts = a.ts;
		ms = a.ms;
	}
	
	public String toString(){
		return ts+"/"+ms;
	}
	
	public void nhap(){
		Scanner sc = new Scanner(System.in);
		do{
			ts = sc.nextInt();
			ms = sc.nextInt();
		}while(ms == 0);
	}
	
	public void in(){
		if(ts == 0) System.out.println(0);
		else if(ms ==1) System.out.println(ts);
		else{
			System.out.println(ts +"/" +ms);
		}
	}
	
	public int layTS(){
		return ts;
	}
	
	public int layMS(){
		return ms;
	}
	
	public void nghichDao(){
		int t = ts;
		ts = ms;
		ms = t;
	}
	
	public PhanSo giaTriNghichDao(){
		PhanSo a = new PhanSo(ts, ms);
		int t = a.ts;
		a.ts = a.ms;
		a.ms = t;
		return a;
	}
	
	public float giaTriThuc(){
		return ts/ms;
	}
	
	public boolean lonHon(PhanSo a){
		if((float)ts/ms > (float)a.ts/a.ms) return true;
		return false;
	}
	
	public PhanSo cong(PhanSo a){
		PhanSo kq = new PhanSo(ts, ms);
		
		kq.ts = ts * a.ms + a.ts * ms;
		kq.ms = ms * a.ms;
		return kq;
	}
	
	public PhanSo tru(PhanSo a){
		PhanSo kq = new PhanSo(ts, ms);
		
		kq.ts = ts * a.ms - a.ts * ms;
		kq.ms = ms * a.ms;
		return kq;
	}
	
	public PhanSo nhan(PhanSo a){
		PhanSo kq = new PhanSo(ts, ms);
		
		kq.ts = ts * a.ts;
		kq.ms = ms * a.ms;
		return kq;
	}
	
	public PhanSo chia(PhanSo a){
		PhanSo kq = new PhanSo(ts, ms);
		kq.ts = ts * a.ms;
		kq.ms = ms * a.ts;
		return kq;
	}
	
}
