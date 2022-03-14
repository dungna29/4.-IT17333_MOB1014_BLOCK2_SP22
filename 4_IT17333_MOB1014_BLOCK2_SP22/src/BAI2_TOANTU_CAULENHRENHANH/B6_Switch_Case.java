/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2_TOANTU_CAULENHRENHANH;

import java.util.Scanner;
import javax.sound.midi.SysexMessage;

/**
 *
 * @author dungna29
 */
public class B6_Switch_Case {
     /*
       Switch Case là 1 câu lệnh rẽ nhánh
        
       Công thức: sw + tab
    
        switch (<Biểu thức>) {
            case <Giá trị 1>:  
                Thực hiện 1 hành động nào đó
                break; - Sau khi thực hiện 1 hành động xong thì sẽ thoát khỏi Switch
            case <Giá trị 2>:                
                break;
            ..........
            case <Giá trị n>:                
                break;
            default:
                Khi chọn các case không thỏa mãn thì sẽ chạy vào đây                
        }
   */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        do {
            System.out.println("Menu gọi món");
            System.out.println("1. Phở bò");
            System.out.println("2. Bún");
            System.out.println("3. Cơm rang");
            System.out.println("4. Thoát");
            System.out.print("Mời bạn chọn món: ");
            input = sc.nextLine();
            switch (input) {
                case "1":
                    System.out.println("Bạn chọn món Phở");
                    break;
                case "2":
                    System.out.println("Bạn chọn món Bún");
                    break;
                case "3":
                    System.out.println("Bạn chọn món Cơm");
                    break;
                case "4":
                    System.out.println("Hẹn bạn lần sau");
                    //System.exit(0);
                    break;
                default:
                     System.out.print("Món bạn chọn không tồn tại ");
                    break;
            }
        } while (!input.equals("4"));
    }
}
