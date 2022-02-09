package buoi4;

import java.util.Scanner;

public class SDConVat {

	//public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConVat [] dsConVat;
		System.out.println("Nhap so luong dong vat: ");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		dsConVat = new ConVat[n];
		
		char c = ' ';
		for(int i=0; i<n; i++){
			System.out.println("Nhap Bo(b), Heo(h), De(d), Ga(g): ");
			
			do{
				c = sc.nextLine().charAt(0);
				if(c == 'b'){
					System.out.println("Nhap thong tin con bo: ");
					dsConVat[i] = new Bo();
				}
				else if(c == 'h'){
					System.out.println("Nhap thong tin con heo: ");
					dsConVat[i] = new Heo();
				}
				else if(c == 'd'){
					System.out.println("Nhap thong tin con de: ");
					dsConVat[i] = new De();	
				}
				else if(c == 'g'){
					System.out.println("Nhap thong tin con ga: ");
					dsConVat[i] = new Ga();	
				}
				
			}while(c != 'b' && c != 'h' && c != 'd' && c != 'g'); 
			
			dsConVat[i].nhap();
		}
		
		for(int i=0; i<n; i++){
			dsConVat[i].in();
			dsConVat[i].keu();
		}
		
	}

}
