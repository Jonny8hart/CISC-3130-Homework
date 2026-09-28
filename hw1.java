public class hw1 {
    public static void main(String[] args) {
        int[] numbers = {12, 7, 5, 3, 9, 2, 1, 8, 4, 6, 11, 10};

        System.out.println("Original Array:");
        printArray(numbers);
        System.out.println();

        int[] bubbleSorted = bubbleSort(numbers.clone());
        System.out.println("Bubble Sort Result:");
        printArray(bubbleSorted);
        System.out.println();

        int[] mergeSorted = mergeSort(numbers);
        System.out.println("Merge Sort Result:");
        printArray(mergeSorted);
        System.out.println();

        int[] targets = {12, 10, 100};
        System.out.println("Linear Search");
        System.out.println();
        for (int target : targets) {
            System.out.println("Searching for " + target);
            int[] searchResult = linearSearch(numbers, target);
            if (searchResult[0] == -1) {
                System.out.println("Target not found.");
            } else {
                System.out.println("Target found at index " + searchResult[0]);
            }
            System.out.println();
        }

        int[] binaryTargets = {1, 10, 100};
        System.out.println("Binary Search");
        System.out.println();
        for (int binaryTarget : binaryTargets) {
            int binaryResult = binarySearch(mergeSorted, binaryTarget);
            System.out.println("Searching for " + binaryTarget);
            if (binaryResult == -1) {
                System.out.println("Target not found.");
            } else {
                System.out.println("Target found at index " + binaryResult);
            }
            System.out.println();
        }
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    //bubble sort
    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    //merge sort
    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }

        left = mergeSort(left);
        right = mergeSort(right);
        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                merged[k++] = left[i++];
            } else {
                merged[k++] = right[j++];
            }
        }
        while (i < left.length) {
            merged[k++] = left[i++];
        }
        while (j < right.length) {
            merged[k++] = right[j++];
        }
        return merged;
    }

    //linear search
    public static int[] linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return new int[]{i};
            }
        }
        return new int[]{-1}; 
    }

    //binary search
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int middle = (low + high) / 2;

            if (arr[middle] == target) {
                return middle;
            } else if (target < arr[middle]) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }

        return -1;
    }
}