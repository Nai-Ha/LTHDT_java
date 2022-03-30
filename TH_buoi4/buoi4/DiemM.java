package buoi4;

import  java.util.Scanner;

import buoi2.Diem;

public class DiemM extends Diem {
    private String mau;

    public DiemM(){
        super();
        mau = new String();
    }

    public DiemM(int x1, int y1, String mau1){
        super(x1,y1);
        mau = new String(mau1);
    }

    public DiemM(DiemM dm){
        super( dm);
        mau = new String(dm.mau);
    }

    public void ganMau(String mau1){
        mau = new String(mau1);
    }

    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap vao mau: ");
        mau = sc.nextLine();
    }

    public void in(){
        super.in();
        System.out.println("in mau: "+mau);
    }

    public String toString(){

        return super.toString() + ("    in mau: "+mau);
    }

}
