package buoi1;

import java.util.Scanner;

public class Cviec {
	    int dayso[];
	    int n;

	    public void nhap(){
	        Scanner sc = new Scanner(System.in);
	        System.out.print("\n Nhap so luong phan tu n = " );
	        //
	        do{
	            n = sc.nextInt();
	            if(n<=0){
	                System.out.print("\nNhap sai! moi nhap lai!!\n");
	            }
	        }while (n<=0);
	        dayso = new int[n]; //cap phat bo nho cho mang dayso
	        for( int i=0; i < dayso.length; i++){
	            System.out.print("\n Nhap phan tu thu " + (i+1) + " = ");
	            dayso[i] = sc.nextInt();
	        }

	    }

	    public void in(){
	        for(int e : dayso)
	            System.out.print(e +" ");
	    }

	    public void sapxep(){
	        for( int i=0; i<dayso.length; i++)
	            for( int j=i+1; j<dayso.length; j++){
	                if( dayso[i]>dayso[j]){
	                    int temp = dayso[i];
	                    dayso[i] = dayso[j];
	                    dayso[j] = temp;
	                }
	            }
	    }

	    public int dem(int x){
	        int c=0;
	        for( int e:dayso)
	            if(e==x) c++;
	        return c;
	    }

	    public int Tim(int v){
	        for(int i=0; i<dayso.length; i++)
	            if(dayso[i]==v){
	                return i;
	            }

	        return -1;
	    }

	    public static void main(String[] args) {
	        Cviec d = new Cviec();
	        d.nhap();
	        System.out.print("\n sau khi sap xep tang dan la: ");
	        d.sapxep();
	        d.in();

	        Scanner sc = new Scanner(System.in);
	        System.out.print("\nNhap vao gia tri x can tim: \n");
	        int v = sc.nextInt();
	        System.out.print("\nTim thay so x can tim tai chi so a " + d.Tim(v) + " Nguoc lai tra ve -1 tim khong thay " );
	        System.out.print("\n Nhap so can dem x = \n");
	        int x = sc.nextInt();
	        System.out.print("\n Dem so x xuat hien: " + d.dem(x));
	    }

}
