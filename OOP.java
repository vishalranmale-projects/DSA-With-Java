// OPPS
/*
 Class & Objects
 
class Animal{
  
  String Name;
  
  String Colour;
  
  int Legs;
  
  int Height;
  String Sound;
  

}
public class OOP{

  public static void main(String args[]){
    Animal Horse = new Animal();
    Horse.Colour= "White";
    Horse.Name="Balaram";
    Horse.Legs=4;
    Horse.Height=157;
    System.out.println(Horse.Colour);
    Animal Cat = new Animal();
    Cat.Name="Meow";
    System.out.print(Cat.Name);

  }
}

// Access Specifiers in Java

class Customer{
  public
  String Name;
  int Age;
  protected
  int AadharNo;
  private
  int Pin;
  int Salary;
  
}
public class OOP{
  public static void main(String[]args){
    Customer Vishal = new Customer();
    Vishal.Name="Vishal";
    Vishal.AadharNo=365958199;
    // Beacause Of Pin Is Private The Pin Is Not Accesible Directly
    Vishal.Pin=123;

  }
}

// Getters And A Setters In Java


class Pen{
  String Type;
  int tipSize;
  public static int  ReturnType(){
  
    return tipSize;
  }
}
public class OOP{
  public static void main(String[]args){
    Pen P1 = new Pen();
    P1.Type="Ball Pen";
    System.out.print(P1.ReturnType());


  }
}

Constructor In An Java
1)Deafault Constructor
2)Parametirized Constructor
3)Copy Constructor

//1)Deafault Contructor
//The Contructor Which Intialized By An Compiler It self When An Object Is Created And In this Case The Initialization Are Does Not Happened To An Class Properties
class Student{
  String name;
}
public class OOP{
  public static void main(String[]args){
    Student Vishal = new Student();
    // Student Is An Constructor Which will Be Automatically Created By Java Inside An Class
    
  }
}
2)Parameterized Constructor
In Parameterized Constructor Some Parameters Are Passed At The Object Creation
The Constructor Are Initialized By An User To Initialized An Class Attrributes Which Does Not Have Any Return Type

class Student{
  String Name;
  int Roll_No;
  Student(String Name2){
    Name=Name2;
  }
}
public class OOP{
  public static void main(String[]args){
    Student Vishal = new Student("Vishal");
    System.out.print(Vishal.Name);
  }
}
3) Copy Constructor

class Students{
  String Name;
  int Roll_No;

}
public class OOP{
  public static void main(String[]args){
    Students S1=new Students();
    S1.Name="Vishal";

    Students S2 = new Students(S1);
  }
}


// Destructurs

In Java The Destructures Are In Built In It
// Inheritance In Java

1)Single Inheritance
In A Single Inheritance The Parent Class Data Are Accessed By An Child Class

 class car{
  String Name;
  String Colour;
  int Tyres;
 }
 class Bus extends car{
  int Prise;
 }
 public class OOP{
  public static void main(String[]args){
    Bus B1= new Bus();
    B1.Name="MSRTC";
    B1.Colour="Orange";
    System.out.print(B1.Colour);

  }
 }
2) Multiple Inheritance
in An Multiple Inheritance The Single Bace Class Data Are Accessed By An Two Child Class But Java Does Not An Support An Multiple Inheritance Due To An Ambiguity Error

  
  }
3)Hierarchical Inheritance
In An Hierarchical Inheritance The Single Class Data Are Accesed By An Multiple Classes
  

  class Car{
    String Colour;
    int Tyres;

  }
  class Bus extends Car{
    String Model;
    int CC;

  }
  class Tempo extends Car{

  }
  public class OOP{
    public static void main(String []args){
      Tempo T1 = new Tempo();
     System.out.print( T1.Colour = "Orange");
    }
  }


Polymorphism 
In A Polymorphism One Rhing Can Be Perform A Multipole Thing
1)Compile Time Polymorphism 


public class OOP{
  public static int Add(int a,int b){
    return a+b;
  }
  public static float Add(float a ,float b){
    return a+b;
  }
  public static void main(String[]args){
    System.out.print(Add(5,6));

  }
}
  2)Run Time Polymorphism
  

class car{
  public static void Func(){
    System.out.print("Car Has A 4 Tyres");
  }

}
class Bus extends car{
   public static void Func(){
    System.out.print("Bus has A 6 Tyres");
  }


}
public class OOP{
  public static void main(String[]args){
    Bus B1 = new Bus();
    System.out.print(B1.Func());
   
  }
}
Static Keyword
Static keyword Are Used To To Make Value Of Any Variable Static Through All Object Once They Are Initialised By Any Of Object

class Pen{
   static String Colour;
  int tipSize;
}
public class OOP{
  public static void main(String[]args){
    Pen P1 = new Pen();
    P1.Colour="red";// Now Its Initialized So its Unchangable For An All Objects
    Pen P2 = new Pen();
   
    System.out.print(P2.Colour);
  }
}
*/
  



