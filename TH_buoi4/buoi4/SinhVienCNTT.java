package buoi4;

import buoi3.SinhVien;

import  java.util.Scanner;

public class SinhVienCNTT extends SinhVien {
    private String taikhoan, matkhau, email;

    public SinhVienCNTT(){
        super();
        taikhoan = new String();
        matkhau = new String();
        email = new String();
    }

    public SinhVienCNTT(SinhVienCNTT s){
        super(s);
        taikhoan = new String(s.taikhoan);
        matkhau = new String(s.matkhau);
        email = new String(s.email);
    }

    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tai khoan: ");
        taikhoan = sc.nextLine();
        System.out.println("Nhap mat khau: ");
        matkhau = sc.nextLine();
        System.out.println("Nhap email: ");
        email = sc.nextLine();
    }

    public String toString(){

       return super.toString() + ("email: "+email+" tai khoan: "+taikhoan+" mat khau: "+matkhau);

    }

    public void in(){
        super.in();
        System.out.println("email: "+email+" tai khoan: "+taikhoan+" mat khau: "+matkhau);

    }

    public void doiMatKhau(String newpass){
        matkhau = new String(newpass);
    }

    public String layEmail(){
        return email;
    }

    public String layUser(){
        return taikhoan;
    }


}
