/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_MAU_CRUD_OOP;

/**
 *
 * @author dungna29
 */
public class NguoiYeuMoi extends Nguoi{
    private String soThich;
    private double canNang;
    private String danhGia;
    
    
    public NguoiYeuMoi() {
    }

    public NguoiYeuMoi(String soThich, double canNang, String ten, int gioiTinh, String sdt) {
        super(ten, gioiTinh, sdt);
        this.soThich = soThich;
        this.canNang = canNang;
    }

    public String getSoThich() {
        return soThich;
    }

    public void setSoThich(String soThich) {
        this.soThich = soThich;
    }

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang(double canNang) {
        this.canNang = canNang;
    }

    public String getDanhGia() {
        return canNang <= 50?"Hơi gầy":canNang <= 80?"Bình thường":"Đáng yêu";
    }

    @Override
    public String toString() {
        return "NguoiYeuMoi{"+ super.toString() + "soThich=" + soThich + ", canNang=" + canNang + ", danhGia=" + getDanhGia() + '}';
    }

    
   
    
    
    
}
