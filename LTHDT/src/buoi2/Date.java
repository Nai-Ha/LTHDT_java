package buoi2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Date {
	
	private int ngay, thang, nam;
	
	public Date(){
		ngay = 1;
		thang = 1;
		nam = 2000;
	}
	
	public Date(int d, int m, int y){
		ngay = d;
		thang = m;
		nam = y;
	}

	public Date(Date a){
		ngay = a.ngay;
		thang = a.thang;
		nam = a.nam;
	}

	public String toString(){
		return ngay+"/"+thang+"/"+nam;
	}
	
	public void in(){
		System.out.println(ngay+ "/" +thang+ "/" +nam);
	}
	
	public void nhap(){
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("Nhap ngay: ");
			ngay = sc.nextInt();
			System.out.println("Nhap thang: ");
			thang = sc.nextInt();
			System.out.println("Nhap nam: ");
			nam = sc.nextInt();
		}while(!hopLe());
	}

	public int layNgay(){
		return ngay;
	}

	public int layThang(){
		return thang;
	}

	public int layNam(){
		return nam;
	}

	public boolean hopLe(){
		int max[] = {-1,31,28,31,30,31,30,31,31,30,31,30,31};
		if((nam %4 == 0 && nam %100 !=0) || nam %400 ==0) max[2]=29;
		if(ngay > 0 && thang > 0 && nam > 0 && thang<=12 && ngay <= max[thang] ) return true;
		return false;
	}
	
	public Date ngayHomSau(){
		Date d = new Date(ngay, thang, nam); // 31/2/2001      32/2/2001      1/3/2001
		if(hopLe()){
			d.ngay++;}
		if(!d.hopLe()){
			d.ngay = 1;
			d.thang++;
			if(!d.hopLe()){
				d.thang = 1;
				d.nam++;
			}
		}
		return d;
	}
	
	public Date congNgay(int n){
		Date d = new Date(ngay, thang, nam);
		for(int i=1; i<=n; i++){
			d = d.ngayHomSau();
		}
		return d;
	}

	public int compareTo(Date a){
		if(nam > a.nam) return 1;
		else if(ngay < a.ngay) return -1;
		else{
			if(thang > a.thang) return 1;
			else if(thang < a.thang) return -1;
			else{
				if(ngay > a.ngay) return 1;
				else if(ngay < a.ngay) return -1;
				else return 0;
			}
		}
	}
}
