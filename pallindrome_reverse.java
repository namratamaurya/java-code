package main.java;

public class pallindrome_reverse {
    public static void main(String[] args) {
        link_list a = new link_list('x',null);

        link_list b = new link_list('y',null);
        a.updatenext(b);
        link_list c = new link_list('z',null);
        b.updatenext(c);
        link_list d = new link_list('a',null);
        c.updatenext(d);
        link_list e = new link_list('a',null);
        d.updatenext(e);
        link_list f = new link_list('z',null);
        e.updatenext(f);
        link_list g = new link_list('y',null);
        f.updatenext(g);
        link_list h= new link_list('x',null);
        g.updatenext(h);


        link_list head=a;
        link_list mid=a;
        link_list tail=a;




        while(tail!=null && tail.next!=null){
            tail=tail.next.next;
            mid=mid.next;
        }
        link_list current;
        link_list prev=null;
        link_list nxt=null;
        //break
        if(tail==null){
            current= mid;


        }
        else{
            current= mid.next;
            mid.next=null;

        }




        //reverse
        while(current!=null){
            nxt = current.next;
            current.next=prev;
            prev=current;
            current=nxt;
        }
       tail=prev;




        //compare
        while(tail!=null && head!=null ){
            if(head.val==tail.val){
                System.out.println(head.val);
                System.out.println(tail.val);
                head=head.next;
                tail=tail.next;

            }
            else{
                break;
            }


        }




        //print
        if(tail==null){
           System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }


    }
}
class link_list{
    char val;
    link_list next;
    public link_list(char val, link_list next){
        this.val=val;
        this.next=next;
    }
    void updatenext(link_list next){
        this.next=next;
    }
}