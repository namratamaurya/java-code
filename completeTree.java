package main.java;

import java.util.Scanner;

public class completeTree {
    static createNode root = null;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int limit =sc.nextInt();
        for(int i=0;i<limit;i++) {
            int value = sc.nextInt();
            root= addElement(root,value);
        }

        System.out.println(ifCompleteTree(root));


    }

    public static createNode addElement(createNode root,int data){
        if(root == null){
            createNode node = new createNode(data,null,null);
            root=node;
            return root;
        }
        else{

            if(data<root.val){
                root.left = addElement(root.left,data);

            }
            else{
                root.right = addElement(root.right,data);
            }
        }
        return root;

    }


    public static boolean ifCompleteTree(createNode node){
        if(node.left == null && node.right == null){
            return true;
        }
        if(node.left==null || node.right==null){

            return false;
        }
            return ifCompleteTree(node.left) && ifCompleteTree(node.right);



    }
}

class createNode{
    int val;
    createNode left;
    createNode right;
    public createNode(int val, createNode left,createNode right){
        this.val=val;
        this.left=left;
        this.right=right;
    }

}