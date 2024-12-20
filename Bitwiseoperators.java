package javaprograms;

public class Bitwiseoperators {
public static void main(String[] a) {
	//Bitwise Operator
	//&-bitwise and
	//|-bitwise or
	//^-bitwise xor
	//~-bitwise complement
	int d=0b010;
	int c7=0b1000;
	System.out.println("d&c7:"+(d&c7));
	System.out.println("d|c7:"+(d|c7));
	System.out.println("d^c7:"+(d^c7));
	System.out.println("d~c7:"+(~d));
}
}