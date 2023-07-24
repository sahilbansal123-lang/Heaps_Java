public class Heaps_Intro {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("A Heap is a special Tree-based data structure in which the tree is a complete binary tree.\n" +
                "\n"+
                "Operations of Heap Data Structure:\n" +
                "\n" +
                "Heapify: a process of creating a heap from an array.\n" +
                "Insertion: process to insert an element in existing heap time complexity O(log N).\n" +
                "Deletion: deleting the top element of the heap or the highest priority element, and \n" +
                "then organizing the heap and returning the element with time complexity O(log N).\n" +
                "Peek: to check or find the first (or can say the top) element of the heap.\n" +
                "Types of Heap Data Structure\n" +
                "\n" +
                "Generally, Heaps can be of two types:\n" +
                "\n" +
                "Max-Heap: In a Max-Heap the key present at the root node must be greatest among the keys present at all \n" +
                "of it’s children. The same property must be recursively true for all sub-trees in that Binary Tree.\n" +
                "Min-Heap: In a Min-Heap the key present at the root node must be minimum among the keys present at \n" +
                "all of it’s children. The same property must be recursively true for all sub-trees in that Binary Tree.");
    }
}