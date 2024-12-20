package javaprograms;

public class Tenaryoperators {
public static void main(String[] a) {
	//Ternary operator
	//condition?if true: if false
	//max of three numbers
	int m1=20,n1=10,o1=30, result6;
	//Using ternary operator
	result6=((m1>n1)?(m1>n1)?n1:o1:(m1>n1)?m1:n1);
	System.out.println("max of 3 numbers"+result6);
}
}