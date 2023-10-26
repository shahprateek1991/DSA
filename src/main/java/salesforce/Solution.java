package salesforce;



/*





        Binary Search Tree -> right sorted skew tree
                  7

            5         10

        3      6          11





            6 to 10





        3
          5
            6
              7
                9
                 10


*/

import java.util.Scanner;

public class Solution {

    public static TreeNode pruneTree(TreeNode node, int low, int high) {
        if(node != null) {

            if(node.value >= low && node.value <= high) {
                node.left = pruneTree(node.left, low, high);
                node.right  = pruneTree(node.right, low, high);

                return node;
            }

            if(node.value < low) {
                return pruneTree(node.right, low, high);
            }

            if(node.value > high) {
                return pruneTree(node.left, low, high);
            }
        }

        return null;
    }

    public TreeNode convertToRightSortedSkewedTree(TreeNode root) {
        TreeNode sNode = new TreeNode(-1);
        sNode.left = new TreeNode(0);
        TreeNode result = sNode;
        traverseInOrder(root, sNode);

        result.left = null;

        return result;

    }

    private void traverseInOrder(TreeNode node, TreeNode skewedTreeNode) {
        if(node != null) {
            traverseInOrder(node.left, skewedTreeNode);
            if(skewedTreeNode.left != null) {
                skewedTreeNode.updateValue(node.value);
            } else {
                skewedTreeNode.right = new TreeNode(node.value);
                skewedTreeNode = skewedTreeNode.right;
            }
            traverseInOrder(node.right, skewedTreeNode);
        }
    }

    static class TreeNode {
        private int value;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }

        public void updateValue(int val) {
            this.value = val;
        }

    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(7);
        root.left = new TreeNode(5);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(6);

        root.right = new TreeNode(11);

        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(12);


        TreeNode treeNode = pruneTree(root, 8, 11);

        System.out.println(treeNode);


    }
}

