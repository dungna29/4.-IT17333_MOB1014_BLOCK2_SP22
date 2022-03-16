/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_4_Array_ArrayList_List;

/**
 *
 * @author dungna29
 */
public class B1_Array {

    /*
         * Phần 1: Mảng 1 chiều
         *
         *  1. Định nghĩa: Mảng dùng để lưu trữ nhiều phần tử có cùng kiểu dữ liệu (Biến dùng để lưu trữ 1 giá trị có cùng kiểu dữ liệu).
         *          - Để truy xuất (để lấy giá trị) các phần tử thì cần phải biết chỉ số(index). Index là số nguyên và bắt đầu từ 0 1 2 3....
                    - Hai câu lệnh đi kèm vòng lặp: 
                      break; Ngắt vòng lặp
                      continue; Bỏ qua đoạn code phía sau và chạy sang vòng lặp tiếp theo
         *
         *  2. Khai báo 1 mảng trong JAVA:
         *          - Cách 1:
         *              <Kiểu dữ liệu>[] arr<Tên Mảng>; || <Kiểu dữ liệu> arr<Tên Mảng>[];
         *              arr<Tên Mảng> = new <Kiểu dữ liệu>[length];//Khởi tạo mảng có kích thước.
         *          - Cách 2: 
         *              <Kiểu dữ liệu>[] arr<Tên Mảng> = new <Kiểu dữ liệu>[length];
         *
         *          - Cách 3:
         *     <Kiểu dữ liệu>[] arr<Tên Mảng> = new <Kiểu dữ liệu>[] {value1,value2..,valuen};//Khởi tạo mảng kiểu tường minh.
         *
         *     
         *
         *  3. Truy xuất các phần tử trong mảng
         *      - Gán giá trị cho mảng:
         *           <tên mảng>[index] = Giá trị cần gán.
         *   
         *     - Lấy giá trị trong mảng:
         *          <tên mảng>[index] = Giá trị của mảng tại vị trí.
         *      Lưu ý: Để lấy nhiều giá trị trong mảng xuất ra cần sử dụng vòng lòng.
         *
         *  4. Kích thước hoặc độ dài của mảng sử dụng thuộc tính length.
         *      <tên mảng>.length = kích thước mảng có kiểu số nguyên
     */
    public static void main(String[] args) {
        //Phần 1: Khai báo biến -  <Kiểu dữ liệu> <Tên biến> = <Giá trị>;
        int a = 5;

        //Phần 2: Khai báo mảng
        int[] arrNumbers;//Khai báo mảng và chưa sử dụng được
        arrNumbers = new int[5];//Khởi tạo mảng 5 phần tử

        String arrNames1[] = new String[9];
        String arrNames2[] = {"JAVA1", "JAVA2", "JAVA3"};//Khai báo không tường minh
        String arrNames3[] = new String[]{"JAVA1", "JAVA2", "JAVA3"};//Khai báo tường minh.

        var arrTemp1 = new String[]{"JAVA1", "JAVA2", "JAVA3"};
        var arrTemp2 = new Double[]{5.6, 7.2};
        int arrTemp3[], arrTemp4[] = new int[5];

        //Phần 3: Gán giá trị thông qua index
        //arrNumbers = 5; Bên trái là kiểu dữ liệu mảng bên phải là giá trị đơn
        arrNumbers[0] = 9;//Gán giá trị vào index 0
        arrNumbers[1] = 91;
        arrNumbers[2] = 92;
        arrNumbers[3] = 93;
        arrNumbers[0] = 94;//Ghi đè giá trị vào index 0

        //Phần 4: Lấy giá trị - Lưu giá trị vào index nào thì lấy ra ở index đó
        System.out.println((arrNumbers[2] + 1000));

        //In mảng
        for (int i = 0; i < arrNumbers.length; i++) {
            System.out.print(arrNumbers[i] + " ");
        }
        System.out.println("");
        //foreach
        for (int x : arrNumbers) {
            System.out.print(x + " ");
        }
        System.out.println("");
        //In các phần tử lẻ
        for (int x : arrNumbers) {
            if (x % 2 != 0) {
                System.out.print(x + " ");
            }
        }
        System.out.println("");
        for (int x : arrNumbers) {
            if (x % 2 == 0) {
                continue;
            }
            System.out.print(x + " ");
        }
        
        System.out.println("");
        for (int x : arrNumbers) {
            System.out.print(((x % 2 != 0) ? x : "")+ " ");
        }
    }
}
