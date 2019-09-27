import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class Main
{
    // Function to find the K'th smallest element in the
    // array using max-heap
    public static int findKthSmallest(List<Integer> A, int k)
    {
        // create an empty min-heap and initialize it with all input elements
        PriorityQueue<Integer> pq = new PriorityQueue<>(A);

        // pop from min-heap exactly (k-1) times
        while (--k > 0) {
            pq.poll();
        }

        // return the root of min-heap
        return pq.peek();
    }

    public static void main(String[] args)
    {
        List<Integer> inputArray = Arrays.asList(-9,4,6,1,10,7,3);
        int k = 4;

        System.out.println("K th smallest elemtn is: "+ findKthSmallest(inputArray,k));
    }
}
