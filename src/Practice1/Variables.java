package Practice1;

/*1.
a. Create a Project, Package, Class
b. Create a main function and declare and initialize a Integer Variable
C. Create Global Variables
	(static Integer Variable 'x' as 10
	 Nonstatic Integer Variable'y'as 20)"
d. Print the Variables in Main function in all different ways
e. Create a Local Integer Variable as "x' as 200
f. Print the Local Variable and Global variables in all different ways*/

class Variables {
	
	static int x = 10;
	int y = 20;

	public static void main(String[] args) {
		int a = 100;
		System.out.println(a);
		System.out.println(x);
		System.out.println(Variables.x);
		Variables obj1 = new Variables();
		System.out.println(obj1.y);
		int x = 200;
		System.out.println(a);
		System.out.println(x);
		System.out.println(obj1.x);
		System.out.println(Variables.x);
		System.out.println(obj1.y);
		
		
	}

}
