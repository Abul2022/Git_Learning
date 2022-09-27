package Practice1;

/*3. Consturctors
a. Create a Class
b. Create a default constructor
c. Create a Constructor which accepts int arg
d. Create a Constructor which accepts String and double arg
e. Create a main function and call those Constructors one by one*/

class Constructors {
	Constructors(){
		System.out.println("Default Constructors");
	}
	Constructors(int a){
		System.out.println("It Accepts Int Argument");
	}
	Constructors(String s, double d){
		System.out.println("It Accepts String and double Arguments");
	}
	public static void main(String[] args) {
		Constructors obj1 = new Constructors();
		Constructors obj2 = new Constructors(10);
		Constructors obj3 = new Constructors("Hello", 20.50);
	}
}
