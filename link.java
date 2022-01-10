package main.java;

public class link {
    public static void main(String[] args) {
        linkedlist a = new linkedlist(1, null);

        linkedlist b = new linkedlist(2, null);
        a.updatenext(b);

        linkedlist c = new linkedlist(3, null);
        b.updatenext(c);

         linkedlist head = a;
         linkedlist head2=a;
         linkedlist temp;
        while(head2!=null){
            System.out.println(head2.val);
            head2=head2.next;
        }
        System.out.println();

         if(head.val==1){
             temp=head.next;
             head.next=null;
             head=temp;
         }
         head2=head;

        while (head2.next!= null) {
            if(head2.next.val == 2){
                temp=head2.next.next;
                head2.next=temp;
            }
            head2=head2.next;

        }
        while(head2!=null){
            System.out.println(head2.val);
            head2=head2.next;
        }

    }
}
    class linkedlist{
        int val;
       linkedlist next;
        public linkedlist(int val,linkedlist next){
            this.val=val;
            this.next=next;
        }

        void updatenext(linkedlist next){
            this.next=next;
        }


    }


