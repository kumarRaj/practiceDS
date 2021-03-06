package com.sunandan.tree;


import java.util.*;
import java.io.*;


/*
Inorder (Left, Root, Right)
Preorder (Root, Left, Right)
Postorder (Left, Right, Root)
*/
class preOrder {
	public static void getPreOrder(Node root) {
        if(root == null) return;
        System.out.print(root.data + " ");
        getPreOrder(root.left);
        getPreOrder(root.right);
    }
	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        getPreOrder(root);
    }	
}
