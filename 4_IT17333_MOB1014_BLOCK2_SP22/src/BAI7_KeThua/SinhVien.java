/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI7_KeThua;

/**
 *
 * @author dungna29
 */
/*
- Lớp con
- Sử dụng từ khóa extends để kế thừa.
- Java || C# chỉ đơn kế thừa.
 */
public class SinhVien extends Nguoi{
    //Lớp con chỉ có các thuộc tính đăng trưng riêng để miêu tả đối tượng
    private String msv;
    private String nganhHoc;

    public SinhVien() {
    }

    public SinhVien(String msv, String nganhHoc, String ten, String tenDem, String ho, String sdt, String cmt) {
        super(ten, tenDem, ho, sdt, cmt);
        this.msv = msv;
        this.nganhHoc = nganhHoc;
        /*
        this: Dùng để tham chiếu đến thuộc tính, phương thức của lớp hiện tại
        super:Dùng để tham chiếu đến thuộc tính, phương thức của lớp cha
        */
        
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }
    
    
}
