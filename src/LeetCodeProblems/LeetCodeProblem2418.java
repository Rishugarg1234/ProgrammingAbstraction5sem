// LeetCode 2418 — Sort the People

// Approach:
// Using Selection Sort to sort heights in descending order.
// In each pass, find the maximum height and place it at the current position.
// Swap the corresponding names along with the heights to maintain their mapping.

// Time Complexity: O(n^2) — we search the remaining array for the maximum in each pass.
// Space Complexity: O(1) — sorting is done in-place without using extra space.

package LeetCodeProblems;

public class LeetCodeProblem2418 {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i=0;i<heights.length-1;i++){
            int maxIndex = i;
            for(int j=i+1;j<heights.length;j++){
                if(heights[j]>heights[maxIndex]){
                    maxIndex = j;
                }
            }
            int tempHeight = heights[i];
            heights[i] = heights[maxIndex];
            heights[maxIndex] = tempHeight;

            String tempNames = names[i];
            names[i] = names[maxIndex];
            names[maxIndex] = tempNames;

        }
        return names;
    }
}
