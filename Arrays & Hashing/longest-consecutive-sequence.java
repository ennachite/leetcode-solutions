import java.util.Set;
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        return numSet.stream()
            .filter(num -> !numSet.contains(num - 1))
            .mapToInt(num -> {
                int length = 0;
                while (numSet.contains(num + length)) {
                    length++;
                }
                return length;
            })
            .max()
            .orElse(0);
    }
}