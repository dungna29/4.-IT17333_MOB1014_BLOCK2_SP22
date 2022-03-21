/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI3_VONGLAP;

import java.util.Scanner;

/**
 *
 * @author dungna29
 */
public class B4_ThuatToanNoiBot {

    public static void main(String[] args) {
        int arrNumber[] = {99, 1, 0, 33};
        System.out.println("Trước khi sort");
        for (int x : arrNumber) {
            System.out.print(x + " ");
        }
        System.out.println("");
        //Thực thi thuật toán
        /*
           99,1,0,33
           arrNumber[0] = 99  > arrNumber[1] = 1 = true
           1,99,0,33 
           arrNumber[0] = 1  > arrNumber[2] = 0 = true
           0,99,1,33
           arrNumber[0] = 0  > arrNumber[3] = 33 = false 
           0,99,1,33
        
           Vòng 2: i = 1
            0,99,1,33
            arrNumber[1] = 99  > arrNumber[2] = 1 = true
            0,1,99,33
            arrNumber[1] = 1  > arrNumber[3] = 33 = flase
            0,1,99,33
            
            Vòng 3: i = 2
            0,1,99,33
            arrNumber[2] = 99  > arrNumber[3] = 33 = true
            0,1,33,99
        
         */
//        for (int i = 0; i < arrNumber.length - 1; i++) {
//            for (int j = i + 1; j < arrNumber.length; j++) {
//                if (arrNumber[i] > arrNumber[j]) {
//                    int temp = arrNumber[i];
//                    arrNumber[i] = arrNumber[j];
//                    arrNumber[j] = temp;
//                }
//            }
//        }
        System.out.println("");
        for (int i = 0; i < arrNumber.length - 1; i++) {
            System.out.println("Lần chay thứ: " + i);
            for (int x : arrNumber) {
                System.out.print(x + " ");
            }
            System.out.println("");
            for (int j = i + 1; j < arrNumber.length; j++) {
                System.out.printf("Điều kiện %d > %d \n", arrNumber[i], arrNumber[j]);
                if (arrNumber[i] > arrNumber[j]) {
                    int temp = arrNumber[i];
                    arrNumber[i] = arrNumber[j];
                    arrNumber[j] = temp;
                    System.out.printf("Hoán vị của: %d & %d \n", arrNumber[i], arrNumber[j]);
                    for (int x : arrNumber) {
                        System.out.print(x + " ");
                    }
                    System.out.println("");
                }
            }
        }
        System.out.println("Sau khi sort");
        for (int x : arrNumber) {
            System.out.print(x + " ");
        }
        /*     Bài 0: In bảng cửu chương theo khoảng mà người dùng nhập vào.
                 * Bài 1: Viết 1 chương trình cho phép người dùng nhập vào bao nhiêu số tùy thích. Sau khi nhập xong in ra màn hình các số chẵn trên 1 dòng và số lẻ trên 1 dòng.
                 *
                 * Bài 2: Viết 1 chương trình cho phép người dùng nhập vào 1 dãy điểm. In ra màn hình dãy điểm người vừa nhập và bệnh cạnh mỗi 1 đầu điều thông báo Trượt hoặt đỗ dựa trên điều kiện điểm đỗ >=5 và Trượt <5.
                 *
                 * Bài 3: Viết 1 chương trình nhập nhiều  thông tin của sinh viên POLY. Mỗi sinh viên khi nhập vào cần các thông tin sau: Tên, Năm Sinh, Msv. Sau khi người dùng nhập xong hết thông tin sinh viên cần thêm thì sẽ in tất cả ra màn hình lưu in thêm tuổi của mỗi sinh viên tương ứng.(Gợi ý mỗi thuộc tính là một mảng)
         */

        //Nhập vào 1 mảng bao nhiêu tuỳ thích
        Scanner sc = new Scanner(System.in);
        int arrNumber1[];
        System.out.println("Bạn thích nhập bao nhiêu số: ");
        arrNumber1 = new int[Integer.parseInt(sc.nextLine())];//khởi tạo mảng
        //Nhập mảng
        for (int i = 0; i < arrNumber1.length; i++) {
            System.out.printf("Mời bạn nhập phần tử thứ %d: ", i);
            arrNumber1[i] = Integer.parseInt(sc.nextLine());
        }
    }
}
