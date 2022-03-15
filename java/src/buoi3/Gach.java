package buoi3;

import java.util.Scanner;

public class Gach {
	private String ms, mau;
	private int sl, cNgang, cDai;
	private long gia;
	
	public Gach() {
		ms = new String();
		mau = new String();
		sl = 0;
		cNgang = 1;
		cDai = 1;
		gia = 1000; //gach ong 1000vnd
	}
	
	public Gach(Gach g) {
		ms = new String(g.ms);
		mau = new String(g.mau);
		sl = g.sl;
		cNgang = g.cNgang;
		cDai = g.cDai;
		gia = g.gia; //gach ong 1000vnd
	}
	//nhap thong tin cho 1 hop gach
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ma so hop gach ");
		ms = sc.nextLine();
		System.out.println("mau sac hop gach ");
		mau = sc.nextLine();
		System.out.println("so luong vien gach 1 hop  ");
		sl = sc.nextInt();
		System.out.println("chieu ngang hop gach ");
		cNgang = sc.nextInt();
		System.out.println("chieu dai hop gach ");
		cDai = sc.nextInt();
		System.out.println("gia thanh 1 hop gach ");
		gia = sc.nextLong();
		
	}
	//in thong tin cho 1 hop gach
	public void in() {
		System.out.println("ma so: "+ms
				+"\nmau sac: "+mau
				+"\nso luong vien trong 1 hop: "+sl
				+"\nchieu ngang vien gach (cm) : "+cNgang
				+"\nchieu dai vien gach (cm) : "+cDai
				+"\nGia thanh: "+gia);
	}
	
	public String toString() {
		return "ma so: "+ms
				+"\nmau sac: "+mau
				+"\nso luong vien trong 1 hop: "+sl
				+"\nchieu ngang vien gach (cm) : "+cNgang
				+"\nchieu dai vien gach (cm) : "+cDai
				+"\nGia thanh: "+gia;
	}
	
	public long layGia() {
		return gia;
		
	}
	public String layMaSo() {
		return ms;
		
	}
	public String layMau() {
		return mau;
		
	}
	public int laySoLuong() {
		return sl;
		
	}
	public int layChieuNgang() {
		return cNgang;
		
	}
	public int layChieuDai() {
		return cDai;
		
	}
	
	//gia ban le 1 vien gach
	public float giaBanLe() {
		return gia/sl*1.2f; 	//gia cua 1 hop chia cho so luong vien trong 1 hop  nhan voi 1.2 (tang 20%)
	}
	
	public long chiPhiMuaGach(int D, int N){
        int sHop = soHop(D,N);
        return sHop * gia;
    }
	
	public float dtToiDa() {
		return cNgang * cDai * sl;
	}
	
	public int soHop(int D, int N) {
		int svd = D / cDai;
		if(D % cDai != 0)	svd++;
		int svn = N / cNgang;
		if(N % cNgang != 0)	svn++;
		int tong = svd * svn;
		int soHop = tong / sl;
		if(tong % sl != 0)	soHop++;
		return soHop;
		
		
	}

}
