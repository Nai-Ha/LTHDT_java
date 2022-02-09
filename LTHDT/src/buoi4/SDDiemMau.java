package buoi4;

public class SDDiemMau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiemMau A = new DiemMau(5, 10, "trang");
		System.out.println("Diem A co toa do: ");
		A.in();
		
		DiemMau B = new DiemMau();
		System.out.println("\nNhap vao diem B: ");
		B.nhap();
		System.out.println("\nDiem B co toa do: ");
		B.in();
		B.tinhTien(10, 8);
		System.out.println("\nDiem B sau khi tinh tien: ");
		B.in();
		System.out.println("\nDiem B sau khi duoc gan lai mau vang: ");
		B.ganMau("vang");
		B.in();
	}

}
