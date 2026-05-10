/* 
import java.util.*;
public class Paterns {
    public static void Print(int Num){
        for(int i=Num;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int num= Sc.nextInt();
        Print(num);
    }
    
}

public class Paterns{
    public static void Print(int num){
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Print(6);
    }

}

import java.util.*;
public class Paterns{
    public static void Print(int Num){
        for(int i=1;i<=Num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);

            }
            System.out.println();

        }
    }
    public static void main(String[]args){
        Print(5);
    }
}

import java.util.*;
public class Paterns{
    public static void Print(int Num){
        for(int i=Num;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner Sc = new Scanner (System.in);
        int Num = Sc.nextInt();
        Print(Num);
    }
}

import java.util.*;
public class Paterns{
    public static void Print(int Num){
        for(int i=Num;i>0;i--){
            int Countr=1;
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Print(5);
    }
}
*/
public class Paterns{
    public static void Print(int num){
        for(int i=0;i<num;i++){

        
        // Print The Space
        for(int j=1;j<num-i;j++)
        {
            System.out.print(" ");
        }
        for(int k=0;k<i*2+1;k++ ){
            System.out.print("*");
        }

        
        System.out.println();
    }
}
public static void main(String[]args){
    Print(5);

}
}