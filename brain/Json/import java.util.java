import java.util.Scanner;

public class ArrayManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Input array elements
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find the index of the largest and smallest elements
        int indexOfLargest = 0, indexOfSmallest = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[indexOfLargest]) {
                indexOfLargest = i;
            }
            if (arr[i] < arr[indexOfSmallest]) {
                indexOfSmallest = i;
            }
        }

        // Swap the largest and smallest elements
        int temp = arr[indexOfLargest];
        arr[indexOfLargest] = arr[indexOfSmallest];
        arr[indexOfSmallest] = temp;

        // Display the modified array
        System.out.println("Array after swapping:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}
