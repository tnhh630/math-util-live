/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpoly.mathutil;

/**
 *
 * @author 84384
 */
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long result = MathUtil.getFactorial(5);
        System.out.println("expected: 5! = 120; actual: " + result);
        System.out.println("expected: 6! = 720; actual: " + MathUtil.getFactorial(6));
        System.out.println("expected: 0! = 1; actual: " + MathUtil.getFactorial(0));
        
        //THÊM CODE SAO LẦN ĐẦU TIÊN LÀM CHUYỆN ẤY 5:49 PM 7/7/2021
        System.out.println("expected: 1! = 1; actual: " + MathUtil.getFactorial(1));
        System.out.println("expected: 3! = 6; actual: " + MathUtil.getFactorial(3));

//        MathUtil.getFactorial(-5); - ném ngoại lệ
        // kĩ thuật kiểm thử phần mềm : ước lượng xem giá trị trả về  của hàm là gì
        //expected value: 5! = 120
        // mày / hàm ai đó viết khi chạy thực tế là mấy - actual , giả sử 120
        //if expected == actual , hàm ngon trong tình huống này
    }

}
