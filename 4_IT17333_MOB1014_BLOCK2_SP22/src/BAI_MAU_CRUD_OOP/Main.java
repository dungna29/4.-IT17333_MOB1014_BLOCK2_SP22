/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_MAU_CRUD_OOP;

import java.util.Scanner;
import javax.sound.midi.SysexMessage;

/**
 *
 * @author dungna29
 */
public class Main {

    public static void main(String[] args) {
        //Nơi code menu
        Scanner sc = new Scanner(System.in);
        NguoiYeuMoiService nyms = new NguoiYeuMoiService();
        String input;
        do {
            System.out.println("Chương trình quản lý NY mới");
            System.out.println("1. Thêm mới NY");
            System.out.println("2. Sửa NY");
            System.out.println("3. Xoá NY");
            System.out.println("4. Tìm kiếm NY");
            System.out.println("5. Xuất danh sách NY");
            System.out.println("6. Thoát");
            System.out.print("Mời bạn chọn chức năng: ");
            input = sc.nextLine();
            switch (input) {
                case "1":
                    nyms.themMoi();
                    break;
                case "2":
                    nyms.sua();
                    break;
                case "3":
                    nyms.xoa();
                    break;
                case "4":
                    nyms.timKiem();
                    break;
                case "5":
                    nyms.inDs();
                    break;
                case "6":
                    System.out.println("Chào tạm biệt");
                    break;
                default:
                    System.out.print("Mời bạn chọn lại chức năng...");
            }
        } while (!input.equals("6"));
    }
}
