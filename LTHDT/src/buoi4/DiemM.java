package buoi4;

import java.util.Scanner;

import buoi2.Diem;

public class DiemM extends Diem{
	
	private String mau;
	
	public DiemM(){
		super();
		// x=y=0 sai vi pham tinh bao goi
		mau = new String();
	}
	
	public DiemM(int x1, int y1, String mau1){
		super(x1, y1);
		mau = new String(mau1);
	}
	
	public DiemM(DiemM dm){
		super((Diem) dm); //java tu dong ep kieu
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
		Scanner sc =new Scanner(System.in);
		System.out.println("Nhap vao mau: ");
		mau = sc.nextLine();
		//sc.nextLine();
	}
	
	public void in(){
		super.in();
		System.out.println("in mau " + mau);
	}
	
}


