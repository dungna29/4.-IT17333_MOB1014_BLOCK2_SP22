/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI4_Array_ArrayList_List;

/**
 *
 * @author dungna29
 */
public class B3_ThuatToanNoiBot_BubbleSort {
    public static void main(String[] args) {
        int[] arrNumbers ={33,2,1,0};
        //Xuất mảng chưa sort
        for (int x : arrNumbers) {
            System.out.print(x + " ");
        }
        System.out.println("");
        //Cách 1: Dùng giấy bút, excel, word..... viết từng bước 1
        /*
            33 2 1 0
        i = 0
            arrNumbers[0] > arrNumbers[1] --> 33 > 2 = true
            2 33 1 0
            arrNumbers[0] > arrNumbers[2] --> 2 > 1 = true
            1 33 2 0
            arrNumbers[0] > arrNumbers[3] --> 1 > 0 = true
            0 33 2 1
        i = 1
             arrNumbers[1] > arrNumbers[2] --> 33 > 2 = true
            0 2 33 1
            arrNumbers[1] > arrNumbers[3] --> 2 > 1 = true
            0 1 33 2
        i = 2
             arrNumbers[2] > arrNumbers[3] --> 33 > 2 = true
             0 1 2 33
        i = 3
        */
        //Thuật toán nổi bọt
        for (int i = 0; i < arrNumbers.length - 1; i++) {
            for (int j = i + 1; j < arrNumbers.length; j++) {
                if (arrNumbers[i] > arrNumbers[j]) {
                    int temp = arrNumbers[i];
                    arrNumbers[i] = arrNumbers[j];
                    arrNumbers[j] = temp;
                }
            }
        }
        //Xuất mảng chưa sort
        for (int x : arrNumbers) {
            System.out.print(x + " ");
        }
        
    }
}
