/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1_LamQuenVoiJava;

/**
 *
 * @author dungna29
 */
public class B2_BienLaGi {

    /*
        Bài 2: Khái niệm về biến và khai báo biến
    1. Khái niệm: Lưu trữ giá trị hoặc tập giá trị và biến được khởi tạo trong bộ
    nhớ ảo của máy (RAM).
    
    2. Công thứ sử dụng: 
            <Kiểu dữ liệu> <Tên biến> = <Giá trị>;
            <Kiểu dữ liệu> <Tên biến 1> = <Giá trị>, <Tên biến 1> = <Giá trị>,<Tên biến n> = <Giá trị>;
            Có thể khai báo nhiều biến có kiểu dữ liệu giống nhau trên cùng 1 dòng
        2.1: <Kiểu dữ liệu>
            + Kiểu số nguyên:byte, short, long, int
            + Kiểu số thực:float, double
            + Kiểu chuỗi và ký tự: String, char
            + Kiểu Logic: boolean
            + Kiểu var: tự định nghĩa theo giá trị
        2.2: <Tên biến>
            + Tên biến phải có nghĩa
            + Tên biến nên là tiếng anh         
            + Tên biến có phân biết chữ hoa chữ thường
            + Tên biến không bắt đầu bởi số và từ khóa
            + Đối với tên biến có 2 từ trở lên:
                - Cách 1: normal = firstname
                - Cách 2: CamelCase = FirstName, firstName
                - Cách 3: Under_Score = first_name, first_Name
            + Biến toàn cục: Khai báo ngoài hàm
                - Bắt buộc phải khai báo có dấu gạch dưới _ trước tên biến:
                Ví dụ: _first_Name, _firstname
            + Biến cục bộ: Khai báo bên trong hàm
        2.2: <Giá trị>: Phải đúng với quy tắc của kiểu dữ liệu.
     */
    String _name = "FPOLY";//Khai báo biến toàn cục

    public static void main(String[] args) {
        //1. String : Chuỗi
        String str1 = "Phát Triển Phần Mềm";//Khai báo 1 biến có kiểu String và có khởi tạo giá trị ban đầu
        String str2;//Khai báo 1 biến kiểu String và không khởi tạo giá trị ban đầu
        //2. Số nguyên:
        int a1 = 56;
        short sh1, sh2 = 5, sh3;
        long l1 = 99;
        //3. Số thực:
        float f1 = 5.6f;
        double d1= 5.9;
        
        //4. Ký tự
        char c1 = 'a';
        
        //5. Logic
        boolean b1 = true;//Bằng true hoặc false
        
        //6. Var kiểu dữ liệu ngầm định
        var v1 = true;
        var v2 = "FPT";
        var v3 = 1;
        var v4 = 'a';
        var v5 = 6.7;
        
    }
}
