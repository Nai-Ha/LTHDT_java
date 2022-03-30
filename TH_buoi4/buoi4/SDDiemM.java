package buoi4;

import buoi2.Diem;

public class SDDiemM {
    public static void main(String[] args) {
        System.out.println("Toa do diem A la: ");
        DiemM A = new DiemM(5, 10, "trang");
        A.in();
        System.out.println("in A theo kieu toString: "+A);

        DiemM B = new DiemM();
        System.out.println("nhap vao toa do diem B: ");
        B.nhap();
        System.out.println("Diem B co toa do la: ");
        B.in();
        B.tinhTien(10, 8);
        System.out.println("Diem B sao khi tinh tien la: ");
        B.in();
        System.out.println("Diem B sau khi duoc gan mau moi la: ");
        B.ganMau("vang");
        B.in();

    }
}
