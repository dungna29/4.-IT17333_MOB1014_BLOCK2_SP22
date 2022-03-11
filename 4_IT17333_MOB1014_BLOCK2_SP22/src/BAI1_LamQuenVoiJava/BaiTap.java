/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1_LamQuenVoiJava;

import java.util.Scanner;

/**
 *
 * @author dungna29
 */
public class BaiTap {
      /*
    Chương trình cho phép nhập họ và tên sinh viên, năm sinh, mã sinh viên từ bàn phím và xuất ra định dạng sau:
      “Chào bạn <<họ và tên>> | <<năm sinh>>  | <<mã sinh viên>> đến với chương trình lập trình đầu tiên.”
      Yêu cầu nhập đúng theo thứ tự đầu bài đưa ra.
    Năm sinh là số nguyên
    Msv là String.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name,msv;
        int ns;
        System.out.println("Mời bạn nhập tên: ");
        name = sc.nextLine();
        System.out.println("Mời bạn nhập ns: ");
        //ns = sc.nextInt();//Trôi lệnh chỉ xảy sau khi nhập số mà tiếp theo nhập chuỗi sẽ bị.
        //Cách 1:
        //sc.nextLine();
        
        //Cách 2: Không quan tâm đến các Next Số nữa. Hãy coi tất cả các giá trị nhập vào đề là String. Ép kiểu từ String về các kiểu dữ liệu bạn cần.
        ns = Integer.parseInt(sc.nextLine());
        System.out.println("Mời bạn nhập msv: ");
        msv = sc.nextLine();
        
        System.out.printf("Chào bạn: %s %d %s",name,ns,msv);
    }
}
