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
public class B5_IF_ELSE_ELSEIF {

    /*
        Câu lệnh điều kiện IF dùng để đưa ra 1 điều kiện nào đó và 
        thực hiện 1 hành động bên trong IF nếu IF(true) 
        
        - Cách dùng: if + tab
        if (true) {
            Thực hiện 1 hành động nào đó với điều kiện if phải true
        }
     */

 /*
        Bài số 6: Câu lệnh điều kiện IF ELSE (NẾU THÌ)
        Định nghĩa: Thực hiện 1 hành động khi thỏa mãn IF(TRUE) và nếu không thỏa mãn IF thì sẽ luôn vào ELSE.
        if (true) {
            Thực hiện 1 hành động nếu thỏa mãn điều kiện của IF
        }else{
            Tất cả các trường hợp không thỏa mãn IF sẽ vào ELSE
            Thực hiện 1 hành động nào đó.
        }
    
     */
 /*
        ELSE IF sử dụng trong trường hợp bài toán có nhiều điều kiện khác nhau và sẽ thực hiện những hành động cũng khác nhau.
        
        Lưu ý: ELSE IF(TRUE) phải luôn đúng thì mới thỏa mãn vào bên trong nó tương tự như IF
        . Nhưng chỉ vào 1 điều kiện thỏa mãn không vào nhiều IF hoặc ELSE IF khi sử dụng.
        if (true) {
            //Thỏa mãn điều kiện IF(True)
            Thực hiện 1 hành động nào đó
        }
        else if (true) {
           //Khi IF không thỏa mãn thì mới tiếp tục đến Else IF(True)
           Thực hiện 1 hành động nào đó
        }
        else if (true) {
           //Khi IF không thỏa mãn thì mới tiếp tục đến Else IF(True)
           Thực hiện 1 hành động nào đó
        }else{
            Khi tất cả các trường hợp trên không thỏa mãn thì sẽ vào đây.
        }
     */
    public static void main(String[] args) {
        /*
            Viết 1 chương trình cho phép nhập điểm THI JAVA
            9 - 10 = Xuất sắc
            8 - 9 = Giỏi
            7 - 8 = khá
            5 - 7 = trung bình
            0 - 5 = Học lại    
      Hãy giải bài tập này không được sử dụng Else IF hoặc IF. Chỉ được giải bằng IF Else. Và bên trong mỗi IF else đều phải thực thi hành động.
         */
        Scanner sc = new Scanner(System.in);
        double diemThi;
        System.out.print("Mời bạn nhập điểm thi JAVA1: ");
        diemThi = Double.parseDouble(sc.nextLine());
        if (diemThi >= 9 && diemThi <= 10) {
            System.out.println("Xuất sắc");
        } else if (diemThi >= 8 && diemThi < 9) {
            System.out.println("Giỏi");
        } else if (diemThi >= 7 && diemThi < 8) {
            System.out.println("Khá");
        } else if (diemThi >= 5 && diemThi < 7) {
            System.out.println("TB");
        } else if (diemThi >= 0 && diemThi < 5) {
            System.out.println("Học lại");
        }else{
            System.out.println("Bạn vui lòng nhập điểm theo thang điểm 10");
        }
    }
}
