package buoi4;

import java.util.Scanner;

public class SDConVat {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConVat d;
	//	d = new ConVat();  sai do vi pham dinh nghia (khong tao ra doi tuong)
	
		d = new Bo();
		d.nhap();	//ConVat.nhap();
		d.in();		//ConVat.in();
		d.keu();	//Bo.keu();
	
		
		
	
		
		
		System.out.println("Nhap so luong dong vat: ");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		ConVat [] ds = new ConVat[n];
		
		int c = 0;
		for(int i=0; i<n; i++){
			System.out.println("Nhap con vat thu: "+(i+1) + ": ");
			System.out.println("Nhap Bo(0), Heo(1), De(2), Ga(3): ");
			
				c = sc.nextInt();
				if(c == 0){
					System.out.println("Nhap thong tin con bo: ");
					ds[i] = new Bo();
				}
				else if(c == 1){
					System.out.println("Nhap thong tin con heo: ");
					ds[i] = new Heo();
				}
				else if(c == 2){
					System.out.println("Nhap thong tin con De: ");
					ds[i] = new De();
				}
				else {
					System.out.println("Nhap thong tin con Ga: ");
					ds[i] = new Ga();	
				}
				
			ds[i].nhap();
		}
		
		for(ConVat d1:ds){
			d1.in();
			d1.keu();
		}
		
	}

}
