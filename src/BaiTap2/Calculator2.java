package BaiTap2;

public class Calculator2 {
    public int tong2songuyen(int a, int b){
        return (a+b);
    }
    public  double tich2sothuc(double x, double y){

        return (x*y);
    }
    public static void main(String[] args) {
        Calculator2 calculator = new Calculator2();
        System.out.println("Tổng 2 số nguyên là:"+calculator.tong2songuyen(10, 20));
        System.out.println("Tích 2 số thực là:"+calculator.tich2sothuc(1.5,-5.9));
    }
}
