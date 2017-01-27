package Practise;

public class ASMDClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(2,5));
		System.out.println(sub(2,5));
		System.out.println(mul(2,5));
		System.out.println(div(2,5));

	}
public static int add(int i, int j){
	int result= i+j;
	return result;
}
public static int sub(int i, int j){
	int result= i-j;
	return result;
}
public static int mul(int i, int j){
	int result= i*j;
	return result;
}
public static int div(int i, int j){
	int result= i/j;
	return result;
}
}