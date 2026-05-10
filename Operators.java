/* 
Arithmatic Operator
1) Binary Operator

public class Operators {
    public static void main(String[]args){
        int A =5;
        int B=5;

        //Addition
        System.out.println(A+B);
        //Substraction
        System.out.println(A-B);
        //Multiplication
        System.out.println(A*B);
        //Division
        System.out.println(A/B);
        //Modulo
        System.out.println(A%B);




        //
    }
    
}

2)Unary Operator
1)Increament

public class Operators{
    public static void main(String[]args){
        //Pre-Increament
        int a=5;
        int b=++a;
        System.out.println(b);//6

        //Post-Increament
        int d=5;
        int c=d++;
        System.out.println(c);//5
        System.out.println(d);//6
        

    }
}

2)Decreament
  1)Pre-Decreament
    
public class Operators{
    public static void main(String[]args){
         // 1)Pre-Decreament
        int a=5;
        int b=--a;
        System.out.println(a);//4
        System.out.println(b);//4
        //2)Post-Decreament
        int c=5;
        int d=c--;
        System.out.println(c);//4
        System.out.println(d);//5
    }

    

}

Relational Operator

public class Operators{
    public static void main(String[]args){
        int A=10;
        int B=5;
        //1)Equal To Equal To
        System.out.println(A==B);//False
        //2)Not Equal To
        System.out.println(A!=B);//True
        //3)Greater Than
        System.out.println(A>B);//True
        //4)Less Than
        System.out.println(A<B);//False
        //5)Graeter Than OR Equal To
        System.out.println(A>=B);//True
        //6)Less Than Or Equal To
        System.out.println(A<=B);//False

        
    }

}

Logical Operator

public class Operators{
    public static void main(String[]args){
        int a=5,b=10;
        //1)Logicla And(&&)
        System.out.println(a>b && b>a);//false
        //2)Logical OR(||)
         System.out.println(a>b || b>a);//True
         //3)Logical Not
         System.out.println(!(a>b));//True



    }
}
Conditional Statement
1)If Else Statement
    
// Check The Greater Of Two Number
import java.util.*;
public class Operators{
    public static void main(String[]args){
        Scanner Sc=new Scanner(System.in);
        int a = Sc.nextInt();
        int b= Sc.nextInt();
        if(a>b){
            System.out.print("A is Greater");
        }
        else{
            System.out.print("B Is Greater");
        }
    }
}
// Print The Num Is Even Or Odd

import java.util.*;
public class Operators{
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        if(a%2==0){
            System.out.print("Even");
        }
        else{
              System.out.print("Odd");
        }
    }
}
    // Income Tax Calculator
    
import java.util.*;
public class Operators{
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int income=Sc.nextInt();
        if(income<500000){
            System.out.print("0% Tax");
        }
        else if(income>500000 && income<1000000){
            System.out.print("20% Tax");
        }
        else{
            System.out.print("30 % Tax");
        }
    }
}

// Check The Largest Of Three Numbers
    */

import java.util.*;
public class Operators{
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
          int b= Sc.nextInt();
          int c = Sc.nextInt();

          if(a>b){
            if(a>c){
                System.out.print("A Is Greater");
            }
          }
          if(b>a)
          {
            if(b>c){
                System.out.print("B Is Greater");
            }
          }
         if(c>a){
            System.out.print(" C Is Greater");
         }

        

    }
}