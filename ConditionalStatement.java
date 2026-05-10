/* 
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
3)Turnary Operator
// Check Whether The Num Is Even Or Odd

public class ConditionalStatement{
    public static void main(String[]args){
        int num=4;
    String Result=(num%2==0)?"Even":"Odd";
    System.out.print(Result);
    }
}

// Check Whether The Student Is Pass Or Fail

import java.util.*;
public class ConditionalStatement{
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        String Result= (num>=33)?"Pass":"Fail";
        System.out.print(Result);

    }
}
// Switch Statement

import java.util.*;
public class ConditionalStatement{
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter Your Operation to Be Performed =");
        char ch = Sc.next().charAt(0);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        switch(ch){
            case '+':{
                System.out.print(a+b);
                break;
            }
            case '-':{
                System.out.print(a-b);
                break;
            }
            case '*':{
                System.out.print(a*b);
                break;
            }
            case '/':
            {
                System.out.print(a/b);
                break;
            }
            default:System.out.print("My Calculator Is Not Advanced");
            
        }
    }
}
  //Assignment Question
  1)Check Whether The Given Num Is Positive Or Negative  

import java.util.*;
public class ConditionalStatement{
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int A = Sc.nextInt();
        if(A>0){
            System.out.print("Positive");
        }
        else{
            System.out.print("Negative");
        }
    }
}

// Print The Fewer Or Not If Temp>100
    
import java.util.*;
public class ConditionalStatement{
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int temp = Sc.nextInt();
        if(temp>100){
            System.out.print("Fewer");

        }
        else{
            System.out.print("Not fewer");
        }
    }
}

Print The day Names Using Switch Statement
    
import java.util.*;
public class ConditionalStatement{
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int Num= Sc.nextInt();

        switch (Num) {
            case 1:System.out.println("Monday");
                
                break;
            case 2: System.out.print("Tuesday");
            break;
            case 3: System.out.print("Wednesday");
            break;
            case 4: System.out.print("Thursday");
            break;
            case 5: System.out.print("Friday");
            break;
            case 6 : System.out.print("Saturday");
            break;
            case 7: System.out.print("Sunday");
            break;
        
            default:
                break;
        }
    }
}
// Programe to Check The Given Year Is Leap Year Or Not
*/
import java.util.*;
public class ConditionalStatement{
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int year = Sc.nextInt();
        boolean Result= (year%100 !=0)?true:false;
        if((year%4==0 && Result ) || (year % 400==0))
            {
                System.out.print("Leap Year");
            }
            else{
                System.out.print("Not A Leap Year");
            }
        
        
}
    }





    


            
        


