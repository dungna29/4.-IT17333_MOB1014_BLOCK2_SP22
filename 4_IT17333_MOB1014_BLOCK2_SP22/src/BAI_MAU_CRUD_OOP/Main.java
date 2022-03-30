/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_MAU_CRUD_OOP;

/**
 *
 * @author dungna29
 */
public class Main {
    public static void main(String[] args) {
        //Nơi code menu
        NguoiYeuMoiService nyms = new NguoiYeuMoiService();
        do {
            //nyms.inDs();
            System.out.println("---");
            nyms.themMoi();
            nyms.inDs();
        } while (true);
    }
}
