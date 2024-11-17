// https://leetcode.com/problems/top-k-frequent-elements/

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        return Arrays.stream(nums)
            .boxed()
            .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
            .entrySet()
            .stream()
            .sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue()))
            .limit(k)
            .mapToInt(Map.Entry::getKey)
            .toArray();
    }
}