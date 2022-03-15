package buoi1;

public class TongDS {
	public static void main(String[] args) {
        double tong = 0, n= 0, max = Double.MIN_VALUE;
        for(String s:args){ //doi so tu dong lenh
            try{
                n=Double.parseDouble(s);
            }
            catch(NumberFormatException e){
                n =0;
            }
            tong +=n;
            if (max < n) max = n;
        }
        System.out.println("Tong = " + tong);
        System.out.println("so lon nhat = " + max);
    }

}
