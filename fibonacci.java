package main.java;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int n1= 0;
        int n2 =1;
        int  sum=n1+n2;
        System.out.println(n1+"/n"+n2);
        System.out.println(sum);
        n1=n2;
        n2=sum;
        fibonacci(sum,n1,n2);

    }

    public static void fibonacci(int sum,int n1,int n2){




    }
}

