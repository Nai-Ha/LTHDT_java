package buoi3;
import java.util.Scanner;
import buoi2.Date;

public class SinhVien {

	private String MSSV, hoTen;
	private Date ngaySinh;
	private int n; // soLuongHPDK
	private String tenHP[];
	private String diemHP[];

	public SinhVien(){
		MSSV = new String();
		hoTen = new String();
		ngaySinh = new Date();
		n = 0;
		tenHP = new String[60];
		diemHP = new String[60];
	}

	public SinhVien(String MSSV1, String hoTen1, Date ngaySinh1, int n1){
		MSSV = new String(MSSV1);
		hoTen = new String(hoTen1);
		ngaySinh = new Date(ngaySinh1);
		n = n1;
		tenHP = new String[60];
		diemHP = new String[60];
	}

	public SinhVien(SinhVien sv){
		MSSV = new String(sv.MSSV);
		hoTen = new String(sv.hoTen);
		ngaySinh = new Date(sv.ngaySinh);
		n = sv.n;
		tenHP = new String[sv.tenHP.length];
		diemHP = new String[sv.diemHP.length];

		for(int i = 0; i < n; i++){
			tenHP[i] = new String(sv.tenHP[i]);
			diemHP[i] = new String(sv.diemHP[i]);
		}
	}

	public void nhap(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so sinh vien: ");
		MSSV = sc.nextLine();
		System.out.println("Nhap ho ten: ");
		hoTen = sc.nextLine();
		System.out.println("Nhap ngay, thang, nam sinh: ");
		ngaySinh.nhap();
		System.out.println("Nhap so Mon Hoc ");
		n = sc.nextInt();
		
		sc.nextLine();	// bo qua dung nhap chuoi
		for(int i=0; i<n; i++){
			System.out.println("Nhap mon hoc thu "+ (i+1)+ ": ");
			tenHP[i] = sc.nextLine();
			System.out.println("Nhap diem mon hoc "+ tenHP[i]);
			diemHP[i] = sc.nextLine();
		}
		
	}
	
	public void in() {
		System.out.println("["+MSSV+ ", " +hoTen+ ", " + ngaySinh+ "]"); 
				for (int i=0; i<n; i++)
					System.out.println(tenHP[i]+ ":" + " "+diemHP[i]);
	}

		public String toString(){
			String s = MSSV+ ", " +hoTen+ ", " + ngaySinh+ ", ";
			for(int i=0; i<n; i++){
				s = s + tenHP[i]+ ":" + " "+diemHP[i];
			}

			return "[" +s+ "]";
		
	}
		

		public float dtb(){
			float d=0.0f;
			for(int i=0; i<n; i++){
				if(diemHP[i].equals("A"))
					d += 4.0;
				else if(diemHP[i].equals("B+"))
					d += 3.5;
				else if(diemHP[i].equals("B"))
					d += 3.0;
				else if(diemHP[i].equals("C+"))
					d += 2.5;
				else if(diemHP[i].equals("C"))
					d += 2.0;
				else if(diemHP[i].equals("D+"))
					d += 1.5;
				else if(diemHP[i].equals("D"))
					d += 1.0;
				else d += 0;
			}
			return d/n;
		}
		
		public void ThemHP(String ten, String d){
			if(n < (tenHP.length - 1) ){
				tenHP[n] = new String(ten);
				diemHP[n] = new String(d);
				n++;
			}
			else 
				System.out.println("Loi! mang day! ");
		}
		
		public void xoaHP(String ten){	
			int i = 0;	// xac dinh vi tri i can xoa
			for( i=0; i<n; i++){
				if(tenHP[i].equals(ten)){
					break;
				} 	
			}
			if( i < n){	// xoa mon hoc o vi tri i
				for(int j=i; i<n; i++){
					tenHP[j] = tenHP[j+1];
					diemHP[j] = diemHP[j+1];
				}
				n--;
			}
		}
		
		// ham tach ten
		public String layTen(){
			String ten = hoTen.trim();
			int k = ten.lastIndexOf(" ");
			return ten.substring(k+1);
		}
		
		public String layHoTen() {
			return hoTen;
		}
		
		public Date ngSinh() {
			return ngaySinh;
		}

}
