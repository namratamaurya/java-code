package main.java;

public class merge {
    public static void main(String[] args) {
        linked_list a1= new linked_list(1,null);

        linked_list b1 = new linked_list(3,null);
        a1.updatenext(b1);
        linked_list c1 = new linked_list(5,null);
        b1.updatenext(c1);


        linked_list a2= new linked_list(2,null);

        linked_list b2 = new linked_list(4,null);
        a2.updatenext(b2);
        linked_list c2= new linked_list(6,null);
        b2.updatenext(c2);




        linked_list cur1=a1;

        linked_list cur2=a2;

        linked_list head3=null;

        linked_list cur3=null;



        while(cur1!=null || cur2!=null){
            if(cur1!=null && cur2!=null) {

                if (cur1.val <= cur2.val) {
                    linked_list obj = new linked_list(cur1.val, null);
                    //System.out.println(obj.val);
                    if (head3 == null) {
                        head3 = obj;
                        cur3 = obj;
                        cur1 = cur1.next;
                    } else {
                        head3.next = obj;
                        head3 = head3.next;
                        cur1 = cur1.next;
                    }


                } else {
                    linked_list obj = new linked_list(cur2.val, null);
                    //System.out.println(obj.val);
                    if (head3 == null) {
                        head3 = obj;
                        cur3 = obj;
                        cur2 = cur2.next;
                    } else {
                        head3.next = obj;
                        head3 = head3.next;
                        cur2 = cur2.next;
                    }
                }
            }

            else if(cur1==null){
                linked_list obj = new linked_list(cur2.val, null);
                head3.next = obj;
                head3 = head3.next;
                cur2 = cur2.next;
            }
            else{
                linked_list obj = new linked_list(cur1.val, null);
                head3.next = obj;
                head3 = head3.next;
                cur1 = cur1.next;
            }
        }


       while(cur3!=null){
           System.out.println(cur3.val);
           cur3=cur3.next;
       }


    }
}
class linked_list{
    int val;
    linked_list next;
    public linked_list(int val, linked_list next){
        this.val=val;
        this.next=next;
    }
    void updatenext(linked_list next){
        this.next=next;
    }
}