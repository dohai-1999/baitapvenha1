package BaiTap1;

public class SinhVien {
    String masinhvien = "MSV-01";
    static String tensinhvien = "Nguyễn Văn A";
    public void monhoc(){
        double diem = 8.5;
        String tenmon = "Môn Toán";
        System.out.println("Tên môn học là: " + tenmon);
        System.out.println("Điểm môn học là: " + diem);
    }
    public static void main(String[] args) {
        SinhVien bien1 = new SinhVien();
        bien1.monhoc();
        System.out.println("Tên của sinh viên là: "+tensinhvien);
        System.out.println("Mã của sinh viên là: "+ bien1.masinhvien);
        System.out.println("Giá trị biến static là: " +  ThongTin.bienstatic);
    }
}
