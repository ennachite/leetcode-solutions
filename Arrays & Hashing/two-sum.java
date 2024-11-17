// https://leetcode.com/problems/two-sum/

import java.util.stream.IntStream;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        return IntStream.range(0, nums.length)
            .boxed()
            .flatMap(i -> IntStream.range(i + 1, nums.length)
                .filter(j -> nums[i] + nums[j] == target)
                .mapToObj(j -> new int[]{i, j})
            )
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("No two sum solution"));
    }
}
