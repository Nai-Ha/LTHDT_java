package buoi3;

import java.util.Scanner;

import buoi2.Date;

public class Gach {
	private String ms, mau;
    private int soLuong, chieuDai, chieuRong;
    private long giaCa;
    private Date ngaySx;
//    public static Scanner sc = new Scanner(System.in);

    public Gach(){
        ms = new String();
        mau = new String();
        soLuong = 0;
        chieuDai = 1;
        chieuRong = 1;
        giaCa = 1000;
        ngaySx = new Date();
    }

    public Gach(String ms1, String mau1, int soLuong1, int chieuDai1, int chieuRong1, long giaCa1, Date ngaySx1){
        ms = new String(ms1);
        mau = new String(mau1);
        soLuong = soLuong1;
        chieuDai = chieuDai1;
        chieuRong = chieuRong1;
        giaCa = giaCa1;
        ngaySx = new Date(ngaySx1);
    }

    public Gach(Gach g){
        ms = new String(g.ms);
        mau =new String(g.mau);
        soLuong = g.soLuong;
        chieuDai = g.chieuDai;
        chieuRong = g.chieuRong;
        giaCa = g.giaCa;
        ngaySx = new Date(g.ngaySx);
    }

    public String toString(){
        return "Ma so: " + ms
                + "\nMau: " + mau
                + "\nSo luong vien trong 1 hop: " + soLuong
                + "\nChieu dai vien gach (cm): " + chieuDai
                + "\nChieu ngang vien gach (cm): " + chieuRong
                + "\nGia ban 1 hop: " + giaCa
                + "\nNgay San Xuat: " + ngaySx;
    }

    public void nhap(){
    	Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma so: ");
        ms = sc.nextLine();
        System.out.println("Nhap mau gach: ");
        mau = sc.nextLine();
        System.out.println("Nhap so luong vien gach: ");
        soLuong = sc.nextInt();
        System.out.println("Nhap chieu dai vien gach: ");
        chieuDai = sc.nextInt();
        System.out.println("Nhap chieu rong vien gach: ");
        chieuRong = sc.nextInt();
        System.out.println("Nhap gia thanh cua hop gach: ");
        giaCa = sc.nextLong();
        ngaySx.nhap();
        sc.nextLine();
    }

    public void in(){
        //System.out.println("Thong tin cua hop gach:");
        System.out.println("Ma so: " + ms
                + "\nMau: " + mau
                + "\nSo luong vien trong 1 hop: " + soLuong
                + "\nChieu dai vien gach (cm): " + chieuDai
                + "\nChieu ngang vien gach (cm): " + chieuRong
                + "\nGia ban 1 hop: " + giaCa
                + "\nNgay San Xuat: " + ngaySx);
    }

    public String getMs(){
        return ms;
    }

    public String getMau(){
        return mau;
    }

    public int getSoLuong(){
        return soLuong;
    }

    public int getChieuDai(){
        return chieuDai;
    }

    public int getChieuRong(){
        return chieuRong;
    }

    public long getGiaCa(){
        return giaCa;
    }

    public Date getNgaySx(){return ngaySx;}

    public float giaBanLe(){
        return (float) giaCa/soLuong*1.2f;
    }

    public long chiPhiMuaGach(int D, int N){
        int sHop = soLuongHop(D,N);
        return sHop * giaCa;
    }

    public int dienTichNenToiDa(){
        return chieuDai*chieuRong*soLuong;
    }

    public int soLuongHop(int D, int N){
        int svn = N/chieuRong;
        if(N % chieuRong != 0) svn++;
        int svd = D/chieuDai;
        if(D % chieuDai != 0) svd++;
        int sv = svn * svd;
        int soHop = sv / soLuong;
        if(sv % soLuong != 0) soHop++;
        return soHop;
    }

}
