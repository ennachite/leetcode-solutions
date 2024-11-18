// https://leetcode.com/problems/valid-anagram/

import java.util.Optional;
import java.util.stream.Collectors;

class Solution {
    public boolean isAnagram(String s, String t) {
        return Optional.ofNullable(s)
                .filter(s1 -> s1.length() == t.length())
                .map(s1 -> s1.chars()
                        .boxed()
                        .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                        .equals(
                                t.chars()
                                        .boxed()
                                        .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                        )
                )
                .orElse(false);
    }
}