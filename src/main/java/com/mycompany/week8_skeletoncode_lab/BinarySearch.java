/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class BinarySearch {

    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
    //ToDo 2: Call the above method and test the algorithm  
    // provide time and space analysis

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int key = 4;
        int low = 0;
        int high = arr.length - 1;

        int index = runBinarySearchIteratively(arr, key, low, high);

        if (index == Integer.MAX_VALUE) {
            System.out.println("The key is not in array.");
        } else {
            System.out.println("The key is index " + index);
        }
    }

}
    // The time complexity is O(logn) because the algorithm divides the search by half each time.
    // The space complexity is O(1) because it uses index, low, high, mid, and key which don't change while the program runs.
