import java.util.*;

class Sum {
    public static void main(String[] args) {
        int[] arr = {1, -1, 0, 2, -1, -4};
        int len = arr.length;

        // Set of lists to store unique triplets
        Set<List<Integer>> uniqueTriplets = new HashSet<>();

        // Iterate through the array
        for (int i = 0; i < len; i++) { // a
            int target = arr[i];
            Set<Integer> s = new HashSet<>();

            for (int j = i + 1; j < len; j++) { // b
                int toFind = -(target + arr[j]);
                if (s.contains(toFind)) {
                    // Store the triplet in a list
                    List<Integer> triplet = Arrays.asList(arr[i], arr[j], toFind);
                    Collections.sort(triplet); // Sorting helps avoid duplicates
                    uniqueTriplets.add(triplet);
                }
                s.add(arr[j]);
            }
        }

        // Print the unique triplets
        for (List<Integer> triplet : uniqueTriplets) {
            System.out.println(triplet);
        }
    }
}
