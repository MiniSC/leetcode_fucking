

/*
 * @lc app=leetcode.cn id=654 lang=java
 *
 * [654] 最大二叉树
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

 
class Solution {

    public static void main(String[] args) {
        
        System.out.println(new int[]{3,2,1,6,0,5});
    }

    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums, 0, nums.length - 1);

    }

    static TreeNode build(int[] nums , int lo ,int end){
        if(lo>end) return null;
        int num = Integer.MIN_VALUE;
        int index = -1;
        for (int i = lo; i <= end; i++) {
            if(nums[i]>num){
                num = nums[i];
                index = i;
            }
        }
        TreeNode head = new TreeNode(num);
        head.left = build(nums, lo, index-1);
        head.right = build(nums, index+1, end);
        return head;
    }

}

 class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
     }
// @lc code=end

