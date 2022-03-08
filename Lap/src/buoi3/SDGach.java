package buoi3;

import java.util.Scanner;

public class SDGach {
	 public static Scanner sc = new Scanner(System.in);
	    public static void main(String[] args) {
	        int n;
	        Gach dsGach[];
	        System.out.println("Nhap vao so luong n loai gach lot nen: ");
	        n = sc.nextInt();
	        dsGach = new Gach[n];
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
	        float chiPhi = dsGach[0].getGiaCa()/(dsGach[0].getChieuDai()*dsGach[0].getChieuRong());
	        for(int i=1; i<n; i++){
	            if(chiPhi > dsGach[i].getGiaCa()/(dsGach[i].getChieuDai()*dsGach[i].getChieuRong())){
	                chiPhi = dsGach[i].getGiaCa()/(dsGach[i].getChieuDai()*dsGach[i].getChieuRong());
	                gMin = dsGach[i];
	            }
	        }
	        System.out.println("\nLoai gach co chi phi lot thap nhat la: ");
	        gMin.in();

	        for(int i=0; i<n; i++){
	            System.out.println("\nChi phi mua gach trong hop gach thu " + (i+1)
	                    + " de lot 1 dien tich co chieu ngang 5m chieu dai 20m: "
	                    + dsGach[i].chiPhiMuaGach(20, 5));
	        }

//	        Gach g1 = new Gach();
//	        g1.nhap();
//	        g1.in();
//	        //System.out.println("Thong tin cua hop gach:\n" + g1);
//	        System.out.println("Gia ban le 1 vien gach: " + g1.giaBanLe());
//	        System.out.println("Dien tich nen toi da co the lot duoc: " + g1.dienTichNenToiDa() + " (cm2)");
//	        System.out.println("Nhap vao chieu dai cua nen nha: ");
//	        int x = sc.nextInt();
//	        System.out.println("Nhap vao chieu rong cua nen nha: ");
//	        int y = sc.nextInt();
//	        System.out.println("So luong hop gach can thiet de lot nen co chieu dai " + x +  " chieu rong " + y + ": " + g1.soLuongHop(x, y));
	    }

}
