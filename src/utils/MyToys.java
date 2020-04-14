/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author donglong
 */
public class MyToys {
    //bộ thư viện các hàng xài chung, cho nên chúng là static
    
    //cF: compute factorial, tính n giai thừa n != 1.2.3...n
    //0!  = 1
    //
    public static long cF(int n){
        if(n < 0 || n > 15){
            throw new IllegalArgumentException("Sorry, n must be >= 0");
        }
        if(n == 0){
            return 1;
        }
        //phần còn lại hợp lệ, tính bt
        long product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
            
        }
        return product;
        
    }
    
}
