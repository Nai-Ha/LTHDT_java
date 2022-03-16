package buoi3;
import java.util.Scanner;
public class SDSinhVien {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVien a = new SinhVien();
		a.nhap();
		System.out.println("chuoi ho ten la "+ a.layHoTen());
		a.layHoTen();
		System.out.println("chuoi ten la "+ a.layTen());
		a.layTen();
		//a.ThemHP(ten, d);
		System.out.println("Thong tin sinh vien " + a);	//in kieu toString

		//mang ds doi tuong
		Scanner sc = new Scanner(System.in);
		System.out.println(" nhap vao n so luong sinh vien ");
		int n = sc.nextInt();
		SinhVien ds[] = new SinhVien[n];
		for(int i=0; i<n; i++){
			System.out.println(" nhap vao phan tu sinh vien thu " + (i+1) + ": ");
			ds[i] = new SinhVien();
			ds[i].nhap(); // ham nhap cua lop SinhVien
		}
		for(int i=0; i<n; i++)
			ds[i].in();

		System.out.println("Sinh vien bi canh bao hoc vu ");
		for (int i=0; i<n; i++)
			if(ds[i].dtb() < 1)
				System.out.println(ds[i]);
		//sinh vien co GPA lon nhat
		System.out.println("\nSinh vien có diem trung binh cao nhat:");
		Double max = Double.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (ds[i].dtb() > max)
				max = (double) ds[i].dtb();
		}
		for (int i = 0; i < n; i++) {
			if (ds[i].dtb() == max)
				System.out.println(ds[i].layHoTen());
		}

		// danh sach sinh vien da sap xep
		System.out.println(" danh sach sinh vien duoc sap xep theo ten : ");
		for(int i=0; i<n-1; i++)
			for(int j=i+1; j<n; j++)
				if(ds[i].layTen().compareTo(ds[i].layTen()) > 0){
					SinhVien t = ds[i];
					ds[i] = ds[j];
					ds[j] = t;
				}
		for(SinhVien sv : ds)
			//sv.in();	// giong nhau khi in ra
			System.out.println(sv);	// giong nhau khi in ra


	}

}
