/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI4_Array_ArrayList_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author dungna29
 */
public class B4_List {
    /*
    Bài List
        - Định nghĩa: List Interface trong Java kế thừa Collection và nó cung cấp các phương thức 
                      để thao tác với các phần tử trong danh sách.
    
        + Phương thứ List    
                    - void add(int index, Object obj) || add(object value) Chèn obj vào trong List đang gọi tại index đã cho. 
                        Bất kỳ phần tử nào đã tồn tại trước tại hoặc trên điểm chèn bị bỏ qua. Vì thế, 
                        không có phần tử nào bị ghi đè.
                    - boolean addAll(int index, Collection c)	Chèn tất cả phần tử của c vào trong List
                        đang gọi tại chỉ mục đã cho. Bất kỳ phần tử nào đã tồn tại trước tại hoặc trên điểm
                        chèn bị bỏ qua. Vì thế, không có phần tử nào bị ghi đè. Trả về true nếu List đang gọi
                        thay đổi và nếu không trả về false.
                    - object get(int index)	Trả về đối tượng được lưu giữ tại index đã 
                        cho bên trong Collection đang gọi.
                    - int indexOf(Object obj)	Trả về index của sự xuất hiện đầu tiên của obj trong List đang gọi.
                        Nếu obj không là một phần tử trong list, -1 được trả về.
                    - int lastIndexOf(Object obj) Trả về index của sự xuất hiện đầu tiên của obj trong List 
                        đang gọi. Nếu obj không là một phần tử trong list, -1 được trả về
                    - ListIterator listIterator()	Sử dụng để trả về một Iterator mà bắt đầu từ phần 
                        tử đầu tiên của list.
                    - ListIterator listIterator(int index)	Sử dụng để trả về một Iterator mà phần tử bắt 
                        đầu từ chỉ số index chỉ định.
                    - object remove(int index)	Gỡ bỏ phần tử tại index từ List đang gọi và trả về phần tử 
                        bị xóa đó. List kết quả được compact lại. Đó là, các chỉ mục của dãy phần tử phụ bị 
                        lượng giảm đi 1.
                    - object set(int index, Object obj)	Gán obj tới vị trí được xác định bởi index bên trong 
                        List đang gọi.
                    - List subList(int start, int end)	Trả về một list mà bao gồm các phần tử từ start tới 
                        end-1 trong List đang gọi. Các phần tử trong list trả về cũng được tham chiếu bởi đối
                        tượng đang gọi.                        
    */
    public static void main(String[] args) {
        //Phần 1: Có loại định kiểu và không định kiểu
        //Cách gõ: List
        
        //1.1 Không định kiểu
        List lstKhongDinhKieu1;//Khai báo
        lstKhongDinhKieu1 = new ArrayList();//Khơi tạo mưới sử dụng được.
        
        //1.2 Có định kiểu
        //ArrayList<int> arr;//Không được phép sử dụng kiểu dữ liệu nguyên thuỷ
        List<Integer> lstInteger = new ArrayList<Integer>();//Khai báo tường minh
        List<String> lstString = new ArrayList<>();//Khai báo không tường minh
        List<Double> arrlstDouble = new ArrayList<Double>();
        
        //Phần 2: Gán giá trị sử dụng phương thức add()
        lstKhongDinhKieu1.add(1);
        lstKhongDinhKieu1.add(true);
        lstKhongDinhKieu1.add("abc");
        lstKhongDinhKieu1.add(8.5);
        lstKhongDinhKieu1.add('a');
        
        
        lstString.add("A");
        lstString.add("B");
        lstString.add("C");
        lstString.add("D");
        lstString.add(0, "W");//Chèn vào 1 vị trí và không phải ghi đè
        
        //Phần 3: Truy xuất phần tử trong ArrAylist với phương thức get(index)
        System.out.println(lstString.get(0));
        System.out.println(lstString.get(1));
        
        //lstKhongDinhKieu1.size() = Số lượng phần tử trong tập giá trị
        for (int i = 0; i < lstKhongDinhKieu1.size(); i++) {
            System.out.println(lstKhongDinhKieu1.get(i));
        }
        
        for (var x : lstString) {
            System.out.println(x);
        }
        
        //Phần 4: 1 vài phương thức hay sử dụng
        lstString.remove(1);//Xoá chữ A trong danh sách
        lstString.clear();//Xoá toàn bộ các phần tử trong danh sách
        lstString = new ArrayList<>();//Khởi tạo lại danh sách đồng nghĩa mất hết các dữ liệu bên trong.
        
        //Sắp xếp
        Collections.sort(lstString);//Sắp xếp xuôi và không có sắp xếp ngược
        Collections.reverse(lstString);//Đảo ngược danh sách
        
        //Để tiến hành chạy in các phần tử thì cần check xem danh sách rỗng hay không
        if (lstString.isEmpty()) {
            System.out.println("Danh sách sách Empty");
            return;
        }
        for (var x : lstString) {
            System.out.println(x);
        }
    }
}
