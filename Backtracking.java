/* 
public class Backtracing {
    public static void BacktracingArra(int arr[],int Value,int idx){
        if(idx==arr.length){
            return;
        }

        arr[idx]=Value;
        BacktracingArra(arr, Value+1, idx+1);
        // Backtracking Ho Rahi Hain Yahan
        arr[idx]=arr[idx]-2;
        if(idx==0){
            for(int i=0;i<=arr.length-1;i++){
                System.out.print(arr[i]);
            }
        }


    }
    public static void main(String[]args){
        int arr[]=new int [5];
        int Value=1;
        int idx=0;
        BacktracingArra(arr,Value,idx);
    }
    
}
Print An Subsets Of An String


import java.util.concurrent.SubmissionPublisher;

public class Backtracking{
    public static void Subsets(String Str, StringBuilder Subsets,int i){
        if(i==Str.length()){
            return;
        }
        // If Yes
        Subsets(Str,Subsets.append(Str.charAt(i)),i+1);
        //if No
        Subsets(Str,Subsets,i+1);

        System.out.print(Subsets);
        System.out.println();
    }
    public static void main(String[]args){
        String Str="abc";
        StringBuilder Subsets=new StringBuilder();
        Subsets(Str,Subsets, 0);
    }
}

import java.util.Arrays;
public class Backtracking{
    public static void LongestSubString(String Str){
        StringBuilder Str2[]=new StringBuilder[Str.length()];
           StringBuilder Str3=new StringBuilder();

        // Calculate An Substring
        for(int i=0;i<=Str.length()-1;i++){
            for(int j=0;j<=i;j++){
                Str3.append(Str.charAt(j));
                Str2[i]=Str3;
                

            }
        }
        StringBuilder Palindrome[]=new StringBuilder[Str2.length];
        //Finding The Palindromic String
        for(int i=0;i<=Str2.length-1;i++){
            int idx=0;
            StringBuilder Str4= new StringBuilder();
            Str4=Str2[i];
            int End=Str4.length()-1;
            // Checking Palindrome Or Not
            boolean found=true;
            for(int j=0;j<=End/2;j++){
                if(Str4.charAt(j)!= Str4.charAt(End)){
                    found=false;
                    End--;
                }
            }
            if(found){
                Palindrome[idx]=Str4;
                idx++;
            }

        }
        Arrays.sort(Palindrome);
        System.out.print(Palindrome[Palindrome.length-1]);
        

       
        
        
    }
    public static void main(String[]args){
        String Str="babad";
        LongestSubString(Str);
    }
}
switch (key) {
    case value:
        
        break;

    default:
        break;
}
        */


public class Backtracking{
    public static void main(String[]args){
        int Maxsum=0;
        int height[]={2,4,2,2,2};
        int LeftMax[]=new int[height.length];
        
        int RightMax[]=new int[height.length-1];
       
        int Maxl=Integer.MIN_VALUE;
        int MaxR=Integer.MIN_VALUE;

        //Calculation Of An LeftMax
        for(int i=0;i<=height.length-1;i++){
            if(height[i]>=Maxl){
                Maxl=height[i];
            }
            LeftMax[i]=Maxl;
        }
        // Calculation of An RightMax
        for(int i=height.length-1;i>0;i--){
            if(height[i]>=MaxR){
                MaxR=height[i];
            }
            RightMax[i]=MaxR;
        }

        for(int i=0;i<=height.length-1;i++){
            // Calculating An Min Of Both To Detect An Watre Heibg
            int Min=Math.min(LeftMax[i], RightMax[i]);
            int CurrentWater=Min-height[i];
            Maxsum=Maxsum+CurrentWater;
        }
        return Maxsum;
       


    }

}