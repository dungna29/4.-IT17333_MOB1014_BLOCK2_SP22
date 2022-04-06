/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_8_XuLyChuoi;

/**
 *
 * @author dungna29
 */
public class S4_SoSanh {

    public static void main(String[] args) {
        String[] arrName = {"abc", "ABC", "aba", "Adae"};
        for (String x : arrName) {
            if (x.contains("a")) {
                System.out.print(x + " ");
            }
        }
        System.out.println("");
        for (String x : arrName) {
            if (x.endsWith("a")) {
                System.out.print(x + " ");
            }
        }
        System.out.println("");
        for (String x : arrName) {
            if (x.equalsIgnoreCase("abc")) {
                System.out.print(x + " ");
            }
        }
        System.out.println("");
    }
}
