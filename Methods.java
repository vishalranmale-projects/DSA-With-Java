/*
 // Method To Print The Hellow World
 
public class Methods{
    public static String PrintHelo(){
        return "Hellow World";
    }
   public static void main(String[]args){
   System.out.print( PrintHelo());
   }
}

// Method To Calculate An Sum Of Two Nubers 


import java.util.*;
public class Methods{
    public static int Sum(int a , int b){
        int Sum=a+b;
        return Sum;
    }
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        System.out.print(Sum(a,b));
    }
}

// Programe to Find The Product Of Two Variables

import java.util.*;
public class Methods{
    public static int Prod(int a , int b){
        int prod= a*b;
        return prod;
    }
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
       System.out.print( Prod(a,b));
    }
}

//Function To Calculate The Factorial Of Number
    
import java.util.*;
public class Methods{
    public static void Fact(int n){
        int Fact=1;
        for(int i=1;i<=n;i++){
            Fact=Fact*i;
        }
        System.out.print(Fact);
    }
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int n= Sc.nextInt();
        Fact(n);
        int j= Sc.nextInt();
        Fact(j);
    }
}

// Programe To Calculate An Bionomial Coefficiant

import java.util.*;
public class Methods{
    public static double Bionomial(int n ,int r){
        int Factn=1;
        int Factr=1;
        for(int i=1;i<=n;i++){
            Factn=Factn*i;
        }
        for(int i=1;i<=r;i++){
            Factr=Factr*i;
        }
        int n_r=n-r;
        int Factn_r=1;
        for(int i=1;i<=n_r;i++){
            Factn_r=Factn_r*i;
        }
        double Bionomial= Factn/(Factr*(Factn_r));
        return Bionomial;
    }
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int n= Sc.nextInt();
        int r = Sc.nextInt();
        Bionomial(n,r);
        System.out.print(Bionomial(n,r));
    }
}

// Function Overloading
1) Function Overloading According To An Parameters
public class Methods{
    public static void Func(int a,int b){
        int Sum = a+b+12;
        System.out.print(Sum);
      
    }
    public static void Func(double a , double b){
       double Sum= a+b;
       System.out.print(Sum);
    }
    public static void main(String[]args){
       Func(5.1,4.2);
       
    }
}

2) Function Overloading According To An Data Types


import java.util.*;
public class Methods{
    public static int sum(int a,int b){
    return a+b+12;
    }
    public static double sum(double a,double b){
        return a+b;
    }
    public static void main(String[]args){
       
        
        System.out.print(sum(5.1,3.2));


    }
}
// Programe To Check Whether The Num Is Prime Or Not

import java.util.*;
public class Methods{
    public static boolean isprime(int n){
        int counter=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                counter++;

            }
        }
        if(counter==2){
            return true;
        }
        else{
            return false;
        }

    }
    

    // Print The All The Primes In A Given Range
    
    
        public static void PrimeInRange(int Range){
            for(int i=1;i<=Range;i++){
                if(isprime(i)){
                    System.out.print(i+ " ");
                }
               
              
            }
        }
        public static void main(String[]args){
            Scanner Sc= new Scanner(System.in);
            int Range= Sc.nextInt();
            PrimeInRange(Range);

            
        }
    }
// Conversion Of Binary To Decimal

import java.util.*;
public class Methods{
    public static double  BinaryToDec(int Binary){
        int counter=0;
        double Decimal=0;
        for(int i=Binary;i>0;i=i/10){
            int Last_Digit=i%10;
            
         Decimal+=Last_Digit*Math.pow(2,counter);
         counter++;
        }
        return Decimal;
    }
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int Binary=Sc.nextInt();
        System.out.print(BinaryToDec(Binary));
    }

}

// Conversion To An Decimal To Binary

import java.util.*;
public class Methods{
    public static void DecimalToBinary(int Decimal){
        int store=0;
        for(int i=Decimal;i>0;i=i/2){
            int Remainder=i%2;
            //Store The Remainder
         
          store=(store*10)+Remainder;
        }
        for(int i=store;i>0;i=i/10){
            int Last_Digit= i%10;
            System.out.print(Last_Digit);
        }
    }
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int Dec=Sc.nextInt();
        DecimalToBinary(Dec);
    }

    


}
    Assignment Question
    1)Write a Java method to compute the averageof three numbers

import java .util.*;
public class Methods{
    public static int Average(int a ,int b,int c){
        int Average=(a+b+c)/3;
        return Average;


    }
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int c = Sc.nextInt();
        Average(a,b,c);
        System.out.print(Average(a,b,c));
    }
}
2)WriteamethodnamedisEventhatacceptsanintargument.Themethodshouldreturntrueiftheargumentiseven,orfalseotherwise.Alsowriteaprogramtotestyourmethod

import java.util.*;
public class Methods{
    public static boolean isprime(int a){
        if(a%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        isprime(a);
        System.out.print(isprime(a));
    }
}
3)Write a Java program to check if a number is a palindrome in Java?

import java.util.*;
public class Methods{
public static String Palindrome(int num){
    int Original=num;
    int Store=0;
    for(int i=num;i>0;i=i/10){
        int Last_Digit=i%10;
         Store= (Store*10)+Last_Digit;
    }
    if(Store==Original){
        return "Palindrome";

    }
    else{
        return "Not Palindrome";
    }
}

public static void main(String[]args){
    Scanner Sc = new Scanner(System.in);
    int Num= Sc.nextInt();
System.out.print(Palindrome(Num));
   
}
}
// Programe To Print The Sum Of An Digits In An Integers
*/
import java.util.*;
public class Methods{
    public static int SumofDigits(int Num){
        int Sum=0;
        for(int i= Num;i>0;i=i/10){
            int Last_Digit=i%10;
            Sum=Sum+Last_Digit;
        }
        return Sum;
    }
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int Num= Sc.nextInt();
        System.out.print(SumofDigits(Num));
    }
}


