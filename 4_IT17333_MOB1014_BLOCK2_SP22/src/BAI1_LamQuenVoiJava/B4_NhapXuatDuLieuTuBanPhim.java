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
public class B4_NhapXuatDuLieuTuBanPhim {
   /*
       Bài 4: Nhập xuất dữ liệu từ bàn phím
    1. Xuất dữ liệu ra màn hình: In giá trị mặc định hoặc giá của biến ra màn hình
        + Công thức: sout + tab
        + System.out.println(<giá trị hoặc tập giá trị>);
        + System.out.print(<giá trị hoặc tập giá trị>);
        + System.out.printf("Chào các %s bạn đến với năm học %d",value,value);
    2. Nhập dữ liệu ra màn hình:
        + Sử dụng 1 Class: Scanner sc = new Scanner(System.in);
        + Để đọc dữ liệu thì cần định nghĩa rõ muốn lưu dữ liệu nào khi người dùng nhập.
        + Để lấy giá trị từ bàn phím: sc.next<Kiểu dữ liệu muốn>();
   */
    
    public static void main(String[] args) {
        //1. Xuất ra màn hình
        System.out.print("Tôi muốn học giỏi JAVA1 ");
        System.out.println("tại ngành PTPM");
        System.out.print(" năm 2022 \t FPOLY\n");
        
        //In theo Template
        String name = "Dũng";
        System.out.printf("Tôi là: %s Sinh Năm: %d sẽ không trở thành người chép code \n",name,2000);//Đổ dữ liệu vào đúng thứ tự và đúng kiểu dữ liệu, printf sẽ không tự xuống dòng
        System.out.println("Tôi là: " + name + " Sinh Năm: " + 2000 + " sẽ không trở thành người chép code");
        
        //2. Nhập dữ liệu từ bàn phím
        //Viết 1 chương trình nhập tên và in ra
        
        //Bước 1: Khai báo 1 thư viện Scanner
        Scanner sc = new Scanner(System.in);
        
        //Bước 2: Xác định số lượng biến cần phải sử dụng
        String name1;
        
        //Bước 3: Gán giá trị vào cho biến và hướng dẫn người dùng.
        System.out.println("Mời bạn nhập tên: ");
        name1 = sc.nextLine();//Gán giá trị do người dùng nhập vào cho biến. sc.nextLine() có dữ liệu String
        //int temp = sc.nextInt();//Phải sử dụng next đúng kiểu dữ liệu bên trái
        
        //Bước 4: Thực thi
        System.out.printf("Chào bạn: %s",name1);
        
        /*
    Chương trình cho phép nhập họ và tên sinh viên, năm sinh, mã sinh viên từ bàn phím và xuất ra định dạng sau:
      “Chào bạn <<họ và tên>> | <<năm sinh>>  | <<mã sinh viên>> đến với chương trình lập trình đầu tiên.”
      Yêu cầu nhập đúng theo thứ tự đầu bài đưa ra.
    Năm sinh là số nguyên
    Msv là String.
     */
    }
}
