/*
 * @lc app=leetcode.cn id=33 lang=java
 *
 * [33] 搜索旋转排序数组
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        if(nums==null) return -1;
       int left = 0;
       int right=nums.length-1;
       if(nums[0]==target) return 0;
       while(left <= right){
        if(nums[left] == target){
            return left;
        }
        if(nums[right] == target){
            return right;
        }
        left++;
        right--;
       }
       
       return -1;
    }
}
// @lc code=end

