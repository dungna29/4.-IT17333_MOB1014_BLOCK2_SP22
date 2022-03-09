/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1_LamQuenVoiJava;

/**
 *
 * @author dungna29
 */
public class B3_EpKieu {
    /*
        1. Ép kiểu từ String về Số
        2. Ép kiểu giữa các các số với nhau
    */
    public static void main(String[] args) {
        //1. Ép kiể từ String về số
        String year1 = "2022";
        int year2 = 1;
        //Không thực hiện được phép toán bởi đó đó là 2 kiểu dữ liệu khác nhau
        System.out.println("Cộng chuỗi" + (year1 + year2));//=20221
        //Giải quyết bằng ép kiểu
        //Integer.parseInt(year1) Được gọi là ép từ kiểu String về Nguyên
         System.out.println("Ép kiểu" + (Integer.parseInt(year1) + year2));
         
         //Vậy thì các kiểu dữ liệu còn lại ép thế nào? Phải thuộc kiểu dữ liệu
         Double.parseDouble(year1);
         Float.parseFloat(year1);
         Long.parseLong(year1);
         
         //2. Ép kiểu giữa các số với nhau
         int a = 5;
         double b = 9.9;
         b = a;//Ép kiểu tự động
         //a = b;
                 
    }
}
