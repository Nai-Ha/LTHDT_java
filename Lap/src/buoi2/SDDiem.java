package buoi2;
import java.util.Scanner;
public class SDDiem {

	public static void main(String[] args) {
		Diem a = new Diem(3, 4);
		a.in();
		System.out.println("Diem a in theo cach toString la: "+a); // tu dinh dang + a.toString
		Diem b = new Diem();
		b.nhap();
		b.in();
		//Diem c la diem doi xung voi b
		Diem c = new Diem(-b.giaTriX(), -b.giaTriY());
		c.in();
		// in khoang cach tu diem B den tam O
		System.out.println("Khoang cach tu B den tam 0 = " + b.khoangCach());
		System.out.println("Khoang cach ta A den B = " + a.khoangCach(b));
		
		Diem ds[];
		System.out.println("Nhap so phan tu n cua diem = ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ds = new Diem[n];
		for(int i=0; i<n; i++){
			System.out.println("Nhap phan tu thu "+ (i+1)+ ": ");
			ds[i] = new Diem();
			ds[i].nhap();
		}
		System.out.println("Danh sach diem: ");
		for(Diem e : ds){
			e.in();
		}

	}

}
