package main.java;

public class cyclic {
    public static void main(String[] args) {
        linkedlist1 a = new linkedlist1(1, null,null);

        linkedlist1 b = new linkedlist1(2, null,a);
        a.updatenext(b);
        b.updateprev(a);

        //linkedlist1 c = new linkedlist1(3, null);
       // b.updatenext(c);

       // linkedlist1 d= new linkedlist1(4, null);
        //c.updatenext(d);

       // linkedlist1 e= new linkedlist1(5, null);
       // d.updatenext(e);

      //  linkedlist1 f= new linkedlist1(6, d);
       // e.updatenext(f);

        linkedlist1 head2=a.next;
        linkedlist1 head = a;

        while(head2!=null && head2.next!=null){

            if(head.equals(head2)){
                System.out.println("Cyclic");
                break;
            }
            head=head.next;
            head2=head2.next.next;


        }
        if(head2== null || head2.next==null){
            System.out.println("non-cyclic");
        }

    }

}
class linkedlist1{
    int val;
    linkedlist1 next;
    linkedlist1 prev;
    public linkedlist1(int val,linkedlist1 next,linkedlist1 prev){
        this.val=val;
        this.next=next;
        this.prev=prev;
    }

    void updatenext(linkedlist1 next){
        this.next=next;
    }
    void updateprev(linkedlist1 prev){
        this.prev=prev;
    }

    public boolean equals (Object another){
        if(this == another){
            return true;
        }
        return false;
    }


}

