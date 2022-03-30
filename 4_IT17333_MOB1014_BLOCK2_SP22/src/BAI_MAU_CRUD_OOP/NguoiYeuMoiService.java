/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_MAU_CRUD_OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dungna29
 */
//Sẽ code các chức năng của đối tượng vào đây
public class NguoiYeuMoiService {

    //Tất cả các biến toàn cục phải khai báo trên đầu.
    private Scanner _sc;
    private List<NguoiYeuMoi> _lstNYM;
    private NguoiYeuMoi _Nym;
    private String _input;

    public NguoiYeuMoiService() {
        _sc = new Scanner(System.in);
        _lstNYM = new ArrayList<>();
        fake5Data();//Khi lớp này khởi tạo sẽ đổ 5 đối tượng vào trong List
    }

    private void fake5Data() {
        _lstNYM.add(new NguoiYeuMoi("Chơi LOL", 50, "A", 0, "098123"));
        _lstNYM.add(new NguoiYeuMoi("Game", 60, "B", 0, "097123"));
        _lstNYM.add(new NguoiYeuMoi("Đọc sách", 70, "C", 0, "096123"));
        _lstNYM.add(new NguoiYeuMoi("Xem phim", 80, "D", 0, "095123"));
        _lstNYM.add(new NguoiYeuMoi("Nghe nhạc", 90, "E", 0, "098124"));
    }

    public void themMoi() {
        System.out.print("Mời bạn nhập số lượng: ");
        _input = _sc.nextLine();
        for (int i = 0; i < Integer.parseInt(_input); i++) {
            _Nym = new NguoiYeuMoi();//Khởi tạo đối tượng để đổ giá trị do người dùng nhập vào.
            System.out.print("Mời bạn nhập tên: ");
            _Nym.setTen(_sc.nextLine());
            System.out.print("Mời bạn nhập sở thích: ");
            _Nym.setSoThich(_sc.nextLine());
            System.out.print("Mời bạn nhập cân nặng: ");
            _Nym.setCanNang(Double.parseDouble(_sc.nextLine()));
            System.out.print("Mời bạn nhập giới tính (1 = Nam | 0 = Nữ): ");
            _Nym.setGioiTinh(Integer.parseInt(_sc.nextLine()));
            System.out.print("Mời bạn nhập sđt: ");
            _Nym.setSdt(_sc.nextLine());
            //Sau khi nhập xong giá trị cho thuộc tính 1 đối tượng
            _lstNYM.add(_Nym);
        }
    }

    public void inDs() {
        for (NguoiYeuMoi x : _lstNYM) {
            System.out.println(x.toString());
        }
    }

    //Đã làm được chức năng tìm kiếm thì Xoá, Sửa như nhau.
    public void timKiem() {
        System.out.print("Mời bạn nhập số điện thoại: ");
        _input = _sc.nextLine();
        for (int i = 0; i < _lstNYM.size(); i++) {
            if (_lstNYM.get(i).getSdt().equals(_input)) {
                System.out.println(_lstNYM.get(i).toString());
                //break;//Vì sao phải break
                //In cả thông báo không tìm thấy
                return;
            }
        }
        System.out.println("Không tìm thấy");
    }

    public void xoa() {
        System.out.print("Mời bạn nhập số điện thoại: ");
        _input = _sc.nextLine();
        for (int i = 0; i < _lstNYM.size(); i++) {
            if (_lstNYM.get(i).getSdt().equals(_input)) {
                _lstNYM.remove(i);
                System.out.println("Xoá thành công");
                //break;//Vì sao phải break
                //In cả thông báo không tìm thấy
                return;
            }
        }
        System.out.println("Không tìm thấy");
    }

    public void sua() {
        System.out.print("Mời bạn nhập số điện thoại: ");
        _input = _sc.nextLine();
        for (int i = 0; i < _lstNYM.size(); i++) {
            if (_lstNYM.get(i).getSdt().equals(_input)) {
                System.out.println("Mời bạn chọn thuộc tính cần sửa: ");
                System.out.println("1. Tên");
                System.out.println("2. Cân nặng");
                System.out.println("Mời bạn chọn chứuc năng: ");
                _input = _sc.nextLine();
                switch (_input) {
                    case "1":
                        System.out.print("Mời bạn nhập tên cần sửa: ");
                        _Nym.setTen(_sc.nextLine());
                        break;
                    case "2":

                        break;
                    default:
                         System.out.print("Chức năng không tồn tại ");
                }
                System.out.println("Sửa thành công");
                return;
            }
        }
        System.out.println("Không tìm thấy");
    }

}
