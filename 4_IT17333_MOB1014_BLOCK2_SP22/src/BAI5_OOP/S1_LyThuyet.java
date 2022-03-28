/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI5_OOP;

/**
 *
 * @author dungna29
 */
public class S1_LyThuyet {
      /*
   LẬP TRÌNH HƯỚNG ĐỐI TƯỢNG OOP
   1. Định nghĩa:
      Lập trình hướng đối tượng (Object Oriented Programing – OOP) là đưa các đối tượng có trong thế giới thực (Sinh Viên, ô tô, chó, mèo, người, hoa......) vào trong lập trình để thao tác với các Đối Tượng(thêm,sửa,xóa....) hoặc với các THUỘC TÍNH của đối tượng.
   2. 4 Tính chất của OOP:
    + Đa hình (Polymorphism): Nó thể hiện rõ nhất khi gọi đến một phương thức của đối tượng giống nhau nhưng kết quả của phương thức đó có thể khác nhau.
        - Nạp chồng (Overloading): Nạp chồng phương thức cùng tên cùng kiểu phương thức nhưng khác tham số truyền vào. Khi đưa đúng số lượng tham số truyền vào sẽ gọi đúng phương thức cần được thực hiện.
        - Ghi đè (Overriding): Ghi đè phương thức có cùng tên cùng tham số giữa lớp cha và lớp con. Các phương thức của lớp con kế thừa từ lớp cha từ kiểu phương thức, tên, tham số truyền vào nhưng tại các lớp con có thể viết lại code hành động khác theo nghiệp vụ của nó với phương thức được kế thừa.
    + Thừa kế (Inheritance): Cho phép định nghĩa một lớp đối tượng dựa trên các thuộc tính có sẵn của một lớp đã có. Trong C# chỉ có đơn kế thừa không có đa kế thừa - 1 con chỉ có 1 cha
    + Đóng gói (Encapsulation):Tức là trạng thái của đối tượng được bảo vệ không cho các truy cập từ code bên ngoài như thay đổi trong thái hay nhìn trực tiếp. Việc cho phép môi trường bên ngoài tác động lên các dữ liệu nội tại của một đối tượng theo cách nào là hoàn toàn tùy thuộc vào người viết mã. Đây là tính chất đảm bảo sự toàn vẹn, bảo mật của đối tượng Trong Java, tính đóng gói được thể hiện thông qua phạm vi truy cập (access modifier). Ngoài ra, các lớp liên quan đến nhau có thể được gom chung lại thành package.
            - Có hai loại modifier trong: access modifiers và non-access modifiers.
                * Có 4 kiểu của java access modifiers:
                    - private
                    - (Mặc định)
                    - protected
                    - public
                * non-access modifiers chẳng hạn static, abstract, synchronized, native, volatile, transient, v.v..
    + Trừu tượng (Abstraction): Trừu tượng có nghĩ là tổng quát hóa một cái gì đó lên. không cần chú ý chi tiết bên trong.
        - Tính trừu tượng là một tiến trình ẩn các chi tiết trình triển khai và chỉ hiển thị tính năng tới người dùng. Tính trừu tượng cho phép bạn loại bỏ tính chất phức tạp của đối tượng bằng cách chỉ đưa ra các thuộc tính và phương thức cần thiết của đối tượng trong lập trình.
        - Tính trừu tượng giúp bạn tập trung vào những cốt lõi cần thiết của đối tượng thay vì quan tâm đến cách nó thực hiện.
        - Trong C#, chúng là sử dụng abstract class và abstract interface để có tính trừu tượng.
        3. Khái niệm
            - Class: Chúng ta có thể xem lớp như một khuôn mẫu (template) của đối tượng (Object). Trong đó bao gồm dữ liệu của đối tượng (fields hay properties) và các phương thức(methods) tác động lên thành phần dữ liệu đó gọi là các phương thức của lớp. Class là từ khóa để khai báo lớp. 
            - Đối tượng (Object): được xem là một thực thể trong thế giới thực.
            - Object bao gồm: Thuộc tính (Attribute/Method)
            - Attribute: Các thuộc tính của đối tượng
            - Phương thức:  Phương thức hay còn gọi là hàm thành viên Một phương thức là một nhóm lệnh cùng nhau thực hiện một tác vụ
            - Từ khóa this trong C# là một biến tham chiếu được sử dụng để tham chiếu tới đối tượng của lớp hiện tại.
     */
    /*
    // Trong thế giới thực
        1. Đối tượng: Bàn, Ghế, Bàn phím, Chuột, Máy tính, Laptop....Động vật, Chó, Mèo, Cá....Người, Sinh Viên, Giảng Viên, Bảo Vệ, Lao Công, Người Yêu, Người Yêu Cũ....
        2. Thông tin: Dùng miêu tả cho đối tượng dễ phân biệt
        3. Hành động: Sẽ luôn đi với động từ để miêu tả hành động cho đối tượng.
    
    // OOP
        1. Đối tượng: Sử dụng từ khoá Class để tạo đối tượng, đối tượng phải là danh từ, bắt buộc Viết hoa chữ cái đầu của từ.
        2. Thông tin: Thay đổi tên gọi của THÔNG TIN thành THUỘC TÍNH và được biểu diễn trong lập trình dưới dạng BIẾN.
        3. Hành động: Biểu diễn dưới dạng Method(Phương thức) và luôn có động từ đứng trước.
    */
    public static void main(String[] args) {
        /*
           Lưu thông tin người yêu cũ
        
        Người yêu cũ 1:
            Tên: Nguyễn Thị A
            Năm sinh: 2000
            Sđt: 123
            Sở thích: Ăn Nhiều
            Giới tính: Nữ
            Vòng 1: 99
            Vòng 2: 90
            Vòng 3: 100
            Cân Nặng: 100
        Người yêu cũ 1:
            Tên: Nguyễn Thị B
            Năm sinh: 2002
            Sđt: 124
            Sở thích: Ít Ăn
            Giới tính: Nữ
            Vòng 1: 70
            Vòng 2: 60
            Vòng 3: 70
            Cân Nặng: 60
        */
        //Phần 1: Khai báo và khởi tạo
        //Phải biết tên đối tượng, đang nằm trong package nào.
        NguoiYeuCu nyc;//Khai báo
        nyc = new NguoiYeuCu();//Khởi tạo đối tượng thì mới dùng được.
        //Đối với contructor không tham số thì không có giá trị ban đầu
        
        //Để gán giá trị thì cần sử dụng phương thức setter
        nyc.setTen("Hoa");
        nyc.setSoThich("Thích ăn");
        nyc.setTruongHoc("FPOLY");
        nyc.inRaManHinh();
        
        //Để lấy giá trị thì dùng getter
        System.out.println(nyc.getTen() + " " + nyc.getTruongHoc());
        
        //Sử dụng contrucotr có tham số để gán giá trị cho đối tượng ngay khi khởi tạo
        NguoiYeuCu nyc1 = new NguoiYeuCu("Hoa", 2000, "0123", "Ăn",0, 70, 60, 80, 70, "BK");
        nyc1.inRaManHinh();
    }
}
