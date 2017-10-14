package Tree.BinaryTree;

import Utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 解题思路：
 * 用中序遍历遍历整棵二叉树产生一个数组，然后用二分的思想找出答案
 */
public class TwoSumBstEdtion {
    /*
     * @param : the root of tree
     * @param : the target sum
     * @return: two numbers from tree which sum is n
     */
    public int[] twoSum(TreeNode root, int n) {
        // write your code here
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        int i = 0, j = list.size()-1;
        while (i < j) {
            int sum = list.get(i) + list.get(j);
            if(sum < n) {
                i++;
            }else if(sum > n) {
                j--;
            }else {
                int[] res = new int[2];
                res[0] = list.get(i);
                res[1] = list.get(j);
                return res;
            }
        }
        return null;
    }

    public void inorder(TreeNode root, List<Integer> list) {
        if(root == null) {
            return ;
        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}
