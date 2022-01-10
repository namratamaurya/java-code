package main.java;

import java.util.Stack;

public class pallindrome {
    public static void main(String[] args) {
        linklist a = new linklist('n',null);

        linklist b = new linklist('i',null);
        a.updatenext(b);
        linklist c = new linklist('t',null);
        b.updatenext(c);
        linklist d = new linklist('i',null);
        c.updatenext(d);
        linklist e = new linklist('n',null);
        d.updatenext(e);

        Stack<Character> sc = new Stack<>();

        linklist head=a;
        linklist mid=a;
        linklist tail=a;


        while(tail!=null && tail.next!=null){
            tail=tail.next.next;
            mid=mid.next;
        }
        linklist temp = mid;
        mid =mid.next;
        while(mid!=null){

            sc.push(mid.val);
            mid=mid.next;
        }
        while(!sc.isEmpty()){

            if(head.val==sc.pop()){
                head=head.next;
            }
        }

        if(head==temp){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("not a pallindrome");
        }
    }
}

class linklist{
    char val;
    linklist next;
    public linklist(char val, linklist next){
        this.val=val;
        this.next=next;
    }
    void updatenext(linklist next){
        this.next=next;
    }
}
