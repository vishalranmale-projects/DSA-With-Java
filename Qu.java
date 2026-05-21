//1)implimentention of Queue with An O(n) TC Using An Array
// public class QueueB{
//     public static class Queue{
//         public static int n;
//       public static  int arr[];
//          public static int Rear;
//          public static int size;
//         public Queue(int Size){
//            arr=new int[Size];
//             size=Size;
//            Rear=-1;
//         }
//         //IsEmpty Function
//         public static boolean isEmpty(){
//             if(Rear==-1){
//              return true;
//             }
//             else{
//                 return false;
//             }
//         }
//         //Add Function
//         public static void Add(int Data){
//             if(Rear==size-1){
//                 System.out.print("Queue is Empty");
//             }
//             else{
//                 Rear=Rear+1;
//                 arr[Rear]=Data;
//             }
//         }
//         //Remove Function
//         public static int Remove(){
//             if(Rear==-1){
//                 return -1;
//             }
//             int Data=arr[0];
//             for(int i=0;i<arr.length-1;i++){
//                 arr[i]=arr[i+1];
//             }
//             Rear--;
//             return Data;
//         }
//         //Peek Function
//         public static int peek(){
//             if(Rear==-1){
//                 return -1;
//             }
//             else{
//                 return arr[0];
//             }
//         }
//     }
//     public static void main(String[]args){
//         Queue Q1=new Queue(5);
//         Q1.Add(5);
//         Q1.Add(10);
//         Q1.Remove();
//         while(!Q1.isEmpty()){
//             System.out.print(Q1.Remove()+" ");
//         }
//     }
// }
/* 
2)Implementation of An Circular Queue 
public class QueueB{
    public static class Circular{
        public static int arr[];
        public static int front=-1;
        public static int Rear=-1;
        public static int size;
        public Circular(int Size){
            size=Size;
            arr=new int[size];
        }
        //Check Empty or Not
        public static boolean isEmpty(){
            if(front==-1 && Rear==-1){
                return true;
            }
            else{
                return false;
            }
        }
        //Check Full or Not
        public static boolean isFull(){
            if(((Rear+1)%size)==front){
                return true;
            }
            else{
                return false;
            }
        }
        //Add
        public static void Add(int data){
            if(isFull()){
                System.out.print("que is full");
                return;
            }
            if(front==-1){
                front=0;
            }
            Rear=(Rear+1)%size;
            arr[Rear]=data;
        }
        //Remove
        public static int Remove(){
            if(isEmpty()){
                return -1;
            }
            else{
                int data=arr[front];
                if(front==Rear){
                   front=-1 ;
                   Rear=-1;
                }
                else{
                front=(front+1)%size;
                }
                return data;
            }
        }
        //Peek Function
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            int data=arr[front];
            return data;
        }
    }
    public static void main(String[]args){
        Circular C1=new Circular(5);
        C1.Add(5);
         C1.Add(5); C1.Add(5); C1.Add(5); 
          C1.Add(5);
         System.out.print(C1.peek());
    }
}
//Queue using An LinkedList
public class QueueB{
    public static class Node{
        int data;
        Node next=null;
        public Node(int data){
            this.data=data;
        }
       
    }
    //Actual Queue
    public static class Queue{
        public static Node Front;
       public static Node Rear;
        //isEmpty
        public static boolean isEmpty(){
            if(Front==null && Rear==null){
                return true;
            }
            return false;
        }
        //Add
        public static void Add(int data){
            Node newnode= new Node(data);
            if(Front ==null && Rear==null){
               Front=newnode;
               Rear=newnode;
               return;
            }
            Rear.next=newnode;
            Rear=newnode;
        }
        //remove
        public static int Remove(){
            if(isEmpty()){
                return -1;
            }
            else{
                int data=Front.data;
                if(Front==Rear){
                    Front=null;
                    Rear=null;
                }
               else{
                Front=Front.next;
               }
                return data;
            }
        }
    }
    public static void main(String[]args){
     Queue C1=new Queue();
  
   C1.Add(5);
   C1.Add(6);
   while(!C1.isEmpty()){
   System.out.print(C1.Remove()+" ");
   }
    }
}
//Queue Using An Java Collection Framework

import java.util.*;
public class QueueB{
    public static void main(String[]args){
        Queue<Integer> Q1 = new LinkedList<>() ;    
        Q1.add(5);
        Q1.add(10);
        while (!Q1.isEmpty()) {
            System.out.print(Q1.remove()+" ");
        }
    }
}
//Queue Using An Two Stacks
import java.util.Stack;
public class Qu{
    public static class Queue{
         static Stack<Integer> S1=new Stack();
       static Stack<Integer> S2=new Stack();
    public static boolean isEmpty(){
        if(S1.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }
    //Add In An Queue
    public static void Add(int data){
        if(S1.isEmpty()){
            S1.add(data);
            return;
        }
        else{
            while(!S1.isEmpty()){
                S2.push(S1.pop());
            }
            S1.push(data);
            while(!S2.isEmpty()){
                S1.push(S2.pop());
            }
            return;
        }
    }
    //Remove An Elements From An Queue
    public static int pop(){
        if(S1.isEmpty()){
            return -1;
        }
        else{
            return S1.pop();
        }
    }
    //Peek
    public static int peek(){
        if(S1.isEmpty()){
            return -1;
        }
        else{
            return S1.peek();
        }
    }
}

    public static void main(String[]args){
      Queue Q1=new Queue();
     Q1.Add(1);
     Q1.Add(2);
     Q1.Add(3);
     Q1.Add(4);
     while(!Q1.isEmpty()){
        // System.out.print(Q1.pop()+" ");
     }
    }
}
Queue Using An Two Stacks-Method-II
import java.util.Stack;
public class Qu{
    public static class Queue{
     static Stack<Integer> S1 = new Stack<>();
    static Stack <Integer> S2 = new Stack<>();
     //IsEmpty
     public static boolean isEmpty(){
        if(S1.isEmpty() && S2.isEmpty()){
              return true;
        }
        else{
            return false;
        }
     }
    //Add
    public static void Add(int data){
        S1.add(data);
        return;
    }
    //Remove Function
    public static int remove(){
        if(S1.isEmpty() && S2.isEmpty()){
            return -1;
        }
        else{
            if(S2.isEmpty()){
                while(!S1.isEmpty()){
                    S2.push(S1.pop());
                }
                return S2.pop();
            }
            else{
                return S2.pop();
            }
        }
    }
    //peek
    public static int peek(){
        if(S1.isEmpty() && S2.isEmpty()){
            return -1;
        }
        else{
            if(S2.isEmpty()){
                while(!S1.isEmpty()){
                    S2.push(S1.pop());
                }
                return S2.peek();
            }
            else{
                  return S2.peek();
            }
        }
    }
    }
    public static void main(String[]args){
        Queue Q1=new Queue();
        Q1.Add(5);
        Q1.Add(1);
        Q1.Add(3);
        while(!Q1.isEmpty()){
            System.out.print(Q1.remove()+" ");
          }
    } 
}
Stack Using An Two Queue- pushO(n)
import java.util.*;
public class Qu{
    public static class Stack{
       static Queue<Integer> Q1 = new LinkedList();
       static Queue<Integer> Q2 = new LinkedList<>();
       //Add Function
       public static void add(int data){
        if(Q1.isEmpty()){
            Q1.add(data);
            return;
        }
        else{
            while(!Q1.isEmpty()){
                Q2.add(Q1.remove());
            }
            Q1.add(data);
            while (!Q2.isEmpty()) {
                Q1.add(Q2.remove());
            }
        }
       }
       //remove Function
       public static int pop(){
        if(Q1.isEmpty()){
            return -1;
        }
        return Q1.remove();
       }
       //peek Function
       public static int peek(){
        if(Q1.isEmpty()){
            return -1;
        }
        return Q1.peek();
       }
       //is Empty Function
       public static boolean isEmpty(){
        if(Q1.isEmpty()){
            return true;
        }
        return false;
       }
    }
    public static void main(String[]args){
        Stack S1 = new Stack();
        S1.add(5);
        S1.add(10);
       while(!S1.isEmpty()){
        System.out.print(S1.pop()+" ");
       }

    }
}
Stack Using An Two Ques
*/
import java.util.*;
public class Qu{
    public static class Stack{
    static Queue<Integer> Q1 = new LinkedList();
     static Queue<Integer> Q2 =new LinkedList();

     //IsEmty
     public static boolean isEmpty(){
        return Q1.isEmpty() && Q2.isEmpty();
     }
     //Add Function
     public static void push(int data){
        if(Q1.isEmpty() && Q2.isEmpty()){
            Q1.add(data);
            return;
        }
        else if(Q1.isEmpty()){
            Q2.add(data);
        }
        else{
            Q1.add(data);
        }
     }
     //remove//Pop function
     public static int pop(){
     if(isEmpty()){
        return -1;
     }
     else if(Q1.isEmpty()){
        while(!Q2.isEmpty()){
            int data=Q2.remove();
            if(Q2.isEmpty()){
                return data;
            }
            else{
                Q1.add(data);
            }
        }
     }
     else{
        while(!Q1.isEmpty()){
            int data=Q1.remove();
            if(Q1.isEmpty()){
                return data;
            }
            else{
                Q2.add(data);
            }
        }
     }
     return -1;
     }
     //peek Function
       public static int peek(){
     if(isEmpty()){
        return -1;
     }
     else if(Q1.isEmpty()){
        while(!Q2.isEmpty()){
            int data=Q2.remove();
            if(Q2.isEmpty()){
                Q1.add(data);
                return data;
            }
            else{
                Q1.add(data);
            }
        }
     }
     else{
        while(!Q1.isEmpty()){
            int data=Q1.remove();
            if(Q1.isEmpty()){
                Q2.add(data);
                return data;
            }
            else{
                Q2.add(data);
            }
        }
        
    }
    return -1;
}
   
    
     
    }
    //main Function
    public static void main(String[]args){
        Stack S1 = new Stack();
        S1.push(5);
        S1.push(10);
        S1.push(15);
        while(!S1.isEmpty()){
            System.out.print(S1.pop()+" ");
        }
       
    }
}