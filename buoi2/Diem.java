package buoi2;
import java.util.Scanner;
public class Diem {
private int x, y;
	
	public Diem(){
		x = 0;
		y = 0;
	}
	
	public Diem(int x1,int y1){
		x = x1;
		y = y1;
	}

	public Diem(Diem a){
		x = a.x;
		y = a.y;
	}

	public String toString(){
		return "("+x+", "+y+")";
	}
	
	public void nhap(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao diem x: ");
		x = sc.nextInt();
		System.out.println("Nhap vao diem y: ");
		y = sc.nextInt();
	}
	
	public void in(){
		System.out.println("("+ x +", "+ y +")");
	}
	
//	public void doiDiem(int dx, int dy){
//		x += dx;
//		y += dy;
//	}
	
	public int giaTriX()
	{
		return x;
	}
	public int giaTriY(){
		return y;
	}
	
	public float khoangCach(){
		float kq = (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		return kq;
	}
	
	public float khoangCach(Diem d){
		float kq = (float) Math.sqrt(Math.pow(x-d.x, 2) + Math.pow(y - d.y, 2));
		return kq;
	}
	
	public void tinhTien(int dx, int dy){
		x += dx;
		y += dy;
	}

}
