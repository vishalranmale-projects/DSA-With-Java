/*
 Programe To Print The Num From Num to 1
 
import java.util.*;
public class Recursion{
    public static void Print(int Num){
        System.out.print(Num+" ");
        if(Num==1){
            
            return;
        }
        Print(Num-1);
    }
    public static void main (String[]args){
        Scanner Sc = new Scanner(System.in);
        int num=Sc.nextInt();
        Print(num);
    }
}
// Programe To Calculate An Factorial

import java.util.*;
public class Recursion{
    public static int Fact(int Num){
        if(Num==1){
            return 1;
        }
        return Num*Fact(Num-1);
    }
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int Num= Sc.nextInt();
        System.out.print(Fact(Num));
    }
}
Programe To Calculate An Sum of Natural Numbers

import java.util.*;
public class Recursion{
    public static int Print(int Num){
        if(Num==0){
            return 0;
        }
        return Num+Print(Num-1);
    }
    public static void main(String[]args){
        System.out.print(Print(5));
    }
}
Programe To check Whether The Array Is Sorted Or Not

public class Recursion{
    public static boolean IsSorted(int arr[],int idx){
        if(idx== arr.length-1){
            return true;
        }
        if(arr[idx]>arr[idx+1]){
            return false;
        }
       return IsSorted( arr,idx+1);
       
    }
    public static void main(String[]args){
       int arr[]={1,2,3,4,5};
        System.out.print(IsSorted(arr, 0));
    }
}

Programe To Print The Index Of An First Occurance Of An Key
public class Recursion{
    public static int PrintFirst(int arr[],int key,int idx){
        if(idx==arr.length){
            return -1;
        }
        else if(key == arr[idx]){
            return idx;
        }
        return PrintFirst(arr, key, idx+1);
    }
    public static void main(String[]args){
        int arr[]={1,2,3,4,5};
        int key = 5;
        System.out.print(PrintFirst(arr,key,0));
    }
}

WAF To Print Last Occurence Of An Idx

public class Recursion{
    public static int Lastoccurence(int arr[],int key,int idx){
        if(idx==-1){
            return -1;
        }
        if(key==arr[idx]){
            return idx;
        }
      return Lastoccurence(arr,key,idx-1);
       
    }
    public static void main(String[]args){
        int arr[]={2,4,6,8,2,5};
        int key = 2;
        int idx=arr.length-1;
        System.out.print(Lastoccurence(arr, key, idx));
    }

    }
WAF To Calculate X^n

import java.util.*;
public class Recursion{
    public static int Pow(int X,int N){
        if(N==0){
            return 1;
        }
        return X*Pow(X,N-1);
    }
    public static int Fib(int Num){
        int Store=01;
         
        for(int i=1;i<=5;i++){
             int Sum=0;
           
            int Last_Digit=Store%10;
            Sum=i+Last_Digit;
            Store=(Store*10)+Sum;

        }
        return Store%10;
        
    }
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int x=Sc.nextInt();
        System.out.print(Fib(x));
    }
}

public class Recursion{
    public static int Func(int n){
        if(n==0||n==1){
            return n;
        }
        return Func(n-1)+Func(n-2);
    }

    public static void main(String[]args){
        System.out.print(Func(5));
    }
}
Problem No:11(Tilling Problem)


import java.util.*;
public class Recursion{
    public static int Floor(int n){
        if(n==0||n==1){
            return 1;
        }
        return Floor(n-1)+Floor(n-2);
    }
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int N= Sc.nextInt();
        System.out.print(Floor(N));

    }
}

/* 
// Practice Questions
Print The Idx Of An Occurence

import java.util.*;
public class Recursion{
    public static void Idx(int arr[],int idx,int key){
        if(idx==arr.length){
            return;
        }
        else if(arr[idx]==key){
            System.out.print(idx+" ");
        }
        Idx(arr,idx+1,key);
    }
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int arr[]={1,2,3,2,4,2};
       int idx=0;
        int Key = Sc.nextInt();
        Idx(arr,idx,Key);

    }
}

public class Recursion{
    public static void Removedupli(boolean arr[],int idx,String Str,StringBuilder Str1){
        if(idx==Str.length()){
            System.out.print(Str1);
            return ;

        }
       int idxb= Str.charAt(idx)-'a';
        if(arr[idxb]){

        }
        else{
            Str1.append(Str.charAt(idx));
            arr[idxb]=true;
        }
        Removedupli(arr,idx+1,Str,Str1);
        
         
    }
    public static void main(String []args){
        String Str="apnacollege";
        int idx=0;
        StringBuilder Str1=new StringBuilder();
        boolean Arr[]=new boolean[26];
        Removedupli(Arr,idx,Str,Str1);

    }
}
Problem No-13)Friends Pairing Problem

public class Recursion{
    public static int FrindsPair(int n){
        if(n==1||n==2){
        return n;
        }
        return FrindsPair(n-1)+FrindsPair(n-2)*(n-1);
    }
    public static void main(String[]args){
        int n=8;
        
        
        System.out.print(FrindsPair(n));

    }
}
*/

/*
Print The Number Of Spellings As Follows



import java.util.*;
public class Recursion{
    
    public static void PrintSpellings(int Store,int Counter1,int Counter2){
         if(Counter1==Counter2){
            return;
        }
        String arr[]={"Zero","one","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        int LastDigit=Store%10;
        
        System.out.print(arr[LastDigit]+" ");
       
        PrintSpellings(Store/10,Counter1,Counter2+1);
        
    }
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int Counter1=0;
        int Counter2=0;
        int Number=Sc.nextInt();
        int Store=0;
        for(int i=Number;i>0;i=i/10){
            Counter1++;
            int Last_Digit=i%10;
            Store=(Store*10)+Last_Digit;

        }
       

PrintSpellings(Store,Counter1,Counter2);
    }
}

    
/* 
Programe To Find An Length Of An String

public class Recursion{
    public static int FindLength(String Str,int IDx){
        if(IDx==Str.length()){
            return IDx;
        }
        return FindLength(Str, IDx+1);
    }
    public static void main(String[]args){
        String Str="Vishal";
        int IDx=0;
        System.out.print(FindLength(Str, IDx));
    }
}
Programe To Find Count Of An All Contigous Strings
*/
public class Recursion{
   public double myPow(double x, int n) {
        if(n==0 ){
            return 1;
        }
        if(n==1){
            return x;
        }
        return x*myPow(x,n-1);
        
    }
    public static void main(String[]args){
      double x=2;
      int n=10;
      myPow(x,n);
      System.out.print(myPow(x,n));
    }
}

/* 
public class Recursion{
    public static int PrintSubString(int idx1,int idx2,String Str,int Counter,int End){
        if(idx1 ==Str.length() && idx2==Str.length()){
            return Counter;
        }
       
         if(Str.charAt(idx1)==Str.charAt(idx2)){
            Counter++;

        }
        if(Str.charAt(idx1)==Str.charAt(End)){
            Counter++;
        }
        PrintSubString(idx1+1,idx2+1,Str,Counter,End-1);
        return -1;
    }
    public static void main(String []args){
        String Str="abcab";
        int End= Str.length()-1;
        System.out.print(PrintSubString(0, 0, Str, 0, End));
    }
}
    */