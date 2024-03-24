/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 * @author MoaathAlrajab
 */
public class BubbleSort {

    public static void bubbleSort(int a[], int size) {
        int outer, inner, temp;
        for (outer = size - 1; outer > 0; outer--) { // counting down
            for (inner = 0; inner < outer; inner++) { // bubbling up
                //ToDo 3: complete this algorithm, test it, provide its time complexity
                if (a[inner] > a[inner + 1]) {
                    temp = a[inner];
                    a[inner] = a[inner + 1];
                    a[inner + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 6, 3, 8};
        int size = arr.length;

        System.out.println("Unsorted array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        bubbleSort(arr, size);

        System.out.println("\nSorted array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

    // The time complexity is O(n^2) because the algorithm iterates the outer loop n times and the inner loop n times as well.