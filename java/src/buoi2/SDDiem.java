package buoi2;

import java.util.Scanner;

public class SDDiem {
	public static void main(String[] args) {
		Diem a = new Diem(3, 4);
		a.in();
		System.out.println(" in a theo kieu toString la "+ a); //a.toString
		Diem b = new Diem();
		b.nhap();
		b.in();
		
		// tao diem c doi xung voi diem b qua goc toa do O
		Diem c  = new Diem(-b.layX(), -b.layY());
		c.in();
		
		System.out.println(" Khoang cach tu B den tam O la " + b.khoangCach() );
		System.out.println(" Khoang cach tu A den B la " + a.khoangCach(b) );
		
		//mang doi tuong
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao n so luong phan tu cua mang");
		int n = sc.nextInt();
		do {
			if(n<0) {
				System.out.println("Nhap sai! moi nhap lai n cua mang!");
			}
		}while(n<0);
		//cap phat bo nho cho mang
		Diem ds[] = new Diem [n];
		for( int i=0; i<n; i++) {
			ds[i] = new Diem();
			System.out.println("Nhap vao phan tu thu "+(i+1)+ ":");
			ds[i].nhap();
		}
		System.out.println("Danh sach diem ");
		for( int i=0; i<n; i++) {
			System.out.println(" phan tu thu "+(i+1)+ ":");
			ds[i].in();
		}
		
	}

}
