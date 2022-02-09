package buoi1;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Name ten = new Name();
        ten.nhap();
    }

    public void nhap(){
        String hoTen;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ten cua ai do: ");
        hoTen = sc.nextLine();
        hoTen = hoTen.trim();
        int i = hoTen.lastIndexOf(' ');
        String ten = hoTen.substring(i+1);
        System.out.println("Ten cua nguoi do khi da duoc tach: " + ten);
    }
}
