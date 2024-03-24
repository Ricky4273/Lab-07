/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class LinearSearch {

    public static int search(int arr[], int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
        // Todo 01: - complete the implementation of linear search and test your code  
        //         - prvoide asymptotic analysis of the developed solution
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 14, 20};
        int x = 14;
        int index = search(arr, x);
        if (index == -1) {
            System.out.println("Number not found in array.");
        } else {
            System.out.println("Number found at index " + index + " in array.");
        }
    }
}
    // The time complexity is O(n) because it loops through the array once for each element in the array
    // The Space complexity is O(1) because the number of variables doesn't change with the input.
