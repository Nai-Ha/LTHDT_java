package buoi4;

import java.util.Scanner;

import buoi2.Diem;

public class DiemMau extends Diem{
	
	public static Scanner sc = new Scanner(System.in);
	
	private String mau;
	
	public DiemMau(){
		super();
		mau = new String();
	}
	
	public DiemMau(int x1, int y1, String mau1){
		super(x1, y1);
		mau = new String(mau1);
	}
	
	public DiemMau(DiemMau dm){
		super((Diem) dm);
		mau = new String(dm.mau);
	}
	
	public String toString(){
		return super.toString() + ", in mau: " + mau;
	}
	
	public void ganMau(String mau1){
		mau = new String(mau1);
	}
	
	public void nhap(){
		super.nhap();
		System.out.println("Nhap vao mau: ");
		mau = sc.nextLine();
		//sc.nextLine();
	}
	
	public void in(){
		super.in();
		System.out.println("in mau " + mau);
	}
	
}

