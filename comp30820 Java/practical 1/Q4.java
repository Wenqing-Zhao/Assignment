// Store the value entered by the user in an array.
// Set a flag to mark whether the array entered by the user is sorted.
// Iterate the array starting from the element with index 1
// Compare the size of two elements each time. 
// If the latter element is less than the previous one. 
// Change the flag to false, which also means that the array is not sorted

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the n:");
        int n = scanner.nextInt();
        int[] sorting_array = new int[n];
        boolean flag = true;
        for (int i = 0; i < sorting_array.length; i++) {
            System.out.println("Please input number" + i + ":");
            sorting_array[i] = scanner.nextInt();
        }
        for (int i = 1; i < sorting_array.length; i++) {
            if(sorting_array[i] < sorting_array[i - 1]){
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
