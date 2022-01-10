package main.java;

import java.util.Scanner;

public class tree {
    static Node root = null;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int limit =sc.nextInt();
        for(int i=0;i<limit;i++) {
            int value = sc.nextInt();
            root= addElement(root,value);
        }

        display(root);

        }



    public static Node addElement(Node root,int data){
        if(root == null){
            Node node = new Node(data,null,null);
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


    public static void display(Node node){
        if(node.right==null && node.left==null){
            System.out.println(node.val);
            return;
        }
        if(node.left!=null ){
            display(node.left);
        }
        System.out.println(node.val);
        if(node.right!=null ){
            display(node.right);
        }
    }
}
class Node{
    int val;
   Node left;
   Node right;
    public Node(int val, Node left,Node right){
        this.val=val;
        this.left=left;
        this.right=right;
    }

}