// https://leetcode.com/problems/contains-duplicate/

import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        return Arrays.stream(nums)
            .boxed()
            .collect(Collectors.toSet())
            .size() < nums.length;
    }
}
