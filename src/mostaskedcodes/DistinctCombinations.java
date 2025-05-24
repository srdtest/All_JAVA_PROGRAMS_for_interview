package mostaskedcodes;


import java.util.*;

public class DistinctCombinations {

   
    	 public static List<List<Integer>> findTriplets(int[] arr) {
    	        Set<List<Integer>> seen = new HashSet<>();
    	        List<List<Integer>> result = new ArrayList<>();
    	        int n = arr.length;

    	        for (int i = 0; i < n; i++) {
    	            for (int j = i + 1; j < n; j++) {
    	                for (int k = j + 1; k < n; k++) {
    	                    int sum = arr[i] + arr[j] + arr[k];
    	                    if (sum == 17) {
    	                        List<Integer> triplet = Arrays.asList(arr[i], arr[j], arr[k]);
    	                        List<Integer> sortedTriplet = new ArrayList<>(triplet);
    	                        Collections.sort(sortedTriplet);
    	                        if (seen.add(sortedTriplet)) {
    	                            result.add(triplet);
    	                        }
    	                    }
    	                }
    	            }
    	        }
    	 
    
    	        return result;
    	    }

    	    public static void main(String[] args) {
    	        int[] array = {1, 2, 4, 6, 5, 12};
    	        List<List<Integer>> triplets = findTriplets(array);

    	        System.out.println("Triplets that sum to 15:");
    	        for (List<Integer> triplet : triplets) {
    	            System.out.println(triplet);
    	        }
    	    }
    	
}