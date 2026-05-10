/*O/P In Java 
public class Bacics{
    public static void main(String[]args){
        System.out.print("Hellow World");

    }
}
// O/P With NextLine

public class Bacics{
    public static void main(String[]args){
        System.out.println("Heloow World");
        System.out.print("Hellow World\nHellow World");
    }
}
// Print The Following Pattern
****
***
**
*

public class Bacics{
    public static void main(String[]args){
        System.out.print("****\n***\n**\n*");
    }
}
// Sum Of Two Numbers

public class Basics{
    public static void main(String args[]){
        int a=5;
        int b=10;
        int sum =a+b;
        System.out.print(sum);
    }
    
}

// Input From User

import java.util.*;
public class Basics{
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        //Int
        int a =Sc.nextInt();
        System.out.println(a);
        //Float Input
        float B= Sc.nextFloat();
        System.out.print(B);
        //String With Single Word
        String Str = Sc.next();
        System.out.print(Str);
        //String With A Whole Sentence
        String Str1=Sc.nextLine();
        System.out.print(Str1);
      
    }
}
// Sum Of Two Variable Entered From User

import java.util.*;
public class Basics{
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int a= Sc.nextInt();
        int b = Sc.nextInt();
        int Sum= a+b;
        System.out.print(Sum);

    }
}

// Prod Of Two Numbers
    
    import java.util.*;
    public class Basics{
        public static void main(String[]args){
            Scanner Sc = new Scanner(System.in);
            int a = Sc.nextInt();
            int b=  Sc.nextInt();
            int sum= a*b;
            System.out.print(sum);

        }
    }

// Area Of An Circle


import java.util.*;
public class Basics{
    public static void main(String[]args){
        Scanner Sc= new Scanner(System.in);
        int r=Sc.nextInt();
        double Area= 3.14*r*r;
        System.out.print(Area);

    }
}
    
    public class Basics{
        public static void main(String[]args){
            float a= 3.14f;
        }
    }
// Type Casting
1)Implicit TypeCasting

public class Basics{
    public static void main(String[]args){
        int a =10;
        float b= a;
        System.out.println(b);
        System.out.print(10/2.5);
    }
}

2)Explicit Type Casting

public class Basics{
    public static void main(String[]args){
        float a=12.5f;
        int b= (int)a;
        System.out.println(b);
        int ch=97;
        System.out.print((char)ch);
    }
}

// Programe To Calculate The Avg Of 3 Numbers

import java.util.*;
public class Basics{
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b= Sc.nextInt();
        int c = Sc.nextInt();
        int Sum=a+b+c;
        int avg=Sum/3;
        System.out.print(avg);

    }
}
    // Area Of Square

import java.util.*;
public class Basics{
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int side1= Sc.nextInt();
        int side2= Sc.nextInt();
        int area=side1*side2;
        System.out.print(area);

    }

    
}

// Return The Total Cost Of Items With 18%GST
*/

import java.util.*;
public class Basics{
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enetr The Cost Of Pencil=");
        int Pencil= Sc.nextInt();
        System.out.print("Enetr The Cost Of PEN=");
        int pen = Sc.nextInt();
        System.out.print("Entr The Cost of Erazer=");
        int Erazer= Sc.nextInt();
        int TotalCost=(Pencil+pen+Erazer);
        System.out.print("Total Cost With 18% GST="+(TotalCost+0.18));

    }
}



