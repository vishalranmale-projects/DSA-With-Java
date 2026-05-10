/* 
public class Practice {
    public static int Sum(int n){
        if(n==0){
            return 0;
        }
        return n+Sum(n-1);
    }
    public static void main(String[]args){
        int n=10;
        System.out.print(Sum(n));
    }
    
}

Calculate An X^N
    
    public class Practice{
        public static int POW(int X ,int N){
            if(N==1){
                return X;
            }
            return X*POW(X,N-1);

        }
        public static void main(String[]args){
            int X =3;
            int N=999;
            System.out.print(POW(X, N));
        }
    }
//Print The Idx Array Where Key Is Matched Key Is 

public class Practice {
    public static void Print(int arr[],int idx,int key){
        if(idx== arr.length){
            return;
        }
        if(arr[idx]==key){
            System.out.print(idx+" ");
        }
        Print(arr,idx+1,key);
    }
    public static void main (String []args){
        int arr[]={1,3,4,5,5,3,5,};
        Print(arr,0,5);
    }
}
Print The Numbers

public class Practice {
    public static void Print(int Num)
    {
         String arr[]={"Zero","one","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
         if(Num==0){
            return;
         }
         int LastDigit=Num%10;
         Print(Num/10);
         System.out.print(arr[LastDigit]+" ");

         
    }
    public static void main(String[]args){
        int Num=2019;
        Print(Num);
    }

}
a^n With An Optimize Way

public class Practice{
    public static double PowerOptimize(int n,int x){
        if(n==1){
            return x;
        }
        double Calc=Math.pow(x, n/2);
        return Calc*Calc;
    }
    public static void main(String[]args){
        int n =4;
        System.out.print(PowerOptimize(n,8));
    }

}
    Reverse An String Using An Recursion

public class Practice{
    public static void StringRev(String Str,int Idx){
        if(Idx==Str.length()){
            return;
        }
        StringRev(Str,Idx+1);
        System.out.print(Str.charAt(Idx));
    }
    public static void main(String[]args){
        String Str= "Vishal";
        StringRev(Str,0);
    }
}

Array Is Sorted Or Not
*/
public class Practice{
    public static boolean SortedorNot(int arr[],int idx1,int idx2){
        if(idx2==arr.length){
            return true;
        }

        else if(arr[idx1]>arr[idx2]){
            return false;
        }
        return SortedorNot(arr,idx1+1,idx2+1);
    }
    public static void main(String[]args){
        int arr[]={1,2,3,4,6,7};
        System.out.print(SortedorNot(arr,0,1));
    }
}