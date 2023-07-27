import java.util.PriorityQueue;

public class MinCostNropes {

    public static void minCost(int ropes[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < ropes.length; i++) {
            pq.add(ropes[i]);
        }

        int cost = 0;
        while (pq.size() > 1) {
            int min = pq.remove();
            int min2 = pq.remove();
            cost += min + min2;
            pq.add(min + min2);
        }

        System.out.println("Minimum Cost = " + cost);
    }

    public static void main(String[] args) {
        int ropes[] = {2, 3, 4, 6};
        minCost(ropes);
    }
}
