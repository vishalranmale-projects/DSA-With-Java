// Creating A String/I/P A String/ Output A String
/*
 
 
import java.util.*;
public class Strings{
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        String Str= new String("Vishal");
        System.out.print(Str);

    }
}
// Print The Length Of An String

public class Strings{
    public static void main(String[]args){
        String Str="Vishal";
        System.out.print(Str.length());
    }
}
// String Concatination
    

public class Strings{
    public static void main(String[]args){
        String Str1="Vishal";
        String Str2="Ranmale";
        String Str3 = Str1+Str2;
        System.out.print(Str3);
    }
}

// charAt() Function To Print The String Elements Individually

public class Strings{
    public static void main(String[]args){
        String Str="Vishal";
        for(int i=0;i<=Str.length()-1;i++){
            System.out.print(Str.charAt(i));
        }
    }
}
// Check The String Is Palindrome Or Not

import java.util.*;
public class Strings{
    public static String Palindrome(String Str){
        boolean Found = true;
        int StringEnd= Str.length()-1;
        for(int i=0;i<StringEnd/2;i++){
            if(Str.charAt(i)!= Str.charAt(StringEnd)){
                StringEnd--;
                Found=false;
                
                break;
               

            }
        }
        if(Found){
        return "Palindrome";
        }
        else{
            return "Not Palindrome";
        }
        
    }
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        String Str=Sc.nextLine();
       System.out.print( Palindrome(Str));
    }
}
// Find A Shoetest Path
    
import java.util.*;
public class Strings{
    public static double ShortestPath(String Str){
        // We Are Initially At Origin
        int X=0;
        int Y=0;
        for(int i=0;i<=Str.length()-1;i++){
            switch (Str.charAt(i)) {
                case 'N':
                Y++;
                    
                    break;
                case 'S':{
                    Y--;
                    break;


                }
                case 'E':{
                    X++;
                    break;
                }
                case 'W':{
                    X--;
                    break;
                }
            
                default:
                System.out.print("In- Valid Direction");
                    break;

                
            }
        }
      
        double ShortestPath= Math.sqrt(X*2)+Math.sqrt(Y*2);
        return ShortestPath;
    }
    public static void main(String[]args){
        Scanner Sc = new Scanner (System.in);
        String str = Sc.nextLine();
        System.out.print(ShortestPath(str));
    }
}

// Programe To Print The Substring Of An String
  
import java.util.*;
public class Strings{
    public static void SubString(String Str,int SI,int EI){
        for(int i=SI;i<=EI;i++){
            char STr=Str.charAt(i);
            System.out.print(Str.charAt(i));
        }
    }
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        String Str=Sc.nextLine();
        int SI=Sc.nextInt();
        int EI= Sc.nextInt();
       SubString(Str,SI,EI);
    }
}

//Programe To Check Whether The Which String Is Greater


import java.util.*;
public class Strings{
    public static String Largest(String Str1,String Str2){
        int Result=Str1.compareTo(Str2);
       if(Result == 0){
        return "Strings Are Equal";
       }
       else if(Result==1){
        return "String-1 Is Greater Than String-2";
       }
       else if (Result!=1){
        return "String-2 is Greater Than String-1";
       }
       return " In Valid";
    }
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        String Str1= Sc.nextLine();
        String Str2= Sc.nextLine();
       System.out.print( Largest(Str1,Str2));

    }
}

// For An Given String Convert The First Letter Into An Upper Case

import java.util.*;
public class Strings{
    public static StringBuilder Convert(String Str){
        StringBuilder Convert= new StringBuilder(" ");
        Convert.append(Character.toUpperCase(Str.charAt(0)));
        for(int i=0;i<=Str.length()-2;i++){
            if( Str.charAt(i) == ' '){
                Convert.append(Character.toUpperCase(Str.charAt(i+1)));

            }
            else{
                Convert.append(Str.charAt(i+1));
            }

        }
       
        return Convert;
    }
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        String Str= Sc.nextLine();
       System.out.print( Convert(Str));

    }

}


public class Strings{
    public static void main(String[]args){
        StringBuilder Str=new StringBuilder("VishaL");
        Str.insert(1,Character.toUpperCase(Str.charAt(1)));
        System.out.print(Str);
    }
}



//Programe To Compress An Given String

import java.util.*;
public class Strings{
    public static StringBuilder Compress(String Str){
        int itr=0;
        StringBuilder Str1= new StringBuilder(" ");
        for(int i=0;i<=Str.length()-1;i++){
            int counter=0;
            itr=counter;
            for(int j=i;j<=Str.length()-2;j++){
                if(Str.charAt(i)==Str.charAt(j)){
                    counter++;
                   

                }
             
                else{
                     Str1.append(Str.charAt(i));
            Str1.append(counter);
        break;
                   
                }
                i=j;
            }
           


        }
       Str1.append(Str.charAt(Str.length() - 1));
        Str1.append(itr+2);
             
        return Str1;
    }
    public static void main(String []args){
        Scanner Sc = new Scanner(System.in);
        String Str= Sc.nextLine();
        System.out.print(Compress(Str));
    }
}

// Programe To Print The LowerCase Vowels


import java.util.*;
public class Strings{
    public static int Lowercasevowels(String Str){
        int counter=0;
        for(int i=0;i<=Str.length()-1;i++){
            switch (Str.charAt(i)) {
                case 'a':{
                    counter++;
                    break;
                }
                 case 'e':{
                    counter++;
                    break;
                }
                 case 'i':{
                    counter++;
                    break;
                }
                 case 'o':{
                    counter++;
                    break;
                }
                 case 'u':{
                    counter++;
                    break;
                }
                    
                
            
                default:
                    break;
            }
        }
        return counter;
    }
    public static void main(String[] args){
        Scanner Sc = new Scanner (System.in);
        String Str = Sc.nextLine();
        System.out.print(Lowercasevowels(Str));
    }
}
// Programe To Check Whether The Strings Are Anagrams Or Not
*/
import java.util.*;
import java.util.Arrays;
public class Strings{
public static  boolean Anagram(String Str1,String Str2){
    boolean isAnagram=false;
    // Convert An String Into An Array
    char StrArr1[]=  Str1.toCharArray();
     char StrArr2[]=  Str2.toCharArray();
    
     Arrays.sort(StrArr1);


     Arrays.sort(StrArr2);
   

    String Str= Arrays.toString(StrArr1);
    String Str8 = Arrays.toString(StrArr2);

     
     if(Str.equals(Str8)){
        isAnagram=true;
     }
     else{
         isAnagram=false;
     }
     return isAnagram;

}


public static void main(String []args){
    Scanner Sc = new Scanner(System.in);
    String Str= Sc.nextLine();
    String Str2 = Sc.nextLine();
    System.out.print(Anagram(Str,Str2));
}
}



