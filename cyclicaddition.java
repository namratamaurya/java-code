package main.java;

public class cyclicaddition {

    public static void main(String[] args) {
        circular_list a= new circular_list(1,null);

        circular_list b= new circular_list(2,null);
        a.updatenext(b);
        circular_list c= new circular_list(3,null);
        b.updatenext(c);
        circular_list d= new circular_list(4,null);
        c.updatenext(d);
        circular_list e= new circular_list(5,a);
        d.updatenext(e);

        circular_list head = a;
        circular_list head1=a.next;
        circular_list head2=a;
        int count=1;
        while(!head1.equals(head)){
            count++;
            head1=head1.next;
        }


        head1=head1.next;

        int temp =0;

        while(!head1.equals(head)){
            if(count/2==temp){
                circular_list obj = new circular_list(4,null);
                circular_list temp1=head1.next;
                head1.next=obj;
                obj.next=temp1;
                break;
            }
            else{
                temp++;
                head1=head1.next;
            }

        }
        boolean bool = true;


        while(!head2.equals(head) || bool ){
            System.out.println(head2.val);
            head2=head2.next;
            bool = false;
        }


    }
}





class circular_list{
    int val;
    circular_list next;
    public circular_list(int val, circular_list next){
        this.val=val;
        this.next=next;
    }
    void updatenext(circular_list next){
        this.next=next;
    }
    public boolean equals (Object another){
        if(this == another){
            return true;
        }
        return false;
    }
}
