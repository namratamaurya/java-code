package main.java;

public class cycliccheck {
    public static void main(String[] args) {
        circularly_list a= new circularly_list(1,null);

        circularly_list b= new circularly_list(2,null);
        a.updatenext(b);
        circularly_list c= new circularly_list(3,null);
        b.updatenext(c);
        circularly_list d= new circularly_list(4,null);
        c.updatenext(d);
        circularly_list e= new circularly_list(5,null);
        d.updatenext(e);
        circularly_list f= new circularly_list(6,null);
        e.updatenext(f);
        circularly_list g= new circularly_list(7,d);
        f.updatenext(g);

        circularly_list head2=a;
        circularly_list head = a;
        boolean bool = true;

        while(head2!=null && head2.next!=null){

            if(head.equals(head2)&&bool==false){
                System.out.println("Cyclic");
                head=a;
                while(!head.equals(head2)){
                    head=head.next;
                    head2=head2.next;
                }
                System.out.println(head.val);
                System.out.println(head2.val);
                break;
            }
            head=head.next;
            head2=head2.next.next;
            bool=false;

        }
        if(head2== null || head2.next==null){
            System.out.println("non-cyclic");
        }

    }

}
class circularly_list{
    int val;
    circularly_list next;
    public circularly_list(int val, circularly_list next){
        this.val=val;
        this.next=next;
    }
    void updatenext(circularly_list next){
        this.next=next;
    }
    public boolean equals (Object another){
        if(this == another){
            return true;
        }
        return false;
    }
}