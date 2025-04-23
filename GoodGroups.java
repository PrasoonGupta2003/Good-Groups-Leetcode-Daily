class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 1; i <= n; i++) {
            int sum = digitSum(i);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        int max = 0;
        for (int freq : map.values()) {
            max = Math.max(max, freq);
        }

        int count = 0;
        for (int freq : map.values()) {
            if (freq == max) count++;
        }

        return count;
    }

    private int digitSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
