/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {
    
    public static long getSumOfPrimes(int n){
    // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
    //          Test your solution
    //          Analyze its space and time  
        long sum = 0;
        for (int i = 2; i <= n; i++) {
            boolean prime = true;
            for (int s = 2; s*s <= i; s++) {
                if (i % s == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 12;
        System.out.println("Prime Sum: " + getSumOfPrimes(n));
    }
}
 // The time complexity is O(nsqrtn) because the outer loop iterates n times until i <= n and the inner loop
//  iterates until s*s <= i. The space complexity is also O(1) because the number of variables doesn't change.
    

