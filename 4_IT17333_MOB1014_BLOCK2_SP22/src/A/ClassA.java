/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A;

/**
 *
 * @author dungna29
 */
public class ClassA {
    private int a;//Private chỉ được phép sử dụng bên trong 1 class
    int b;//Default Chỉ được phép gọi bên trong 1 Package
    public int c;//Public được phép sử dụng bên ngoài Package
    protected int d;//Được phép sử dụng bên trong Package nhưng khi ra bên ngoài phải kế thừa thì mới được sử dụng.
}
