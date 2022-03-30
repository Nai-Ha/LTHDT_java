package buoi4;

import java.util.Scanner;

public class SDConVat {
    public static void main(String[] args) {System.out.println("Nhap vao thong tin con Bo");
      ConVat d = new Bo();
      d.nhap();
      d.in();
      d.keu();

      System.out.println("\n nhap so luong n con vat: ");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      ConVat ds[] = new ConVat[n];

      int c=0;
      for (int i=0; i<n; i++){
          System.out.println("nhap con vat thu: "+(i+1)+ ": ");
          System.out.println("Bo(0), Heo(1), De(2), Ga(3)");
          c = sc.nextInt();
          if(c==0){
              System.out.println("Nhap Thong tin con Bo: ");
              ds[i] =  new Bo();
          }else if(c==1) {
              System.out.println("Nhap Thong tin con Heo: ");
              ds[i] = new Heo();
          }else if(c==2){
              System.out.println("Nhap Thong tin con De: ");
              ds[i] =  new De();
          }else{
              System.out.println("Nhap Thong tin con Ga: ");
              ds[i] = new Ga();
          }

          ds[i].nhap();
      }

      for(ConVat e:ds){
          e.in();
          e.keu();
      }

    }
}
