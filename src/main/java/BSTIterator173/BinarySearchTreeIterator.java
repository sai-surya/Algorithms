package BSTIterator173;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BinarySearchTreeIterator {

    public BinarySearchTreeIterator(TreeNode root) {

    }

    /** @return the next smallest number */
    public int next() {

        return 0;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {

        return false;
    }
}

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}

/**
 * Your BinarySearchTreeIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */