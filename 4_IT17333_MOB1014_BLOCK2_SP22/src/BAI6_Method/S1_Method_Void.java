/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI6_Method;

/**
 *
 * @author dungna29
 */
public class S1_Method_Void {

    /*
         *  Bài Phương thức - Method
         *  Định nghĩa: 1 tập các câu lệnh cùng nhau thực hiện 1 tác vụ nào đó.
         *  LỢI ÍCH: - Giúp quản lý code tốt hơn
         *           - Tái sử dụng
         *
         *  Công thức chung:
         *  <Phạm vi truy cập> <Kiểu trả về> <Tên phương thức> (<Danh sách tham số>)
         *  {
         *          Body code
         *  }
    
         * <Phạm vi truy cập> - Access Modifier:Public,Private,Protected, Default
         *
         * <Kiểu trả về> : có 2 kiểu trả về và không trả về
         *          - Kiểu không trả về: void
         *          - Kiểu trả về: là giá trị(int,string,double....) hoặc tập giá trị(Array,List.....) hoặc đối tượng(class) và còn nhiều kiểu khác.
         *
         * <Tên phương thức>: Tên động từ viết thường + tên hàm viết hóa chữ cái đầu của từ
         * <Danh sách tham số>: Phương thức có thể có tham hoặc không tham số và lưu ý khi sử dụng tham số thì khi gọi phương thức thì phải truyền đúng vị trí của tham số.
     */
    public static void main(String[] args) {
        //Phần 1: Để sử dụng được phương thức cần biết tên phương thức, phương thức đang nằm trong class nào.
        S1_Method_Void s1 = new S1_Method_Void();
        //s1.tinhTong; Kết thúc của phương thức bắt buộc phải ();
        s1.tinhTong();

        //Phần 2: Đối với phương thức có tham số
        /*
            1. Truyền đủ tham số, đúng kiểu dữ liệu và thứ tự.
         */
        //s1.tinhTong(1); Truyền thiếu tham số vì phương thức không có loại có 1 tham số
        s1.tinhTong(5, 9);
        s1.tinhTong(5, 9, 10);
        s1.tinhTong(5, 9, "a");
        s1.tinhTong(5, 9, 12, 11);
        //Để phân biết được khi gọi vào phương thức nào trong nạp chồng thì sẽ dựa theo số lượng tham số và kiểu dữ liệu khi truyền vào,
        
        //Kinh nghiệm: Khi nào thì nên tách phương thức để tái sử dụng - Khi nhìn thấy những đoạn code giống nhau được lặp lại trên nhiều phương thức hoặc trên nhiều file thì nên nhóm đoạn code giống nhau đó thành 1 phương thức chung.
    }

    //A: Phương thức không trả về không tham số
    public void tinhTong() {//() không tham số
        int a = 5, b = 9;
        System.out.printf("%d + %d = %d", a, b, a + b);
    }

    //B: Phương thức không trả về có tham số
    //Phương thức dưới đây là nạp chồng (Overloading): Cùng tên, cùng kiểu phương thức nhưng phải khác tham số truyền vào thì sẽ sử dụng được.
    public void tinhTong(int a, int b) {
        System.out.printf("%d + %d = %d", a, b, a + b);
    }

    public void tinhTong(int a, int b, int c) {
        System.out.printf("%d + %d + %d= %d", a, b, c, a + b + c);
    }

    public void tinhTong(int a, int b, String c) {
        System.out.println("Phương thức đang code 1");
    }

    public void tinhTong(int a, int b, int c, int d) {
        System.out.println("Phương thức đang code 2");
    }

    //Ngoài ra các tham số phương thức có thể là rất nhiều kiểu dữ liệu khác nhau.
}
