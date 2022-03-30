package buoi4;

import buoi3.SinhVien;

import java.util.Scanner;

public class SDSVCNTT {
    public static void main(String[] args) {

        SinhVien d = new SinhVien();
        d.nhap();
        d.in();

        System.out.println("Nhap thong tin SVCNTT");
        d = new SinhVienCNTT();
        d.nhap();
        d.in();

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap danh sach n so sinh vien: ");
        int n = sc.nextInt();
        SinhVien ds[] = new SinhVien[n];

        int c=0;
        for(int i=0; i<n; i++){
            System.out.println("\nSinh vien thu: "+(i+1)+ ": ");
            System.out.println("Nhap Sinh Vien(0), SVCNTT(1) ");
            c=sc.nextInt();

            if( c==0) ds[i] = new SinhVien();
            else ds[i] = new SinhVienCNTT();
            ds[i].nhap();
        }
        for(SinhVien e:ds){
            e.in();
        }

        System.out.println("Nhap email de tim kiem va in ra man hinh");
        Scanner sc1= new Scanner(System.in);
        String Email = sc1.nextLine();
        for(SinhVien s:ds){
            if(s.layEmail().equals(Email)){
                System.out.println("User: "+s.layUser());
                break;
            }
        }
    }
}
