/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.panda.mathutil.core;

/**
 *
 * @author LoiDinh
 */
public class MathUtil {
    //trong class này cung cấp cho ai đó nhiều hàm để xử lí toán học
    //clone class Math của JDK
    //hàm thư viện xài chung cho ai đó, không cần lưu lại trạng thái/giá trị => Static
    //chọn thiết kế là hàm static

    //hàm tính giai thừa !!!
    // n! = 1, 2, 3, 4,..., n
    //không có gia thùa số âm
    // 0! = 1! = 1 quy ước
    //giai thừa hàm đồ thị dốc đứng, tăng nhanh về giá trị  
    // 20! = 18 con số 0, đủ cho kiểu long của java
    // 21! > kiểu long
    // bài này quy ước tính n! trong khoảng từ 0..20
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. N must be between 0..20");
        }

        if (n == 0 || n == 1) {
            return 1; // 0! = 1! = 1 quy ước
        }

        long product = 1; //tích nhân dồn
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
