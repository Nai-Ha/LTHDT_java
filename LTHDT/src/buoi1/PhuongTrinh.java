package buoi1;

import java.util.Scanner;

public class PhuongTrinh {
    public static void main(String[] agrs){
        PhuongTrinh p = new PhuongTrinh();
        Scanner sc = new Scanner(System.in);
        int n = 0;

        do{
            System.out.println("Nhap vao 1 (bac1) hoac 2 (bac2): ");
            n = sc.nextInt();
            if(n==1) {
                p.bac1(); break;
            }
            if(n==2) {
                p.bac2(); break;
            }
        }while(n != 1 || n!= 2);
    }

    public void bac1(){ //ax+b=0
        Scanner sc = new Scanner(System.in);
        float a = 0, b = 0;
        System.out.println("Nhap vao a = ");
        a = sc.nextFloat();
        System.out.println("Nhap vao b = ");
        b = sc.nextFloat();

        if(a==0) {
            if (b == 0) System.out.println("Phuong trinh vo so nghiem.");
            else System.out.println("Phuong trinh vo nghiem.");
        }
        else System.out.println("Phuong trinh co 1 nghiem duy nhat x = " + (-a/b));
    }

    public void bac2(){ // ax2+bx+c=0
        Scanner sc = new Scanner(System.in);
        float a, b, c, x1, x2, delta;
        System.out.println("Nhap vao a = ");
        a = sc.nextFloat();
        System.out.println("Nhap vao b = ");
        b = sc.nextFloat();
        System.out.println("Nhap vao c = ");
        c = sc.nextFloat();
        delta = (float)    Math.pow(b,2) - 4*a*c;
        if(delta < 0) System.out.println("Phuong trinh vo nghiem.");
        else if(delta == 0 ) System.out.println("Phuong trinh co nghiem kep:\nx = "+ (-b/(2*a)));
        else {

            x1 =   ((float)(-b+Math.sqrt(delta))/(2*a));
            //x1 = (float)  ((-b+Math.sqrt(d))/(2*a));

            x2 = (float)  ((-b-Math.sqrt(delta))/(2*a));
            System.out.println("Phuong trinh co hai nghiem phan biet:\nx1 = "+ x1 + "\nx2 = " + x2 );
        }
    }
}
