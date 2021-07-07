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
// Ta viết cái class để cung cấp tiện ích cho
//nơi khác sài , đó là lúc ta k cần nhớ
//cái gì cho riêng ta và hàm static sẽ giúp
// làm điều này
public class MathUtil {
    //n! = 1.2.3.4.5.6...n
    //Quy ước: 0! = 1! = 1
    //K tính đc giai thừa cho số âm
    // 20! là vừa khớp kiểu long, kiểu long tối đa 18 số 0
    //21! lố kiểu long
    // nếu đưa vào âm hay là 21 giai thừa, tao éo tính và ta đập vào mặt
    // một cái ngoại lệ, chửi éo tính được
    
    public static long getFactorial(int n){
        if( n<0 || n>20)
            throw new IllegalArgumentException("Invalid Argument. n must be between 0..20");
        //hàm dùng liền éo cần return
        
        //xuống đây là n = 0..20 òi
        if(n==0 || n==1)
            return 1;
        //xuống đến đây , n = 2..20 òi
        // chơi for hoặc đệ quy - recursion
        // kĩ thuật nhồi con heo đất, ốc bu nhồi thịt
        // 1=2,1=3,1=4,1=n nhồi liên tục i và tích
        long product =1; // tích khởi đầu =1 , nhồi 1,2,3...n
        for (int i = 2; i <= n; i++) 
            product *=i;
//            product = product * i;
            // nhân từ 2 đến n
       return product; 
    }
}
