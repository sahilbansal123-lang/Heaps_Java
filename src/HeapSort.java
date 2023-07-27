public class HeapSort {

    public static void heapSort (int arr[]) {
        // Step1 --> Build heap
        int n = arr.length;
        for (int i = n/2; i >= 0; i--) {
            heapify(arr, i, n);
        }

        // step2 --> Push largest at end
        for (int i = n-1; i >= 0; i--) {
            // Swap First with last
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);
        }
    }

    private static void heapify(int[] arr, int i, int size) {
    }

    public static void main(String[] args) {

    }
}
