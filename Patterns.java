/*
 1)Programe To Print The Following The Star Pattern
 *
 **
 ***
 ****
 
public class Patterns{
    public static void main(String[]args){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

2)Print The Folowing Star 
****
***
**
*

public class Patterns{
    public static void main(String[]args){
        for(int i=4;i>0;i--){
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
3)Programe To Print The Following Pattern
1
12
123
1234
    
public class Patterns{
    public static void main(String[]args){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
}
}
// Programe To Print The Following Pattern
A
BC
DEF
GHIJ

public class Patterns{
    public static void main(String[]args){
        int Num = 65;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)Num);
                Num++;
            }
            System.out.println();
        }
    }
}
// Programe To Print The Following Pattern
*****
*   *
*   *
*****

import java.util.*;
public class Patterns{
    public static void Pattern(int n ){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 ||i==n || j==n|| j==1){
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        Pattern(num);
    }
}
    // Programe To Print The Following Pattern
       *
      **
     ***
    ****
    
import java.util.*;
    public class Patterns{
        public static void Pattern(int n){
            for(int i=1;i<=n;i++){
                // Printing Space
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");

                }
                //Printing Stars
                for(int k=1;k<=i;k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        public static void main(String[]args){
            Scanner Sc = new Scanner(System.in);
            int num= Sc.nextInt();
            Pattern(num);

        }
    }
    // Programe To Print The Following Pattern
    12345
    1234
    123
    12
    1
        

import java.util.*;
public class Patterns{
    public static void Pattern(int n){
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        Pattern(num);
    }
}
    // Programe To Print The Following Pattern
    1
    2 3
    4 5 6
    7 8 9 10
    11 12 13 14 15

import java.util.*;
public class Patterns{
    public static void Pattern(int num){
        int Number = 1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(Number);
                Number++;
            }
            System.out.println();
        }
    
    }
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        Pattern(num);
    }
}

// Programe To Print The Following Pattern
1
01
010
1010
10101
    
import java.util.*;
public class Patterns{
    public static void Pattern(int num){
        int Track=1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                if(Track%2==0){
                    System.out.print(0);
                }
                else{
                    System.out.print(1);
                }
                Track++;
                
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int num= Sc.nextInt();
        Pattern(num);
    }
}

//programe To Print The Following Pattern
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *

    import java.util.*;
    public class Patterns{
        public static void Pattern(int num){
            int itr=num;
            int itr2=num;
            int itr3=num;
            int counter=0;
            for(int i=1;i<=num;i++){
                //for 
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                // For Print The Space
                for(int k=1;k<=itr*2-2;k++){
                    System.out.print(" ");
                }
                itr--;
                
                // for
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            // For Another Pattern
            /* ********
               ***  ***
               **    **
               *      *
            
            for(int i=itr3;i>0;i--){
                // Printing First Stars
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                // Printing Space's
                for(int b=1;b<=counter*2;b++){
                    System.out.print(" ");
                }
                counter++;
                // Printing The Last *
                for(int k=1;k<=i;k++){
                    System.out.print("*");
                }
                System.out.println();

            }
        }
        public static void main(String[]args){
            Scanner Sc = new Scanner(System.in);
            int num = Sc.nextInt();
            Pattern(num);
        }
    }


// Programe To print The Following Pattern
    *****
   *****
  *****
 *****
*****
  

  import java.util.*;
  public class Patterns{
    public static void Patterns(int n){
        for(int i=n;i>0;i--){
            // Printing The Space
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            
            //Printing The Stars
            for(int k=1;k<=n+1;k++){
               System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        Patterns(n);
    }
  }

// Programe to Print The Following Pattern
   *****
  *   *
 *   *
*****



    

import java.util.*;
  public class Patterns{
    public static void Patterns(int n){
        for(int i=n;i>0;i--){
            // Printing The Space
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            
            //Printing The Stars
            for(int k=1;k<=n+1;k++){
                if(i==1 || i==n || k==1 ||k==n+1){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        Patterns(n);
    }
  }

  Programe To Print The Following Pattern
     *
    ***
   *****
  ********
 *********
  ********
   *****
    ***
     *
*/    
import java.util.*;
public class Patterns{
    public static void Pattern(int Lines){
        int Tracker=1;
        for(int i=Lines;i>0;i--){
            // For Printing The Space
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");

            }
            //For Print The Stars
            for(int k=1;k<=Tracker;k++){

                System.out.print("*");
            }
            
            Tracker=Tracker+2;
            
            System.out.println();
        }
        //For Print The Remaining Part
        for(int i=Lines;i>0;i--){
            //For Print The Space
            for(int j=1;j<=Lines-i;j++){
                System.out.print(" ");
            }
            // Print The "*"
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");

            }
            System.out.println();
        }

        }

    

    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int num=Sc.nextInt();
        Pattern(num);
    }
}



    

      