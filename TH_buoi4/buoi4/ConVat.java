package buoi4;

import java.util.Scanner;

public abstract class ConVat {
    private String giong, mauLong;
    private float canNang;

    public abstract void keu();

    public ConVat(){
        giong = new String();
        mauLong = new String();
        canNang = 1.0f;
    }
    public ConVat(String giong1, String mauLong1, float canNang1){
        giong = new String(giong1);
        mauLong = new String(mauLong1);
        canNang = canNang1;
    }

    public ConVat(ConVat s){
        giong = new String(s.giong);
        mauLong = new String(s.mauLong);
        canNang = s.canNang;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Giong: ");
        giong = sc.nextLine();
        System.out.println("Nhap mau long: ");
        mauLong = sc.nextLine();
        System.out.println("Nhap Can nang: ");
        canNang = sc.nextFloat();

        sc.nextLine();
    }
    public String toString(){

        return ("Giong: "+giong+"; mau long: "+mauLong+"; can nang: "+canNang);

    }

    public void in(){
        System.out.println("Thong tin con vat: ");
        System.out.println("Giong: "+giong+"; mau long: "+mauLong+"; can nang: "+canNang);

    }

}
