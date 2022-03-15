package buoi3;

import java.util.Scanner;

public class SDGach {
	public static void main(String[] args) {
		//mang doi tuong
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so luong n loai gach lot nen: ");
		n = sc.nextInt();
		Gach dsGach[] = new Gach[n];
		for(int i=0; i<n; i++){
			System.out.println("-- Nhap loai gach thu "+ (i+1) + ": ");
			dsGach[i] = new Gach();
			dsGach[i].nhap();
		}
		int j=0;
		for(Gach e : dsGach){
			System.out.println("\n-- Thong tin hop gach thu " + (j+1) + ": ");
			e.in();
			j++;
		}
		Gach gMin = new Gach();
        gMin = dsGach[0];
        float chiPhi = dsGach[0].layGia() / (dsGach[0].layChieuNgang()*dsGach[0].layChieuDai());
        for(int i=1; i<n; i++){
        	if( chiPhi > dsGach[i].layGia() / (dsGach[i].layChieuNgang()*dsGach[i].layChieuDai()) ){
                chiPhi = dsGach[i].layGia() / (dsGach[i].layChieuNgang()*dsGach[i].layChieuDai() );
                gMin = dsGach[i];
            }
        }
        System.out.println("\nLoai gach co chi phi lot thap nhat la: ");
        gMin.in();

        for(int i=0; i<n; i++){
            System.out.println("\nChi phi mua gach trong hop gach thu " + (i+1)
                    + " de lot 1 dien tich co chieu dai 20m va chieu ngang 5m : "
                    + dsGach[i].chiPhiMuaGach(20, 5));
        }
		
	}

}
