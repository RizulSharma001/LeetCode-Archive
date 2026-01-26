class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            int x = nums2[i];
            while(!st.isEmpty() && x > st.peek()){
                int smaller = st.pop();
                map.put(smaller,x);

            }
            st.push(x);
        }
        while(!st.isEmpty()){
            map.put(st.pop(), -1);
        }
        int[] res = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            res[i] = map.get(nums1[i]);
        }
        return res;

    }
}


/* Create empty stack
Create empty hashmap

for each element x in nums2:
    while stack not empty and x > stack.top:
        map[stack.pop()] = x
    push x into stack

while stack not empty:
    map[stack.pop()] = -1

for each element y in nums1:
    answer[i] = map[y]
 */