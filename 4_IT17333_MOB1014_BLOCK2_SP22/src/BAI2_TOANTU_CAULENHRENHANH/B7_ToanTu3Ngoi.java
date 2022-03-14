/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2_TOANTU_CAULENHRENHANH;

import java.util.Scanner;

/**
 *
 * @author dungna29
 */
public class B7_ToanTu3Ngoi {
    /*
    * TOÁN TỬ 3 NGÔI
    * <Điều kiện hoặc nhiều điều kiện> ? <Kết quả nếu điều kiện đúng> : <Kết quả nếu điều kiện sai>;
        */
    public static void main(String[] args) {
        String temp1 = 9 > 10 ? "Đúng" : "Sai";
        int temp2 = 9 > 10 ? 1 : 0;
        boolean temp3 = 9 > 10 ? true : false;
        double temp4 = 9 > 10 ? 8.7 : 9.9;
        
        Scanner sc = new Scanner(System.in);
        double diemThi;
        System.out.print("Mời bạn nhập điểm thi JAVA1: ");
        diemThi = Double.parseDouble(sc.nextLine());
        System.out.println((diemThi >= 9 && diemThi <= 10)?"Xuất Sắc":
                (diemThi >= 8 && diemThi <9)?"Giỏi":
                        (diemThi >= 7 && diemThi <8)?"Khá":
                                (diemThi >= 5 && diemThi <7)?"TB":
                                        (diemThi >= 0 && diemThi <5)?"Học lại":
                                                "Bạn vui lòng nhập thang điểm 10");
    }
}
