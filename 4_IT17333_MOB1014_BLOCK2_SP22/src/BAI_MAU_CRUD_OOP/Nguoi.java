/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_MAU_CRUD_OOP;

/**
 *
 * @author dungna29
 */
public class Nguoi {
    private String ten;
    private int gioiTinh;
    private String sdt;

    public Nguoi() {
    }

    public Nguoi(String ten, int gioiTinh, String sdt) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return  "ten=" + ten + ", gioiTinh=" + gioiTinh + ", sdt=" + sdt + ", ";
    }
    
    
}
