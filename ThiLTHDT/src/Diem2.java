
// HO VA TEN: VO THANH EM  
//MSSV: B2012081  
//DE THI SO: 04/26

import java.util.Scanner;

public class Diem2 {
	private int x,y;
	
	Diem2(){
		x=0;
		y=0;
	}
	
	Diem2(int x1, int y1){
		x=x1;
		y=y1;
	}
	
	public Diem2(Diem2 a) {
		x = a.x;
		y = a.y;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap toa do  x = ");
		x = sc.nextInt();
		System.out.print("Nhap toa do y = ");
		y = sc.nextInt();
	}
	
	public void in() {
		System.out.println("(" + x + "," + y + ")");
	}
	
	public String toString() {
		return ("(" + x + "," + y + ")");
	}
	
	public void tinhTien(int dx, int dy) {
		x = x+dx;
		y = y+dy;
	}
	
	public int layX() {
		
		return x;
	}
	
	public int layY() {
		
		return x;
	}
	
	//khoan cach tu diem den goc toa do O(0,0)
	public float khoangCach() {
		return (float) (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
	}

	//khoan cach tu diem den 1 diem khac
	public float khoangCach(Diem2 B) {
		return (float) (Math.sqrt(Math.pow(x-B.x, 2) + Math.pow(y-B.y, 2)));
	}
	
	public static void main(String[] args) {

		Diem2 A = new Diem2(3,4);
		A.in();
		System.out.println("in A theo kieu to String la: "+ A.toString());//trong java no chi can ghi A laf hieu A.toString();
		
		System.out.println("\nNhap toa do cua diem B");
		Diem2 B = new Diem2();
		B.nhap();
		B.in();
		
		
		//Diem c doi xung voi B 
		System.out.println("diem C doi xung voi diem B ");
		Diem2 C = new Diem2(-B.x, -B.y); // cung lop neu khac lop thi su dung ham layX(); layY();
		C.in();
		
		System.out.println("Khoang cach tu BO la:"+ B.khoangCach());
		System.out.println("Khoang cach tu AB la:"+ A.khoangCach(B));
		
		// tao mang doi tuong diem nhap vao
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so luong n phan tu mang:");
		int n = sc.nextInt();
		Diem2 ds[] = new Diem2[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("nhap vao phan tu thu: " + (i+1) + ": ");
			ds[i] = new Diem2();
			ds[i].nhap();
		}
		
		System.out.println("Thong tin mang vua nhap");
		for(int i=0; i<n; i++) {
			System.out.println(" phan tu thu: " + (i+1) + ": ");
			ds[i].in();
			
			//for( Diem2 e:ds)
				// s.o.p(e + " ");
		}

	}

}
