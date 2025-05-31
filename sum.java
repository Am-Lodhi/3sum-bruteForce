import java.util.*;

class Sum {
    public static void main(String[] args) {
        int[] arr = { 1, -1, 0, 2, -1, -4 };
        Arrays.sort(arr);
        int len = arr.length;
		// set of lists of integers
        Set<List<Integer>> uniqueTriplets = new HashSet<>();

        for (int i = 0; i < len; i++) { // a
            for (int j = i + 1; j < len; j++) { // b
                for (int k = j + 1; k < len; k++) { // c
                    if (arr[i] + arr[j] + arr[k] == 0) {
					    //stores array values as list
                        List<Integer> triplet = Arrays.asList(arr[i], arr[j], arr[k]);
                        Collections.sort(triplet);  ///sorting list would help recognize duplicates
                        uniqueTriplets.add(triplet); 
                    }
                }
            }
        }

        // Print the unique triplets
        for (List<Integer> triplet : uniqueTriplets) {
            System.out.println(triplet);
        }
    }
}
