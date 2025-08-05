package BaiTap2;

public class Calculator {
    public void tong2songuyen(){
        int a = 5;
        int b = -10;
        System.out.println("Tổng 2 số nguyên là:"+(a+b));
    }
    public  void tich2sothuc(){
        float x = 5.5F;
        float y = -1.25F;
        System.out.println("Tích 2 số thực là:"+(x*y));
    }
    public static void main(String[] args) {
        Calculator bien = new Calculator();
        bien.tong2songuyen();
        bien.tich2sothuc();
    }
}
