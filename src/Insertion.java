import java.util.ArrayList;

public class Insertion {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void insert(int data) {
            arr.add(data);

            int x = arr.size() - 1;
            int par = (x - 1) / 2;

            while (arr.get(x) < arr.get(par)) {
                // swap
                int temp = arr.get(x);
                arr.set()
            }
        }
    }


    public static void main(String[] args) {

    }
}
