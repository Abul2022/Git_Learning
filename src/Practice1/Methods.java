package Practice1;

/*2. Functions
a. Create a Class
b. Create a default method
c. Create a method which has int returnType
d. Create a method which has double returnType
e. Create a method which accepts int arg
f. Create a method which accepts boolean and String arg and return type as String
g. Create a main function
e. Call all the methods and print the return value by capturing in a Variable
f. Pass the proper arguments and call the overloaded methods*/

class Methods {
	void m1() {
		System.out.println("Default Method");
	}
	int m2() {
		System.out.println("It has Int return type");
		return 10;
	}
	double m3() {
		System.out.println("It has Double return type");
		return 10.5;
	}
	void m1(int a) {
		System.out.println("It has void return type= " + a );
	}
	String m1(boolean a, String s) {
		System.out.println("It has String return type= "+ a+" "+s);
		return "Hello";
	}
	public static void main(String[] args) {
		Methods obj1 = new Methods();
		obj1.m1();
		System.out.println(obj1.m2());
		System.out.println(obj1.m3());
		obj1.m1(20);
		String d = obj1.m1(true, "Hello");
		System.out.println(d);
	}
}



