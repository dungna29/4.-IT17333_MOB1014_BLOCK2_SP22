/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI3_VONGLAP;

/**
 *
 * @author dungna29
 */
public class B2_FOREACH {
    /*
    Cách gõ: fore + tab
    
    Công thức:  
    for (String arg : args) {
            
        }
    String arg: Kiểu dữ liệu và tên biến, tên biến sẽ đại diện là 1 giá trị
    args: Là Collection hoặc là 1 Array
     */
    public static void main(String[] args) {
        int[] arrNumbers = {99,88,22,1,11};
        //C1. Xuất mảng dùng for
        for (int i = 0; i < arrNumbers.length; i++) {
            System.out.print(arrNumbers[i] + " ");
        }
        System.out.println("");
        //C2. foreach
        for (var x : arrNumbers) {
            System.out.print(x + " ");
        }
        //In bảng cửu chương full bằng 3 vòng lặp.
    }
}
