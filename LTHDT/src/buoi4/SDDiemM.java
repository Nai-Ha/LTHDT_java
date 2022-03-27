package buoi4;

import java.util.Scanner;

import buoi2.Diem;

public class SDDiemM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diem a =new Diem();
		a.nhap();
		a.in();
		
		
		DiemM A = new DiemM(5, 10, "trang");
		System.out.println("Diem A co toa do: ");
		A.in();
		// A.ganMau("xanh") sai vi lop con  khong tham chieu lop cha (Diem) va khong bi nap de
		
		DiemM B = new DiemM();
		System.out.println("Nhap vao diem B: \n");
		B.nhap();
		System.out.println("Diem B co toa do: \n");
		B.in();
		B.tinhTien(10, 8);
		System.out.println("Diem B sau khi tinh tien: \n");
		B.in();
		System.out.println("Diem B sau khi duoc gan lai mau vang: \n");
		B.ganMau("vang");
		B.in();
	}

}


