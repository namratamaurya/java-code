package main.java;

import java.util.Stack;

public class hello {

    public static void main(String[] args) {
        String s1=")(";
        parenthesis(s1);
    }

    public static void parenthesis(String s1) {
        char[] a = s1.toCharArray();
        Stack<Character> sc = new Stack<>();

        for (int i = 0; i < a.length ; i++) {
            if (a[i] == '(') {
                sc.push(a[i]);
            }
            else{
                if(!sc.isEmpty()){
                    sc.pop();
                }
                else{
                    System.out.println("invalid");
                    return;
                }

            }

        }

        if(sc.isEmpty()){
            System.out.println("valid");
        }
        else{
            System.out.println("invalid");
        }


    }
}
