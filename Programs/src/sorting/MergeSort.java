package sorting;

import java.util.Arrays;

public class MergeSort {

    private static void merge(int[] inputArray, int[] leftHalfArray, int[] rightHalfArray) {

        int leftArraySize = leftHalfArray.length;
        int rightArraySize = rightHalfArray.length;

        int leftArrayIndex = 0;
        int inputArrayIndex = 0;
        int rightArrayIndex = 0;

        while (leftArrayIndex < leftArraySize && rightArrayIndex < rightArraySize) {
            if (leftHalfArray[leftArrayIndex] <= rightHalfArray[rightArrayIndex]) {
                inputArray[inputArrayIndex] = leftHalfArray[leftArrayIndex];
                leftArrayIndex++;
            } else {
                inputArray[inputArrayIndex] = rightHalfArray[rightArrayIndex];
                rightArrayIndex++;
            }
            inputArrayIndex++;
        }

        while(leftArrayIndex < leftArraySize) {
            inputArray[inputArrayIndex] = leftHalfArray[leftArrayIndex];
            leftArrayIndex++;
            inputArrayIndex++;
        }

        while(rightArrayIndex < rightArraySize) {
            inputArray[inputArrayIndex] = rightHalfArray[rightArrayIndex];
            rightArrayIndex++;
            inputArrayIndex++;
        }

    }

    private static void mergeSort(int[] inputArray) {
        int length = inputArray.length;
        int midIndex = length / 2;
        int[] leftHalfArray = new int[midIndex];
        int[] rightHalfArray = new int[length - midIndex];

        if (length < 2) return;

        for (int i = 0; i < midIndex; i++) {
            leftHalfArray[i] = inputArray[i];
        }

        for (int i = midIndex; i < length; i++) {
            rightHalfArray[i - midIndex] = inputArray[i];
        }

        mergeSort(leftHalfArray);
        mergeSort(rightHalfArray);
        merge(inputArray, leftHalfArray, rightHalfArray);
    }


    public static void main(String[] args) {
        int[] inputArray = {5, 6, 2, 3, 5, 8, 69, 52, 3, 54, 8, 2, 3, 7};
        System.out.println("Before Merge Sort");
        printArray(inputArray);
        mergeSort(inputArray);
        System.out.println("After Merge Sort");
        printArray(inputArray);
    }

    private static void printArray(int[] inputArray) {
        Arrays.stream(inputArray).forEach(integer -> System.out.print(integer + " "));
        System.out.println();
    }
}
