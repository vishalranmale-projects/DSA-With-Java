/*// Binary To An Decimal Conversion
 
import java.util.*;
public class Bit{
    public static double BinaryToDecimal(int Binar){
        int counter=0;
         double decimal = 0;
        for(int i=Binar;i>0;i=i/10){
           
            int last_Digit=i%10;
           
            decimal=decimal+Math.pow(2, counter)*last_Digit;
            counter++;
        }
       return decimal;
    }
    public static void main(String []args){
        Scanner Sc = new Scanner(System.in);
        int Binary = Sc.nextInt();
        BinaryToDecimal(Binary);
        System.out.print(BinaryToDecimal(Binary));
    }
}
// Decimal To Binary Conversion

import java.util.*;
public class Bit{
    public static int DecimalToBinary(int Dec){
        int Store=0;
        int Binary=0;

        for(int i= Dec;i>0;i=i/2){
            int Remainder= i%2;
            Store = (Store*10)+Remainder;

        }
        for(int j=Store;j>0;j=j/10){
           
            int Last_Digit=j%10;
            Binary=(Binary*10)+Last_Digit;

        }
        return Binary;
    }
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int Dec=Sc.nextInt();
        DecimalToBinary(Dec);
        System.out.print(DecimalToBinary(Dec));

    }
}

// Bitwise Operator
1)Bitwise And(&)
// If Both Are High Then And Then Only O/p Is High

public class Bit{
    public static void main(String []args){
        int A= 111;
        int B=110;
        System.out.print(A&B);
    }
}
2)Bitwise Or(|)
// If Both Are low Then And Only The  O/P Is Low If Anyone Is High Then The O/P Is High

public class Bit{
    public static void main(String[]args){
        int A= 1110;
        int B= 1101;
        System.out.print(A|B);
    }
}

3) XOR Operator
//If Both Are Same Then And Only Then O/p Is Low(0) Else O/p Is High(1)

public class Bit{
    public static void main(String[]args){
        int A=0101;
        int B=0110;
        System.out.print(A^B);
    }
}
4)Binary Ones Compliment

public class Bit{
    public static void main(String[]args){
        int A= 0101;
        System.out.print(~A);
    }
}
5) Bitwise Left Shift

public class Bit{
    public static void main(String args[]){
        int Num=4;
        System.out.print(Num<<2);
    }
}
6) Bitwise Right Shift

public class Bit{
    public static void main(String args[]){
        int Num=4;
        System.out.print(Num>>2);
    }
}
// Programe To Check Whether Bits Are Odd Or Even 

import java.util.*;
public class Bit{
    public static String Check(int Binary){
        int Even=Binary&0;
        int Odd=Binary & 1;
        if(Even==0  && Odd==0){
            return "even";

        }
        else{
            return "odd";
        }
    }
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int Num=Sc.nextInt();
        System.out.print(Check(Num));
    }
}
// Fetch The ith Bit in A Given BitSequence

import java.util.*;
public class Bit{
    public static int FethchBit(int Bits,int i){
        Bits=Bits&(1<<i);
        System.out.print(Bits);
        int Last_Digit= Bits%10;
        return Last_Digit;
    }
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int Bit = Sc.nextInt();
        int i= Sc.nextInt();
        FethchBit(Bit,i);
        
    }
}

import java.util.*;
public class Bit{

	public static StringBuilder reverseString(String str) 
	{
		StringBuilder Str = new StringBuilder("");
		int Spaces=0;
        Str.append(str.charAt(str.length()-1));
		for(int i=str.length()-2;i>=0;i--){
            if(str.charAt(i)==' '){
                Spaces++;
                if(Spaces>1){
                    Str.append(' ');
                }
                else{
                    Str.append(Str.charAt(i));
                }
            }
			
			
		}
		return Str;

		

	}
    public static void main(String []args){
        Scanner Sc = new Scanner(System.in);
        String Str= Sc.nextLine();

       
        reverseString(Str);
        System.out.print(reverseString(Str));
    }
}
    According The Value Of "i" That Bit Are Returned Back
    

import java.util.*;
public class Bit{
    public static int IthBit(int Bits,int i){
        int BitMask= 1<<i;
        int Result= BitMask&Bits;
        
        if(Result == 0){
            return 0;
        }
        else{
            return 1;
        }
        


    }
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int Bits= Sc.nextInt();
        int idx= Sc.nextInt();
        IthBit(Bits,idx);
        System.out.print(IthBit(Bits,idx));
    }
}

// Programe To Replace The ith Idx By One


import java.util.*;
public class Bit{
    public static int SetIthBit(int Bit,int idx){
        int BithMask= 1<<idx;
       
        return BithMask | Bit;

    }
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int Bits= Sc.nextInt();
        int idx= Sc.nextInt();
        System.out.print(SetIthBit(Bits, idx));
    }
}

public class Bit {    
    public static int largeOddNum(int arr[]) {
        int Largest = Integer.MIN_VALUE;
        //your code goes here
        for(int i=0;i<=arr.length-1;i++)
        {
            if(arr[i]%2==0){

            }
            else{
                if(arr[i]>Largest){
                    Largest=arr[i];
                }
            }
        }
        return Largest;
    }
    public static void main(String[]args){
      int arr[]={5,3,2,1};
        System.out.print(largeOddNum(arr));
    }
}
    */
    public class Bit{
        public static void main(String[]args){
            StringBuilder Str1 = new StringBuilder();
            boolean arr[]=new boolean[26];
            String Str= "apnacollege";
            for(int i=0;i<=Str.length()-1;i++){
                int idx=Str.charAt(i)-'a';
                if(!(arr[idx])){
                    Str1.append(Str.charAt(i));
                    arr[idx]=true;
                    

                }
               
            }
            System.out.print(Str1);
        }
    }