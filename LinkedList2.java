public class LinkedList2 {
    public class Node{
        int val;
        Node next;

        Node(int val){
            this.val=val;
            next=null;
        }
    }
    private Node Head;
    private Node Tail;
    public  void add(int val){
         Node temp  =new Node(5);
        if(Head==null){
        
         Head=Tail=temp;
        }
        else{
            
   Head.next = temp;
   Tail = Tail.next;
        }
    }
    // Function To Print An
    public void print(){
        Node temp = Head;
        while(temp!=null){
            System.out.print(temp.val);
            temp = temp.next;
        }
    }

    public static void main(String[]args){
        LinkedList2 L1 = new LinkedList2();
        L1.add(5);
        L1.add(10);
            L1.add(15);
                L1.add(20);
               L1.print();

    }
}
