/*
Java Interface example.
This Java Interface example describes how interface is defined and
being used in Java language.
 
Syntax of defining java interface is,
<modifier> interface <interface-name>{
  //members and methods()
}
*/
 
//declare an interface
interface InterfaceExample{
 
  /*
  Syntax to declare method in java interface is,
  <modifier> <return-type> methodName(<optional-parameters>);
  IMPORTANT : Methods declared in the interface are implicitly public and abstract.
  */
 
  public void sayHello();
  }
/*
Classes are extended while interfaces are implemented.
To implement an interface use implements keyword.
IMPORTANT : A class can extend only one other class, while it
can implement n number of interfaces.
*/
 
public class IntExample implements InterfaceExample{
  /*
  We have to define the method declared in implemented interface,
  or else we have to declare the implementing class as abstract class.
  */
 
  public void sayHello(){
    System.out.println("Hello Visitor !");
  }
 
  public static void main(String args[]){
    //create object of the class
	IntExample javaInterfaceExample  = new IntExample();
	IntExample2 javaInterfaceExample2 = new IntExample2();
    //invoke sayHello(), declared in IntExample interface.
    javaInterfaceExample.sayHello();
    javaInterfaceExample2.sayHello();
  }
}

/*
OUTPUT of the above given Java Interface example would be :
Hello Visitor !
*/