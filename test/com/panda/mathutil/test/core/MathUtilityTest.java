/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.panda.mathutil.test.core;

import com.panda.mathutil.core.MathUtil;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author LoiDinh
 */
public class MathUtilityTest {
    
    public MathUtilityTest() {
    }
    
    //Đây là class sẽ sử dụng các hàm của thư viện/framwork JUnit
    //để kiểm thử/Kiểm tra code chính
    // -> class core.MathUtil
    
    //@Test JUnit sẽ phối hợp với JVM để chạy hàm này
    //@Test phía hậu trường chính là public static void main()
    //Có nhiều @Test ứng với nhiều testcase khác nhau để kiểm thử
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        int n = 0; 
        long expected = 1;
        
        long actual = MathUtil.getFactorial(n);
        
        // so sách dùng framwork: expected vs actual 
        
        assertEquals(expected, actual);
    }
    
    @Test//(expected = NumberFormatException.class)
    public void testGetFactorialGivenRightArgumentThrowsException() {
        MathUtil.getFactorial(-5);
    }
    
    
    
}
 