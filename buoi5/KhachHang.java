package buoi5;

import java.util.Scanner;

public class KhachHang {
	private String cmnd, hten, dchi;
	
	public KhachHang() {
		cmnd = new String(); 
		hten = new String(); 
		dchi = new String(); 
	}
	
	public KhachHang(String cmnd1, String hten1, String dchi1) {
		cmnd = new String(cmnd1); 
		hten = new String(hten1); 
		dchi = new String(dchi1); 
	}
	
	public KhachHang(KhachHang a) {
		cmnd = new String(a.cmnd); 
		hten = new String(a.hten); 
		dchi = new String(a.dchi); 
	}
	
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so cmnd: ");
		cmnd = sc.nextLine();
		System.out.print("Nhap so ho ten: ");
		hten = sc.nextLine();
		System.out.print("Nhap so dia chi: ");
		dchi = sc.nextLine();
		
	}
	
	public void in() {
		System.out.println("[" + cmnd + "," + hten + "," + dchi + "]");
		
	}
	
	public String toString() {
		return ("[" + cmnd + "," + hten + "," + dchi +"]");
		
	}
	
	public float laytle() {
		return 0;
	}
	

}
