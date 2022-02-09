package buoi1;

import java.util.Scanner;

public class SoNguyen {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Nhap so luong phan tu n = ");
        int n = sc.nextInt();
        int ds[] = new int [n];
        for(int i=0; i<n; i++){
            System.out.println("Nhap phan tu thu " + (i+1) +" = ");
            ds[i] = sc.nextInt();
        }

        System.out.println("Mang vua nhap: ");
        for(int i=0; i<n; i++){
            System.out.print(ds[i] + " ");
        }
        System.out.println("\n");

        System.out.println("Nhap 1 so nguyen x bat ky = ");
        int x = sc.nextInt();
        int dem = 0;
        for(int i=0; i<n; i++){
            if(x == ds[i]) dem++;
        }
        System.out.println("Phan tu "+ x +" xuat hien "+ dem +" lan trong mang.");

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(ds[i] > ds[j]){
                    int t = ds[i];
                    ds[i] = ds[j];
                    ds[j] = t;
                }
            }
        }

        System.out.println("Mang sau khi da duoc sap xep tang dan: ");
        for(int i=0; i<n; i++){
            System.out.print(ds[i] + " ");
        }
        System.out.println("\n");
    }
}
