package javaComplexNumber;

//This program shows how to calculate complex number in Java

public class ComplexNumb {

	public static void main(String[] args){
		Complex a = new Complex(2,3);
		Complex b = new Complex(0,1);
		Complex c = a.add(b);
		
		a.print();
		b.print();
		c.print();
	}
}

/* Output:
   C( 2.03.0i + 3.0i ) 
   C( 1.0i + 1.0i ) 
   C( 2.04.0i + 4.0i ) 
 * 
 */
 