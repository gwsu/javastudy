
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

/*
Classes are extended while interfaces are implemented.
To implement an interface use implements keyword.
IMPORTANT : A class can extend only one other class, while it
can implement n number of interfaces.
*/
 


public class IntExample2 implements InterfaceExample{
	  /*
	  We have to define the method declared in implemented interface,
	  or else we have to declare the implementing class as abstract class.
	  */
	 
	  public void sayHello(){
	    System.out.println("Hello Visitor2 !");
	  }
}
 
/*
OUTPUT of the above given Java Interface example would be :
Hello Visitor !
*/