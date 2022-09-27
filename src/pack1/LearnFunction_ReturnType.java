package pack1;

class LearnFunction_ReturnType {
	
//	Write a default method which does not return a value
	void method1() {
		System.out.println("Method 1");
		return;	}

//	Write a default method which returns Int value
	double method2() {
		System.out.println("Method 2 of Int return type");
		return 10.50; }

//	Write a default method which returns String value
	String method3() {
		System.out.println("Method 3 of String return type");
		return "Hello World"; }
	
//	Write a default method which returns boolean value
	boolean method4() {
		System.out.println("Method 4 of Boolean return type");
		return false; }
	
	public static void main(String[] args) {
		LearnFunction_ReturnType obj1= new LearnFunction_ReturnType();
		obj1.method1();
		double a = obj1.method2();
		System.out.println(a);
		String s = obj1.method3();
		System.out.println(s);
		boolean b = obj1.method4();
		System.out.println(b);
	}
}

