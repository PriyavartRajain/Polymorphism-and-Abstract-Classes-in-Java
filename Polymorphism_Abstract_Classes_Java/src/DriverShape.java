

public class DriverShape {

	public static void main(String[] args) {
		Shape s1 = new Circle(5.5,"Green",false);		//Upcast Circle to Shape
		
		/*
		 * When an overridden method is called through the superclass reference, 
		 * Java determines which version ( superclass/subclass ) of that method
		 *  is to be executed based upon the type of the object being referred 
		 *  to at the time the call occurs. 
		 *  Thus, this determination is made at the runtime. 
		 *
		 *	Upcasting gives us the flexibility to access the parent class members 
		 *  but it is not possible to access all the child class members using this feature. 
		 *  Instead of all the members, we can access some specified members of the child class. 
		 *  Particularly, we can access the overridden methods in the subclass.
		 *  But we can access all the parent class members and methods.
		 *  
		 *  For instance a circle is a shape. (Circle is subclass and Shape is superclass)
		 *  So you can create an object of circle using Shape reference, 
		 *  because circle is a type of Shape
		 *  
		 */
		
		System.out.println(s1);
		System.out.println(s1.getArea());		       // We are able to access getArea because it is overriden by subclass
		System.out.println(s1.getPerimeter());
		System.out.println(s1.getColor());
		System.out.println(s1.isFilled());
//		System.out.println(s1.getRadius());			  We can only access methods that are overriden by subclass, Circle
									  /* The method getRadius() is 
									     undefined for the type Shape, 
									     i.e radius is not defined for generic type Shape
									  */
													

													
//		Circle c1 = s1;					               Downcasting from shape to Circle
									       // Type mismatch: cannot convert from Shape to Circle
		
		Circle c1 = (Circle)s1;
		System.out.println();
		System.out.println(c1);
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		System.out.println(c1.getColor());
		System.out.println(c1.isFilled());
		System.out.println(c1.getRadius());			// We can now access getRadius() because c1 is of type Circle
								        // and getRadius is defined for type Circle
		
		
//		Upcast Rectangle to Shape
		Shape s3 = new Rectangle(1.0,2.0,"yellow",false);			
		System.out.println();
		System.out.println(s3);
		System.out.println(s3.getArea());
		System.out.println(s3.getPerimeter());
		System.out.println(s3.getColor());
//		System.out.println(s3.getLength());		       getLength() is not defined for Shape
								       // Can only access methods that are overriden by subclass, Rectangle
		
//		Downcasting from shape to rectangle
		Rectangle r1 = (Rectangle)s3;
		System.out.println();
		System.out.println(r1);
		System.out.println(r1.getArea());
		System.out.println(r1.getPerimeter());
		System.out.println(r1.getColor());
		System.out.println(r1.getLength());
		

//		Upcast Square to Shape
		Shape s4 = new Square(6.6);				
		System.out.println();
		System.out.println(s4);
		System.out.println(s4.getArea());
		System.out.println(s4.getColor());
//		System.out.println(s4.getSide());			Get side is not defined for Shape
		
		
/* 		Take note that we downcast Shape s4 to Rectangle(instead of Square), 
  		which is a superclass of Square, 
		Note: We can directly downcast shape to square as well
*/
		Rectangle r2 = (Rectangle)s4;			
		System.out.println();
		System.out.println(r2);
		System.out.println(r2.getArea());
		System.out.println(r2.getColor());
//		System.out.println(r2.getSide());			Get side is not defined for Rectangle
		System.out.println(r2.getLength());
	
		
// 		Downcast Rectangle r2 to Square
		
		System.out.println();
		Square sq1 = (Square)r2;
		System.out.println(sq1);
		System.out.println(sq1.getArea());
		System.out.println(sq1.getColor());
		System.out.println(sq1.getSide());
		System.out.println(sq1.getLength());	
	
	}

}
