
class Solution {
    public int findMaximumXOR(int[] nums) {

        int maxXor = 0;
        int mask = 0;

        for (int i = 31; i >= 0; i--) {

            mask |= (1 << i);

            int candidate = maxXor | (1 << i);

            java.util.HashSet<Integer> set = new java.util.HashSet<>();

            for (int num : nums) {
                set.add(num & mask);
            }

            for (int prefix : set) {
                if (set.contains(prefix ^ candidate)) {
                    maxXor = candidate;
                    break;
                }
            }
        }

        return maxXor;
    }
}
