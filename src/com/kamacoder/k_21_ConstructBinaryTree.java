package com.kamacoder;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author 花木凋零成兰
 * @title k_21_ConstructBinaryTree
 * @date 2024/7/4 11:12
 * @package com.kamacoder
 * @description 21. 构造二叉树
 */
public class k_21_ConstructBinaryTree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String pre = in.next();
            String inOrder = in.next();
            Map<Character, Integer> inMap = new HashMap<>();
            int preLen = pre.length();
            int inLen = inOrder.length();
            for (int i = 0; i < inLen; ++ i) {
                inMap.put(inOrder.charAt(i), i);
            }
            TreeNode root = buildTree(pre, 0, preLen-1, inMap, 0, inLen-1);
            postOrderTraversal(root);
            System.out.println();
        }
    }
    private static TreeNode buildTree(String pre, int preStart, int preEnd, Map<Character, Integer> inMap, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }
        // 根据前序遍历获取根节点
        char val = pre.charAt(preStart);
        TreeNode root = new TreeNode(val);
        // 获取左右子树区间
        Integer index = inMap.get(val);
        root.left = buildTree(pre, preStart+1, index-inStart+preStart, inMap, inStart, index-1);
        root.right = buildTree(pre, index-inStart+preStart+1, preEnd, inMap, index+1, inEnd);
        return root;
    }
    // 二叉树后序遍历
    private static void postOrderTraversal(TreeNode root) {
        // 后序遍历 左右中
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val);
    }
    public static class TreeNode {
        char val;
        TreeNode right;
        TreeNode left;

        public TreeNode() {
        }

        public TreeNode(char val) {
            this.val = val;
        }
    }
}
