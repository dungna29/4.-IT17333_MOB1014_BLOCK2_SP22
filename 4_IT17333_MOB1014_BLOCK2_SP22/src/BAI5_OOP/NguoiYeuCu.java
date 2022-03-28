/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI5_OOP;

/**
 *
 * @author dungna29
 */
//Class = dùng để tạo lớp đối tượng, phải viết hoa chữ cái đầu của từ
public class NguoiYeuCu {
    //Phần 1: Liệt kê tất cả các thuộc tính (Thông tin) mà đối tượng cần.
    private String ten;
    private int ns;
    private String sdt;
    private String soThich;
    private int gt;//1 = Nam 0 = Nữ
    private double v1;
    private double v2;
    private double v3;
    private double canNang;
    private String truongHoc;
    
    //Phần 2: Contructor khi mới học luôn có 2 Contructor
 /*
        - Tên Contructor phải giống với tên class và có từ khóa public
        - Khi khởi tạo đối tượng thì Contructor luôn là thành phần chạy đầu tiên
            trong class đối tượng đó.
        - Contructor không tham số dùng để khởi tạo đối tượng ko có giá trị ban đầu
        - Contructor có tham số  để khởi tạo đối tượng có ngay giá trị
        - Nếu khi khởi tạo đối tượng mà đối tượng không có contructor nào thì chương trình sẽ tự động khởi tạo cho đối tượng đó 1 contructor mặc định đó là contructor không tham số.
 */
 
    //2.1 Contructor không tham số: Alt + insert hoặc chuột phải chọn Insert code.->Contructor

    public NguoiYeuCu() {
        //System.out.println("Đây là contructor thành phần đầu tiên khi chạy vào");
    }
    
    //2.2 Contructor có tham số: Alt + insert hoặc chuột phải chọn Insert code.->Contructor - Select All

    public NguoiYeuCu(String ten, int ns, String sdt, String soThich, int gt, double v1, double v2, double v3, double canNang, String truongHoc) {
        this.ten = ten;
        this.ns = ns;
        this.sdt = sdt;
        this.soThich = soThich;
        this.gt = gt;
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.canNang = canNang;
        this.truongHoc = truongHoc;
    }
    
    //Phần 3:Getter và Setter Vì khi thuộc tính bị Priavate muốn lấy và gán giá trị cho nó thì phải sử dụng
  // Alt + Insert chọn Getter và Setter -> Select All

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNs() {
        return ns;
    }

    public void setNs(int ns) {
        this.ns = ns;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getSoThich() {
        return soThich;
    }

    public void setSoThich(String soThich) {
        this.soThich = soThich;
    }

    public int getGt() {
        return gt;
    }

    public void setGt(int gt) {
        this.gt = gt;
    }

    public double getV1() {
        return v1;
    }

    public void setV1(double v1) {
        this.v1 = v1;
    }

    public double getV2() {
        return v2;
    }

    public void setV2(double v2) {
        this.v2 = v2;
    }

    public double getV3() {
        return v3;
    }

    public void setV3(double v3) {
        this.v3 = v3;
    }

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang(double canNang) {
        this.canNang = canNang;
    }

    public String getTruongHoc() {
        return truongHoc;
    }

    public void setTruongHoc(String truongHoc) {
        this.truongHoc = truongHoc;
    }
    
    //Phần 4: Khai báo các phương thức của đối tượng
    void inRaManHinh(){
        System.out.printf("%s | %d | %s | %s Làm nốt\n",ten,ns,sdt,soThich);//Triển khai nốt
    }
}
