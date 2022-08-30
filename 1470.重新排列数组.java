/*
 * @lc app=leetcode.cn id=1470 lang=java
 *
 * [1470] 重新排列数组
 */

// @lc code=start
class Solution {
    public int[] shuffle(int[] nums, int n) {
        if (null==nums||nums.length==1){
            return nums;
        }
        int p1 = 0;
        int p2 = n;
        int[] ans = new int[nums.length];
        for(int i = 0 ; i<nums.length;i+=2){
           ans[i] = nums[p1];
           ans[i+1] = nums[p2];
           p1+=1;p2+=1;
        }
        return ans;
    }
}
// @lc code=end

