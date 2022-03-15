package buoi2;

import java.util.Scanner;

public class Diem {
	private int x, y;
	
	public Diem() {
		x = 0;
		y = 0;
	}
	
	public Diem(int x1, int y1) {
		x = x1;
		y = y1;
	}
	
	//ham xay dung sao chep
	public Diem(Diem a) {
		x = a.x;
		y = a.y;
	}
	
	public String toString() {
		return "("+ x + "," + y + ")";
		
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap vao toa do diem x  = ");
		x = sc.nextInt();
		System.out.print("nhap vao toa do diem y  = ");
		y = sc.nextInt();
	}
	
	public void in() {
		System.out.println("\n("+ x + "," + y + ")\n");
		
	}
	
	public void tinhtien(int dx, int dy) {
		x = x + dx;
		y = y + dy;
		
	}
	
	public int layX() {
		return x;
	}
	
	public int layY() {
		return y;
	}
	
	public float khoangCach() {
		float kq =  (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		return kq;
	}
	
	public float khoangCach(Diem d) {
		float kq =  (float) Math.sqrt(Math.pow(x - d.x, 2) + Math.pow(y - d.y, 2));
		return kq;
	}
	

}

















