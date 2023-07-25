import java.util.ArrayList;

public class RemoveMin {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i;

            if (left < arr.size() && arr.get(left) < arr.get(minIdx)) {
                minIdx = left;
            }
            if (right < arr.size() && arr.get(right) < arr.get(minIdx)) {
                minIdx = right;
            }

            // this swaping is done when root value is not les than left or right
            if (minIdx != i){
                // swap
                int temp = arr.get(i);
                arr.set(i , arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public void remove() {

            int data = arr.get(0);

            // step1 --> swap first and last node
            int temp = arr.get(0);
            arr.set(0, arr.size()-1);
            arr.set(arr.size()-1, temp);

            // step2 --> remove
            arr.remove(arr.size()-1);

            // heapify
        }
    }

    public static void main(String[] args) {

    }
}
