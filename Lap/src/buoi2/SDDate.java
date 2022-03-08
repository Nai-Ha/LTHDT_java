package buoi2;
import java.util.Scanner;
public class SDDate {
	public static void main(String[] agrs) {
		System.out.println("Ngay thang nam sinh cua a: ");
		Date a = new Date(3, 9, 2002);
		a.in();
		System.out.println("Ngay a in theo cach toString la: "+a);
		Date b = new Date();
		System.out.println("Nhap ngay thang nam cua b: ");
		b.nhap();
		System.out.println("Ngay thang nam cua b: ");
		b.in();

		Date c = new Date();
		Date d = new Date();
		System.out.println("Ngay thang nam sinh, hom sau cua ngay a: ");
		c = a.ngayHomSau();
		c.in();

		System.out.println("10 ngay sau cua ngay b: ");
		d = b.congNgay(10);
		d.in();

		Date ds[];
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so phan tu mang n = ");
		int n = sc.nextInt();
		ds = new Date[n];
		for (int i = 0; i < n; i++) 
			ds[i] = new Date();
		System.out.println("Nhap danh sach doi tuong: ");
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap phan tu thu " + (i+1 + ":"));
			ds[i].nhap();
		}
			
		for (int i =0; i < n; i++) {
			System.out.println("Phan tu thu " + (i+1) + ":");
			ds[i].in();
		}

		Date e = new Date();
		Date f = new Date();
		System.out.println("Nhap vao hai ngay de so sanh: ");
		e.nhap();
		e.in();
		f.nhap();
		f.in();
		if (e.compareTo(f) == 1) {
			System.out.println("Ngay " + e.layNgay() + "/" + e.layThang() + "/" + e.layNam() + " sau ngay " + f.layNgay() + "/" + f.layThang() + "/" + f.layNam() + ".");
		}
		else if(e.compareTo(f) == -1){
			System.out.println("Ngay " + e.layNgay() + "/" + e.layThang() + "/" + e.layNam() + " truoc ngay " + f.layNgay() + "/" + f.layThang() + "/" + f.layNam() + ".");
		}
		else System.out.println("Ngay " + e.layNgay() + "/" + e.layThang() + "/" + e.layNam() + " va ngay " + f.layNgay() + "/" + f.layThang() + "/" + f.layNam() + " la cung mot ngay.");
	}

}
