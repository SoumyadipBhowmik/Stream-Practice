package sorting;

import java.util.Arrays;

public class MergeSort {

    private static void merge(int[] inputArray, int[] leftHalfArray, int[] rightHalfArray) {
        int leftHalfArraySize = leftHalfArray.length;
        int rightHalfArraySize = rightHalfArray.length;

        int leftHalfArrayIndex = 0;
        int rightHalfArrayIndex = 0;
        int inputArrayIndex = 0;

        while (leftHalfArrayIndex < leftHalfArraySize && rightHalfArrayIndex < rightHalfArraySize) {
            if (leftHalfArray[leftHalfArrayIndex] <= rightHalfArray[rightHalfArrayIndex]) {
                inputArray[inputArrayIndex] = leftHalfArray[leftHalfArrayIndex];
                leftHalfArrayIndex++;
            } else {
                inputArray[inputArrayIndex] = rightHalfArray[rightHalfArrayIndex];
                rightHalfArrayIndex++;
            }
            inputArrayIndex++;
        }

        while (leftHalfArrayIndex < leftHalfArraySize) {
            inputArray[inputArrayIndex] = leftHalfArray[leftHalfArrayIndex];
            inputArrayIndex++;
            leftHalfArrayIndex++;
        }

        while (rightHalfArrayIndex < rightHalfArraySize) {
            inputArray[inputArrayIndex] = rightHalfArray[rightHalfArrayIndex];
            inputArrayIndex++;
            rightHalfArrayIndex++;
        }
    }

    private static void mergeSort(int[] inputArray) {

        int lengthOfInputArray = inputArray.length;
        int midIndex = lengthOfInputArray / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[lengthOfInputArray - midIndex];

        if (lengthOfInputArray < 2) {
            return;
        }

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = inputArray[i];
        }

        for (int i = midIndex; i < lengthOfInputArray; i++) {
            rightHalf[i - midIndex] = inputArray[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(inputArray, leftHalf, rightHalf);
    }


    public static void main(String[] args) {
        int[] inputArray = {2, 3, 5, 7, 88, 1, 33, 2, 55, 4, 12, 6, 5, 40};
        System.out.println("Before Merge Sort");
        printArray(inputArray);
        mergeSort(inputArray);
        System.out.println("After Merge Sort");
        printArray(inputArray);
    }

    private static void printArray(int[] inputArray) {
        Arrays.stream(inputArray).forEach((integer) -> System.out.print(integer + " "));
        System.out.println();
    }
}
