/*
1)Stack using An ArrayList
import java.util.*;
public  class StackB{
   public class stack{
     static ArrayList<Integer> list=new ArrayList();
      public static boolean isEmpty(){
         if(list.size()==0){
            return true;
         }
         else{
            return false;
         }
      }
      public static void push(int data){
         list.add(data);
         return ;
      }
      public static int pop(){
       if(isEmpty()){
         return -1;
       }
         int Top=list.get(list.size()-1);
         list.remove(list.size()-1);
         return Top;
      }

      public static int peek(){
         if(isEmpty()){
            return -1;
         }
           int Top=list.get(list.size()-1);
           return Top;
      }
   }
      public static void main(String[]args){
         Stack S1=new Stack();
         S1.push(5);
         S1.push(10);

         S1.push(4);
         S1.push(6);
         //Print An Stack Data items
         while(!S1.isEmpty()){
            System.out.print(S1.pop()+" ");
         }    
   }
}
2)Stack Using An LinkedList

public class StackB{
   public static class Node{
      int data;
      Node next=null;

      public Node(int data){
         this.data=data;
      }
   }
   public static class Stack{
   public static Node Head;
   //isEmpty
   public static boolean isEmpty(){
      if(Head==null){
         return true;
      }
      return false;

   }
   //push function
   public static void push(int data){
      Node newnode =new Node(data);
      if(Head==null){
        Head=newnode;
         return;
      }
      newnode.next=Head;
      Head=newnode;
   }
//peek
public static int peek(){
   if(isEmpty()){
      return -1;
   }
   return Head.data;

}
//POP
public static int pop(){
   if(isEmpty()){
      return -1;
   }
   int Top=Head.data;
   Head=Head.next;
   return Top;
}

   }
   public static void main(String[]args){
      Stack S1=new Stack();
      S1.push(6);
      S1.push(8);
      S1.push(10);
      S1.push(4);
     while(!S1.isEmpty()){
      System.out.print(S1.pop()+" ");
     }
   }
 }
3)Stack Using An JCF
import java.util.Stack;
public class StackB{
   public static void main(String[]args){
      Stack<Integer> s1=new Stack<>();
      s1.push(6);
      s1.push(5);
      while(!s1.isEmpty()){
System.out.print(s1.pop());
      }
   }

}
3)Push At An Bottom

import java.util.Stack;
public class StackB{
   //function To Add An Bottom
   public static void AddBottom(Stack<Integer> s1,int data){
      if(s1.isEmpty()){
         s1.push(data);
         return;
      }
      Integer rev=s1.pop();
      AddBottom(s1, data);
      s1.push(rev);
      return;

   }
   public static void main(String[]args){
      Stack<Integer> s1=new Stack<>();
      s1.push(5);
      s1.push(3);
      AddBottom(s1, 5);
      while(!s1.isEmpty()){
         System.out.print(s1.pop()+" ");
      }

   }
}
3)reverse An String Using An Stack

import java.util.Stack;
public class StackB{
   //function to rev An String
   public static String revString(String str){
      Stack<Character> s1=new Stack();
      for(int i=0;i<str.length();i++){
         s1.push(str.charAt(i));
      }
      String org=new String();
      while(!s1.isEmpty()){
         org=org+s1.pop();
         
      }
      return org;
   }
   public static void main(String[]args){
      String str="Vishal";
      System.out.print(revString(str));
   }
}
4)reverse An Stack 

import java.util.Stack;
public class StackB{
   //Push At bottom function
   public static void pushAtBott(Stack<Integer> s1,int data){
      if(s1.isEmpty()){
         s1.push(data);
         return;
      }
      int val=s1.pop();
      pushAtBott(s1,data);
      s1.push(val);

      
   }
   public static void reverse(Stack<Integer> s1){
   if(s1.isEmpty()){
      return;
   }
   int val=s1.pop();
   reverse(s1);
   pushAtBott(s1, val);



   }
   public static void print(Stack<Integer> s1){
      while(!s1.isEmpty()){
         System.out.print(s1.pop());
      }
   }
   public static void main(String[]args){
      Stack<Integer> S1=new Stack<>();
      S1.push(5);
      S1.push(10);
      S1.push(8);
      S1.push(12);
      reverse(S1);
      print(S1);

   }
}
5)Stock Span Problem O(n^2)

public class StackB{
   public static int Span(int []arr){
      int maxSpan=0;
      for(int i=0;i<arr.length;i++){
         int currspan=0;
         for(int j=i-1;j>=0;j--){
            if(arr[j]>=arr[i]){
            currspan=i-j;
            break;
          

            }
         }
         maxSpan=Math.max(maxSpan,currspan);


      }
      return maxSpan;
   }
   public static void main(String[]args){
      int arr[]={100,80,60,70,60};
      System.out.print(Span(arr));
   }
}
6)Next Greater Element Problem O(n^2)

public class StackB{
   public static int[] nextGreater(int arr[]){
      int nxt[]=new int[arr.length];
      for(int i=0;i<arr.length;i++){
         int curr=0;
         boolean found=false;
         for(int j=i;j<arr.length;j++){
            if(arr[j]>arr[i]){
               nxt[i]=arr[j];
               found=true;
               break;

            }

         }
         if(!found){
            nxt[i]=-1;
         }

      }
      return nxt;
   }
   public static void main(String[]args){
      int arr[]={6,8,0,1,3};
      int fin[]=nextGreater(arr);
      for(int i=0;i<fin.length;i++){
         System.out.print(fin[i]+" ");
      }
   }
}
7)Next Greater O(n)

import java.util.*;
public class StackB{
   public static int[] nextGreater(int []arr){
      Stack<Integer> S1= new Stack();
      int NextG[]=new int[arr.length];
      NextG[arr.length-1]=-1;
      S1.push(arr[arr.length-1]);
      for(int i=arr.length-2;i>=0;i--){
         while(!S1.isEmpty()&&arr[i]>=S1.peek()){
S1.pop();
         }
         if(S1.isEmpty()){
            NextG[i]=-1;
         }
         else if(arr[i]<S1.peek()){
            NextG[i]=S1.peek();
         }
         S1.push(arr[i]);
      }
      return  NextG;
   }
   public static void main(String[]args){
    int arr[]={4,6,2,9,4,9};
    int fin[]=nextGreater(arr);
    for(int i=0;i<fin.length;i++){
      System.out.print(fin[i] +" ");
    }
   }
}
8)Valid Paranthesis 
import java.util.*;
public class StackB{
   public static boolean Valid_Paranthesis(String s){
      Stack<Character> s1=new Stack();
      for(int i=0;i<s.length();i++){
        switch (s.charAt(i)) {
         case '(':{
            s1.push('(');
            break;

         }
          case '[':{
            s1.push('[');
            break;

         }
          case '{':{
            s1.push('{');
            break;
         }
         case ')':{
            if(s1.isEmpty()){
               return false;
            }
            else if(s1.peek()=='('){
               s1.pop();
               break;
            }
            else{
               return false;
            }
         }
          case '}':{
            if(s1.isEmpty()){
               return false;
            }
            else if(s1.peek()=='{'){
                s1.pop();
               break;
            }
            else{
               return false;
            }
         }
          case ']':{
            if(s1.isEmpty()){
               return false;
            }
            else if(s1.peek()=='['){
                s1.pop();
               break;
            }
            else{
               return false;
            }
         }
            
          
        }
      }
      return true;
   }
   public static void main(String[]args){
      String s="()[}";
      System.out.print(Valid_Paranthesis(s));
   }
}
9)Duplicate Parathesis

import java.util.Stack;
public class StackB{
   //Function To Check Whether An String 
   public static boolean isDulicate(String Str){
      Stack<Character> S1=new Stack<>();
      for(int i=0;i<Str.length();i++){
         if(Str.charAt(i)!=')'){
            S1.push(Str.charAt(i));
         }
         else{
            int count=0;
            while(S1.peek()!='('){
               S1.pop();
               count++;
            }
            if(count<1){
               return true;
            }
            S1.pop();
         }
      }
      return false;

   }
   public static void main(String[]args){
      String Str="((a+b)+(a+c))";
      System.out.print(isDulicate(Str));
   }
}
Assignment Question
1)Check An LL Palindrome Or Not

//Create An linked List
import java.util.LinkedList;
import java.util.Stack;
public class StackB{
   public static boolean ispalindrome(LinkedList<Character> L1){
      //Find An Mid
      Stack<Character> S1= new Stack<>();
      int mid=(L1.size()/2);
      for(int i=mid;i<L1.size();i++){
        S1.push(L1.get(i));
      }
      System.out.print(S1);
      int i=0;
      while(i<mid && !S1.isEmpty()){
         if(L1.get(i)!=S1.peek()){
            return false;
         }
         i++;
         S1.pop();
      }
      return true;
   }

   public static void main(String[]args){
      LinkedList<Character> list1= new LinkedList<>();
      Stack<Character> S1=new Stack();
      list1.add('A');
      list1.add('B');
      list1.add('B');
      list1.add('A');
      System.out.print(ispalindrome(list1)); 
   }
}
   */


