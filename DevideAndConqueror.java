/*
 Merge Sort
 
public class Devide{
public static void MergeSort(int arr[],int SI ,int EI){
    if(SI>=EI){
        return;
    }
    int Mid=(SI+EI)/2;
    MergeSort(arr,SI,Mid);
    MergeSort(arr,Mid+1,EI);
    Merge(arr, SI, EI, Mid);
}
public static void Merge(int arr[],int SI,int EI,int Mid){
    int i=SI;
    int j=Mid+1;
    int k=0;
    int temp[]=new int[EI-SI+1];
    while(i<=Mid && j<=EI){
        if(arr[i]<arr[j]){
            temp[k]=arr[i];
            i++;
            k++;


        }
        else{
            temp[k]=arr[j];
            k++;
            j++;

        }
    }
    while(i<=Mid){
        temp[k]=arr[i];
        k++;i++;

    }
    while(j<=EI){
        temp[k]=arr[j];
        k++;j++;
    }

    //Update In an Original Array
    for(int m=0, l=SI;m<=temp.length-1;m++,l++){
        arr[l]=temp[m];


    }
}

    // Function To Print That Array
    public static void Prinntarr(int arr[]){
        for(int b=0;b<=arr.length-1;b++){
            System.out.print(arr[b]+" ");
        }

    }
    public static void main(String[]args){
        int arr[]={2,3,7,1,5,9,1};
        MergeSort(arr,0,arr.length-1);
        Prinntarr(arr);

        
    }
}

*Quick Sort;


public class Devide{
    public static int Pivot(int arr[],int SI,int EI){
        int Pivot=arr[EI];
        int idx=SI-1;
        for(int i=SI;i<=EI;i++){
            if(arr[i]<=Pivot){
                idx++;
                //Swap
                int temp = arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;

            }
        }
        //For Idx
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==Pivot){
                return i;
            }
        }
        return -1;
    }
    public static void QuickSort(int arr[],int SI,int EI){
        if(SI>=EI){
            return;
        }
        int Pvtidx=Pivot(arr,SI,EI);
        // ForLeft Sorting Using Pivot Element
        QuickSort(arr,SI,Pvtidx-1);
        //For Right Sorting
        QuickSort(arr, Pvtidx+1, EI);
    }
    //For Printing An Array
    public static void Print(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[]args){
        int arr[]={2,4,2,45,21,};
        QuickSort(arr, 0, arr.length-1);
        Print(arr);
    }
}
Search In A Roatated And Sorted Array


public class Devide{
    public static void   Search(int arr[],int SI,int EI,int Key){
        if(SI>EI){
            return ;
        }

        int Mid=(SI+EI)/2;
        if(Key==arr[Mid]){
            System.out.print(Mid);
            return;
        }

      if(Key>=arr[SI] && Key <=arr[Mid] ){
        //Search In A 
        Search(arr,SI,Mid-1,Key);
      }
      if(Key<=arr[EI]&& Key<=arr[Mid]){
        //Search In An Right of An Mid
        Search(arr,Mid+1,EI,Key);
      }



    }
    public static void main(String[]args){
        int arr[]={4,5,6,7,1,0};
        Search(arr,0,arr.length-1,0);

}
}


Merge Sort Of An String Array


public class Devide{
    public static void Dev(String Str[],int SI,int EI){
        if(SI>=EI){
            return;

        }
        int Mid=(SI+EI)/2;
        //LeftDevide
        Dev(Str,SI,Mid);
        Dev(Str,Mid+1,EI);
        Merge(Str, SI, EI, Mid);
    }
    public static void Merge(String Str[],int SI,int EI,int Mid){
        String Temp[]=new String[EI-SI+1];
        int i=SI;//LeftString
        int j=Mid+1;//RightString
        int k=0;//Temparray
       
        while(i<=Mid && j<=EI){
             String Str1=Str[i];
        String Str2=Str[j];
            if(Str1.compareTo(Str2)>=0){
                Temp[k]=Str2;
                k++;
                j++;
            }
            else{
                Temp[k]=Str1;
                i++;
                k++;
            }

        }
        //For LeftSide
        while(i<=Mid){
            Temp[k]=Str[i];
            k++;
            i++;
        }
        //For Right Side
        while(j<=EI){
            Temp[k]=Str[j];
            k++;
            j++;
        }

        //For Copying An Array To An Original String
        for(int m=0,h=SI;m<=Temp.length-1;m++,h++){
            Str[h]=Temp[m];

        }
    }
    //Function To Print An String Array
    public static void Print(String Str[]){
        for(int l=0;l<=Str.length-1;l++){
            System.out.print(Str[l]+" ");
        }
    }
    public static void main(String[]args){
        String Str[]={"sun", "earth", "mars", "mercury"};
        Dev(Str,0,Str.length-1);
        Print(Str);
    }
}


    */
    public class Devide
    {

    
        public static int Majority(int arr[],int Size,int Counter,int idx)
        {
            if(idx>=arr.length)
            {
                return -1;
            }
            for(int i=0;i<=arr.length-1;i++)
            {
                if(arr[idx]==arr[i]){
                Counter++;
            }
        }
            if(Counter>=Size/2)
            {
               
                return arr[idx];
            }
            
          
            return Majority(arr,Size,0,idx+1);

        }
    
        public static void main(String[]args){
            int arr[]={2,3,3,3};
            System.out.print(Majority(arr,arr.length,0,0));
            
        }
    }