/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CHUABAITAP;

import java.util.Scanner;

/**
 *
 * @author dungna29
 */
public class LAB123 {

    static Scanner _sc = new Scanner(System.in);//Biến toàn cục

    public static void main(String[] args) {
        bai1();
    }

    static void bai0() {
        int k1, k2;//Biến cục bộ
        System.out.print("Mời bạn nhập khoảng 1: ");
        k1 = Integer.parseInt(_sc.nextLine());//8
        System.out.print("Mời bạn nhập khoảng 2: ");
        k2 = Integer.parseInt(_sc.nextLine());//6
        //Cách 1: Sử dụng hoán vị
        if (k1 > k2) {
            int temp = k1;
            k1 = k2;
            k2 = temp;
        }
        for (int i = Math.min(k1, k2); i < Math.max(k1, k2); i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d", i, j, i * j);
            }
        }
    }

    static void bai1() {
        int size, arrNumber[];
        System.out.println("Mời bạn nhập số lượng: ");
        size = Integer.parseInt(_sc.nextLine());//Hứng số lượng người dùng nhập
        //Khởi tạo mảng 
        arrNumber = new int[size];//size Bắt buộc là số nguyên
        //arrNumber.length = phải là số nguyên là độ dài của mảng
        for (int i = 0; i < arrNumber.length; i++) {
            System.out.printf("Mời bạn nhập arr[%d]: ", i);
            arrNumber[i] = Integer.parseInt(_sc.nextLine());//Gán giá trị cho phần tử trong mảng
        }

        for (int i = 0; i < arrNumber.length; i++) {
            System.out.print((arrNumber[i] % 2 == 0 ? arrNumber[i] : "") + " ");
        }
        System.out.println("");
        for (var x : arrNumber) {
            System.out.print((x % 2 == 0 ? x : "") + " ");
        }
    }
}
