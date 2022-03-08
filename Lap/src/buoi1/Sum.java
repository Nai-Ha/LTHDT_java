package buoi1;

import java.util.Scanner;

public class Sum {
	public int nhap(){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        String s;
        do{
            System.out.println("Nhap vao mot so nguyen ");
            s = sc.nextLine();
            try{
                n = Integer.parseInt(s);
            }catch(NumberFormatException e){
                n = Integer.MAX_VALUE;
                System.out.println("Nhap sai! Yeu cau nhap lai!!");
            }
        }while(n == Integer.MAX_VALUE);
        return n;
    }

    public static void main(String[] args){
        Sum t = new Sum();
        int a = t.nhap();
        int b = t.nhap();
        System.out.println("Tong cua hai so vua nhap = "+ (a+b));
    }

}
