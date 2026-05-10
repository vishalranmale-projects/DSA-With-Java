// While Loop
/* 
1) Programe To Print Hellow World 100 Times

public class Loops {
    public static void main(String[]args){
        int Counter=0;
        while(Counter<100){
            System.out.println("Hellow World");
            Counter++;
        }
    }
    
}
2)Print The Numbers From 1 To 10


public class Loops{
    public static void main(String[]args){
        int Counter=1;
        while(Counter<=10){
            System.out.print(Counter+" ");
            Counter++;
        }
    }
}

3)Programe To Print The Numbers From An 1 To N

import java.util.*;
public class Loops{
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter An Range Of Num =");
        int N = Sc.nextInt();
        int Counter=1;
        while(Counter<=N){
            System.out.print(Counter+" ");
            Counter++;
        }
    }
}
4) Programe To Calculate The Sum of N Natural Numbers

import java.util.*;
public class Loops{
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int N = Sc.nextInt();
        int Sum=0;
        int Counter=1;
        while(Counter<=N){
            Sum=Sum+Counter;
            Counter++;
        }
        System.out.print("Sum is :"+Sum);
    }
}
// For Loop
1)For Loop To Print The Following Pattern
****
****
****
****

public class Loops{
    public static void main(String[]args){
        for(int i=1;i<=4;i++){
            System.out.println("****");
        }
    }
}
2) Print The Reverse Of An Number

import java.util.*;
public class Loops{
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int num= Sc.nextInt();
        for(int i= num;num>0;num=num/10){
            int LastDigit=num%10;
            System.out.print(LastDigit);

        }

    }
}

3)Programe To Store The Reversed Num To An Variable

import java.util.*;
public class Loops{
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int num= Sc.nextInt();
        int Reversed =0;
        for(int i=num;num>0;num=num/10){
            int Last_Digit=num%10;
            // Strore The Last Digit
            Reversed=(Reversed*10)+Last_Digit;
        }
        System.out.print(Reversed);
    }
}
// Do_While Loop
1)Programe To Print An Hellow World 10 Times

public class Loops{
    public static void main(String[]args){
        int itr=1;
        do{
            System.out.println("Hellow World");
            itr++;
        }
        while(itr<=10);
    }
}


// Programe Tp Keep Entering The Number Util The User Enters The Multiple Of 10
    
    import java.util.*;
    public class Loops{
        public static void main(String[]args){
            Scanner Sc = new Scanner(System.in);
            for(;true;){
                int num = Sc.nextInt();
                if (num%10==0){
                    continue;
                }
                else{
                    System.out.println(num);
                }

            }
        }

    }

// Programe To Check Whether The Num Is Entered By An User Is Prime Or Not


import java.util.*;
public class Loops{
    public static void main(String[]args){
        Scanner Sc = new Scanner (System.in);
        while(true){
            int num = Sc.nextInt();
            int counter=0;
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    counter++;
                }
            }
            if(counter==2){
                System.out.print("Prime");
            }
            else{
                System.out.print("Not Prime");
            }
        }
    }
}

// Assignment Questions

// Write A Programe To Read A Set Of Number And Print The Sum Of Even And odd Numbers

import java.util.*;
public class Loops{
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        while(true){
            int num = Sc.nextInt();
            //Number Separation
            int even_Sum=0;
             int odd_Sum=0;
             for(int i=num;num>0;num=num/10){
                int Last_Digit=num%10;
                if(Last_Digit%2==0){
                    even_Sum=even_Sum+Last_Digit;
                }
                else{
                      odd_Sum=odd_Sum+Last_Digit;

                }
             }
             System.out.println(even_Sum);
             System.out.println(odd_Sum);
        }
    }
}

// Programe To Find The Factorial Of An Num 

import java.util.*;
public class Loops{
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        while(true){
            int num= Sc.nextInt();
            int fact=1;
            for(int i=1;i<=num;i++ ){
                fact=fact*i;
            }
            System.out.println(fact);

        }
    }
} 

// Programe To Print The Multiplication Table of Num Entered By An User
    */

import java.util.*;
public class Loops{
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        while(true){
            int num=Sc.nextInt();
            for(int i=1;i<=10;i++){
                System.out.println(num*i);
            }
        }
    }
}

