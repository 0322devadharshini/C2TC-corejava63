package day8.Abstraction;
//parent class of all sub
public abstract class Shape {
    protected float area;
    //area of shape
    //abstract method 
	 abstract void calArea();
	 
	 //concrete method
	 void show()
	 {
		 System.out.println("Area of shape is "+area);
	 }
}
	 