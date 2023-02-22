// Create an array, and set its position to 0
// Because 2 is a prime number, so store it directly in the first position of the array
// Set the variable named num to start from 0 and plus one each time in the loop
// Iterate over num, if there is no number that can be divided by num, add num to the array
// When the last element in the array is not 0, print the array to the console.

public class Q3 {
    public static void main(String[] args) {
        int num = 0;
        int index = 1;
        int[] primeArray = new int[10];
        primeArray[0] = 2;
        while (true) {
            if (primeArray[9] != 0) {
                break;
            } else {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        break;
                    }
                    if (i == num - 1) {
                        primeArray[index] = num;
                        index++;
                    }
                }
                num++;
            }
        }
        for (int i = 0; i < primeArray.length; i++) {
            System.out.print(primeArray[i] + " ");
        }
    }
}
