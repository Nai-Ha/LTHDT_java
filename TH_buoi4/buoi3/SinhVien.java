package buoi3;
import java.util.Scanner;
import buoi2.Date;
public class SinhVien {
    private String id,hoTen;
    private int n;
    private String tenHP[], diemHP[];
    private Date ngaySinh;

    public SinhVien() {
        id = new String();
        hoTen = new String();
        n = 0;
        ngaySinh = new Date();
        tenHP = new String[55];
        diemHP = new String[55];
    }

    public SinhVien(SinhVien a) {
        id = new String(a.id);
        hoTen = new String(a.hoTen);
        n = a.n;
        ngaySinh = new Date(a.ngaySinh);
        tenHP = new String[a.tenHP.length];
        diemHP = new String[a.diemHP.length];

        for(int i=0; i<n; i++) {
            tenHP[i] = new String(a.tenHP[i]);
            diemHP[i] = new String(a.diemHP[i]);
        }
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id: ");
        id = sc.nextLine();
        System.out.println("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.println("Nhap ngay, thang, nam sinh: ");
        ngaySinh.nhap();
        System.out.println("Nhap so luong hoc phan: ");
        n = sc.nextInt();

        sc.nextLine(); //bo ky tu Enter nhap chuoi mang
        for (int i=0; i<n; i++) {
            System.out.println("Nhap hoc phan thu: "+(i+1)+": ");
            tenHP[i] = sc.nextLine();
            System.out.println("diem hoc phan thu: "+(i+1)+": ");
            diemHP[i] = sc.nextLine();
        }
    }

    public void in() {
        System.out.println("Thong tin Sinh vien: ");
        System.out.println("["+id+","+hoTen+","+ngaySinh+"]");
        for(int i=0; i<n; i++) {
            System.out.println(tenHP[i]+" : "+diemHP[i]+"\n");
        }

    }

    public String toString() {
        String s = ("["+id+","+hoTen+","+ngaySinh);
        for (int i=0; i<n; i++) {
            s = s + (tenHP[i]+" : "+diemHP[i]);
        }
        return s+"]";
    }

    public String layHoTen() {
        return hoTen;
    }

    //ham buoi 4
    public String layUser() {
        return " ";
    }

    public String layEmail() {
        return " ";
    }

    public String layTen() {
        String ten = hoTen.trim();
        int k = hoTen.lastIndexOf(" ");
        return hoTen.substring(k+1);
    }

    public float dtb() {
        float d = 0.0f;
        for (int i=0; i<n; i++) {
            if(diemHP[i].equals("A"))
                d += 4.0;
            else if(diemHP[i].equals("B+"))
                d += 3.5;
            else if(diemHP[i].equals("B"))
                d += 3.0;
            else if(diemHP[i].equals("C+"))
                d += 2.5;
            else if(diemHP[i].equals("C"))
                d += 2.0;
            else if(diemHP[i].equals("D+"))
                d += 1.5;
            else if(diemHP[i].equals("D"))
                d += 1.0;
            else d += 0;

        }
        return d/n;
    }

    public void themHP(String ten, String diem) {
        if(n < tenHP.length-1) {
            tenHP[n] = new String(ten);
            diemHP[n] = new String(diem);
            n++;
        }
        else System.out.println("Mang day! Loi a hi hi!");

    }

    public void xoaHP(String ten) {
        int i=0;
        for(i=0; i<n; i++) {
            if(tenHP[i].equals(ten))
                break;
        }
        if(i<n) {
            for(int j=i; j<n-1; j++) {
                tenHP[j] = tenHP[j+1];
                diemHP[j] = diemHP[j+1];
            }
            n--;
        }

    }
}
