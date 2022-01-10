package main.java;


public class doubly {

    public static void main(String[] args) {
        //string
        String str= "123456789009876543211234567890009876543212345678901234567890";
        String str1= "12345678900987654321123456789000987654321234567890123";
        //convert to character array
        char [] a1 = str.toCharArray();
        char [] a2 = str1.toCharArray();
        int n1 = a1.length;
        int n2 = a2.length;
        int sum=0,carry=0;

        //define head and tail
        dll tail=null;
        dll head=null;


            for(int i=n1-1, j=n2-1;i>=0&&j>=0;i--,j--) {

                int a = Integer.parseInt(String.valueOf(a1[i]));
                int b = Integer.parseInt(String.valueOf(a2[j]));

                if (carry == 0) {
                    sum = a + b;
                    carry=sum/10;
                    if (tail == null) {
                        dll obj = new dll(sum%10, null, null);
                        tail = obj;
                        head = obj;
                    } else {
                        dll obj = new dll(sum%10, head, null);
                        head.prev = obj;
                        head = head.prev;

                    }
                } else {
                    sum = a + b + carry;
                    carry=sum/10;
                    if (tail == null) {
                        dll obj = new dll(sum%10, null, null);
                        tail = obj;
                        head = obj;
                    } else {
                        dll obj = new dll(sum%10, head, null);
                        head.prev = obj;
                        head = head.prev;

                    }


                }


            }


        dll temp = head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }





/*


        //make a ll
        for(int i=0;i<n1;i++){


            if(head==null){
                dll obj = new dll (a1[i]-48,null,null);
                tail=obj;
                head=obj;
            }
            else {
                dll obj = new dll (a1[i]-48,null,tail);
                tail.next=obj;
                tail=tail.next;
            }


        }

        dll temp = head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
        */

    }
}
class dll{
    int val;
    dll next;
    dll prev;
    public dll(int val,dll next,dll prev){
        this.val=val;
        this.next=next;
        this.prev=prev;
    }



    public boolean equals (Object another){
        if(this == another){
            return true;
        }
        return false;
    }


}