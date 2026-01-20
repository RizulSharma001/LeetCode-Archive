class Solution {
    public int findMaxLength(int[] nums) {
        var m = new java.util.HashMap<Integer,Integer>();
        int s = 0, r = 0;
        m.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            s += nums[i] == 0 ? -1 : 1;
            if (m.containsKey(s)) r = Math.max(r, i - m.get(s));
            else m.put(s, i);
        }
        return r;
    }
}
