/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.panda.mathutil.main;

import com.panda.mathutil.core.MathUtil;

/**
 *
 * @author LoiDinh
 */
public class Main {
    public static void main(String[] args) {
        //Thử nghiệm hàm tính giai thừa coi chạy đúng như thiết kế ko
        //ta phải đưa ra các tình huống sửa dụng hàm trong thực tế
        //Ví dụ: 
        //     input -5, 20, 21
        //TEST CASE: Một tình huống hàm/app/màn hình/tính năng được đưa vào sử dụng giả lâp hành vi xài của ai đó!
        
        // TEST CASE: Là 1 tình huống sử dụng, xài app/(HÀM) mà nó bao gồm: 
        //           + INPUT: Data dầu vào cụ thể nào đó
        //           + OUTPUT: Đầu ra ứng với xử lí của hàm/chức năng của app, dĩ nhiên dùng đầu vào để xử lí
        //           + Kỳ vọng: Hàm sẽ trả về VALUE nào đó ứng với INPUT ở trên
        //           + So sanh để xem kết quả có như kì vọng hay không
        
        
        
        
        long expected = 120; //kết quả mong đợi - Đây là kết quả mà bạn muốn hoặc nghĩ hàm phải trả về nếu nó hoạt động đúng.
        int n = 5; // INPUT
        
        long actual = MathUtil.getFactorial(n);
       
        System.out.println("5! = " + expected + " Expected");
        System.out.println("5! = " + actual + " Actual");
        
    } 
    
    
}
