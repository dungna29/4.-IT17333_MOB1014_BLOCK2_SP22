/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI6_Method;

/**
 *
 * @author dungna29
 */
public class S2_Method_TraVe {
    /*
  Phương thức trả về
           *  Công thức chung:
         *  <Phạm vi truy cập> <Kiểu trả về> <Tên phương thức> (<Danh sách tham số>)
         *  {
         *          Body code
                  return <Giá trị có kiểu của phương thức>;
         *  }
   */
    //Phương thức trả về có tham số và không tham số tư duy như void
    public static void main(String[] args) {
        //Cách sử dụng: Gọi và truyền tham số tương tự như void
        
        //Phải coi phương thức trả về là 1 giá trị hoặc tập giá trị......
        int a = 6;
        System.out.println((a+6));
        
        //Sử dụng:
        S2_Method_TraVe s2 = new S2_Method_TraVe();
        s2.tinhTong(5, 6);// Phương thức trả về là giá trị không thể tự in ra trừ khi thực hiện hành động bên trong phương thức.
        System.out.println(s2.tinhTong(6, 7)+100);
        
        int temp[] = s2.getYears1800_2022();
        for (int i = 0; i < s2.getYears1800_2022().length; i++) {
            System.out.println(s2.getYears1800_2022()[i]);
        }
    }
    //Ví dụ 1:
    public int tinhTong(int a, int b){
        return a+b;
    }
    //Ví dụ 2: Trả ra 1 tập giá trị Năm từ 1800 - 2022
    public int[] getYears1800_2022(){
        int[] arrYears = new int[2023 - 1800];
        int temp = 1800;
        for (int i = 0; i < arrYears.length; i++) {
            arrYears[i] = temp;
            temp++;
        }
        return arrYears;
    }
}
