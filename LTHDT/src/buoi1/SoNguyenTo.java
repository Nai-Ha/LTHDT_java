package buoi1;

import java.util.Scanner;

import static java.lang.Integer.toBinaryString;

public class SoNguyenTo {
    public static void main(String[] agrs){
        SoNguyenTo n = new SoNguyenTo();
        n.nhap();
    }

    public void nhap(){
        int n, flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot so nguyen n = ");
        n = sc.nextInt();
        for(int i=2; i<n/2; i++){
            if(n%2 == 0 ){
                flag++;
                break;
            }
        }
        if(flag == 0){
            System.out.println(n + " la so nguyen to.");
            String s = toBinaryString(n);
            System.out.println("Day so nhi phan cua so nguyen to do la: " + s);
        }
        else System.out.println(n + " khong phai la so nguyen to.");
    }
}
