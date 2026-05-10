//Input/Output In Arrays
/*
 5

import java.util.*;
public class Arrays{
    public static void main(String []args){
        Scanner Sc = new Scanner (System.in);
        int Size=Sc.nextInt();
        int arr[]=new int[Size];
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=Sc.nextInt();
        }
        //Output The Array Elements
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]);
        }
    }
}

// Arrays Are Mutable
import java.util.*;
public class Arrays{
    public static void main(String []args){
        Scanner Sc = new Scanner (System.in);
        int Size=Sc.nextInt();
        int arr[]=new int[Size];
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=Sc.nextInt();
        }
        arr[0]=5;
        arr[1]=3;
        //Output The Array Elements
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]);
        }
    }
}
// Reversed An Array From An Given Array Index

import java.util.*;
public class Arrays{
    public static void ReversedArray(int arr[],int M){
        int end = arr.length-1;
        for(int i=M+1;i<=M+1/2;i++){

            // Sawp
            int temp=0;
            temp=arr[i];
            arr[i]=arr[end];
            arr[end]=temp;
            end--;

        }
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]);
        }


    }
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int Size=Sc.nextInt();
        


        int arr[]=new int[Size];
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=Sc.nextInt();
        }
        int ReversedIdx=Sc.nextInt();
      ReversedArray(arr, ReversedIdx );
     
    }
}
// Reapeated And Missing Elements


public class Arrays{
    public static void main(String[]args){
        int arr[]={2,1,2,3,4,5};
        int idx=0;
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]==arr[j]){
                    idx=i;
                }
            }
            }
            System.out.print(arr[idx]);
        }
    }

*/

// Product Of An Array Skip Itself
import java.util.*;
public class Arrays{
    public static void Prod(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            int Prod=1;
            for(int j=0;j<=arr.length-1;j++){
                if(j==i){
                    continue;
                }
                else{
                    Prod=Prod*arr[j];
                    
                }
            }
            System.out.print(Prod+ " ");
        }
    }
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int Size= Sc.nextInt();
        int arr[]= new int [Size];
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=Sc.nextInt();
         
        }
           Prod(arr);
    }
}