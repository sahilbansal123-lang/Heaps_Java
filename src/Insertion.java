import java.util.ArrayList;

public class Insertion {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        // Time Complexity = O(log n)
        public void insert(int data) {
            arr.add(data);

            int x = arr.size() - 1; // child index
            int par = (x - 1) / 2;  // parent index

            while (arr.get(x) < arr.get(par)) {
                // swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par)); // x index pr par index ke element ko add
                arr.set(par, temp);       // par ke index pr x ke index ke element ko add

                x = par;
                par = (x - 1) / 2;
            }
        }

        public void peek() {
            arr.get(0);
        }
    }


    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
    }
}
